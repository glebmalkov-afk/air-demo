# P16 — Duplicate pet name

**Branch:** `demo/p16-duplicate-pet-name`

## Task

Warn when adding a pet whose name an owner already uses.

## Notes

Case-insensitive, trimmed. It is a validation error on create; editing a pet must not flag the pet against itself.

## Done when

Adding a duplicate name is rejected, and renaming a pet to its own current name is still allowed.

---
_Air Day demo prompt. Work on the branch named above, then open a PR — the Code Review → Test Coverage chain picks it up from there._
