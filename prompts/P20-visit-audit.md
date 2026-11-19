# P20 — Visit audit timestamps

**Branch:** `demo/p20-visit-audit`

## Task

Record `createdAt` and `updatedAt` on visits.

## Notes

Use JPA auditing rather than setting the values by hand. Show `createdAt` on the owner page.

## Done when

Both columns populate on insert, and only `updatedAt` changes on a later edit.

---
_Air Day demo prompt. Work on the branch named above, then open a PR — the Code Review → Test Coverage chain picks it up from there._
