# Corvane scenario — review passes, deploy fails, a human decides

The demo beat from Kris's Gartner talk, reproduced on this repository.

## Why this change and not another

`k8s/petclinic.yml` pins the image to an explicit tag instead of floating on `:latest`.
That is textbook good practice, it reads as an improvement, and a reviewer will approve it.

The tag does not exist. Only `latest`, `last` and a sha digest are published for
`dsyer/petclinic`, so the pod lands in `ImagePullBackOff`, never becomes ready, and
`kubectl wait --for=condition=ready pod -l app=petclinic --timeout=180s` times out after
three minutes. The deploy workflow goes red.

That is the whole point of the scenario: **static review cannot catch this.** Nothing in
the diff is wrong. Only the cluster knows the tag is missing.

## The chain

    PR touching k8s/**
      ├─▶ Code Review .................... approves, correctly
      └─▶ Deploy and Test Cluster (GH Actions)
             │ fails
             ▼
          Deploy Gate ..................... diagnoses, verdict `human required`
             │ automation.finished
             ▼
          Human Approval - Failed Deploy ... run sits in WAITING

The escalation is conditional and nothing implements the condition: GitHub emits
`workflow_run.failed` only when a workflow actually fails. On a green deploy the gate
never runs, so the human is never called.

## Running it

Open a PR from `demo/pin-petclinic-image` into `main`. Only workflows matching `k8s/**`
plus the two Java builds will run; the Java builds pass, because no Java changed.

Expect roughly: deploy fails at the 3-minute `kubectl wait` timeout, Deploy Gate picks it
up within about a minute and takes a few more, then the human step appears as `WAITING`.

## Resetting it

Close the PR and delete the branch. Nothing is left behind — the change never merges and
the cluster is created and destroyed inside the workflow run.
