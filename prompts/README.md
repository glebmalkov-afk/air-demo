# Demo prompt library

Twenty small PetClinic features for the Air Day demo stand. Pick one, hand the file to a
local agent in IntelliJ, let it work on the branch named in the file, then open a PR.
Opening the PR starts the automation chain:

    PR opened ──▶ Code Review ──▶ Test Coverage ──▶ Demo Log

`DEMO-LOG.md` at the repo root records what each run did. The log is keyed off the branch
name, so keep the `demo/pNN-…` prefix.

"Review bait" marks the prompts whose subject matter — dates, escaping, bounds, N+1,
null cases — reliably gives the reviewer something real to find. A clean `LGTM` makes for
a flat demo, so prefer these when you want the chain to visibly do work.

| Prompt | Feature | Branch | Review bait |
|---|---|---|---|
| `P01` | Vet specialties filter | `demo/p01-vet-specialties` | yes |
| `P02` | Owner search by phone | `demo/p02-owner-phone-search` | yes |
| `P03` | Pet age | `demo/p03-pet-age` | yes |
| `P04` | Sort owners by last name | `demo/p04-sort-owners` | — |
| `P05` | Visits this week | `demo/p05-visits-this-week` | yes |
| `P06` | Export owners to CSV | `demo/p06-owners-csv` | yes |
| `P07` | Birth date not in the future | `demo/p07-birthdate-validation` | yes |
| `P08` | Breadcrumbs | `demo/p08-breadcrumbs` | — |
| `P09` | Page size selector | `demo/p09-page-size` | yes |
| `P10` | Visit description counter | `demo/p10-visit-char-counter` | — |
| `P11` | Inactive pets | `demo/p11-inactive-pets` | yes |
| `P12` | Pets per owner | `demo/p12-pets-count` | yes |
| `P13` | Dark mode | `demo/p13-dark-mode` | — |
| `P14` | Pets REST endpoint | `demo/p14-pets-api` | yes |
| `P15` | Vets cache health | `demo/p15-cache-health` | — |
| `P16` | Duplicate pet name | `demo/p16-duplicate-pet-name` | yes |
| `P17` | Last visit column | `demo/p17-last-visit` | yes |
| `P18` | Reset search | `demo/p18-reset-search` | — |
| `P19` | Vet detail page | `demo/p19-vet-detail` | yes |
| `P20` | Visit audit timestamps | `demo/p20-visit-audit` | yes |
