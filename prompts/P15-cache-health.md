# P15 — Vets cache health

**Branch:** `demo/p15-cache-health`

## Task

Expose the state of the vets cache as a Spring Boot health indicator.

## Notes

The project already has `spring-boot-starter-cache` and actuator. Report entry count and whether the cache is reachable.

## Done when

`/actuator/health` includes the indicator and it degrades rather than throws when the cache is missing.

---
_Air Day demo prompt. Work on the branch named above, then open a PR — the Code Review → Test Coverage chain picks it up from there._
