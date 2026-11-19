# P14 — Pets REST endpoint

**Branch:** `demo/p14-pets-api`

## Task

Add `GET /api/owners/{ownerId}/pets` returning that owner's pets as JSON.

## Notes

Return a DTO, not the entity — do not leak the owner back-reference. 404 for an unknown owner.

## Done when

The endpoint returns the right shape, and an unknown owner id gives 404 rather than 500.

---
_Air Day demo prompt. Work on the branch named above, then open a PR — the Code Review → Test Coverage chain picks it up from there._
