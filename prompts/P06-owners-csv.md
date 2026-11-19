# P06 — Export owners to CSV

**Branch:** `demo/p06-owners-csv`

## Task

Add a "Download CSV" link on the owners list that exports the owners.

## Notes

New controller method returning `text/csv` with a `Content-Disposition` attachment header. Columns: id, first name, last name, address, city, telephone.

## Done when

The file opens cleanly in a spreadsheet, including rows whose address contains a comma or a quote.

---
_Air Day demo prompt. Work on the branch named above, then open a PR — the Code Review → Test Coverage chain picks it up from there._
