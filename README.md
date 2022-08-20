# brannvaktskript

## Hva er dette
Kotlin-skript for å velge tilfeldig hvem som skal være teamets brannvakt (alias forvaltningsansvarlige) på hvilke ukedager

## Hvordan bruke det
* Forutsetter at du har installert Kotlin på din maskin, slik at det funker f.eks. å kjøre `kotlinc -version`.
* Skriptet ligger i fila https://github.com/navikt/brannvaktskript/blob/main/brannvakt.kts. Den kan enten kjøres i IntelliJ eller på kommandolinja. Jeg har bruk Linux, og kopiert fila til min katalog `~/bin` og gjort den kjørbar med `chmod +x brannvakt.kts`, som gjør at jeg kan kjøre den som en hvilken som helst annen Linux-kommando.
* Du må endre første linje i skriptet som starter med `#!` til å peke på din kotlinc. For å finne riktig path, kjør `which kotlinc`.
* Personer og ukedager er hardkodet. For å endre dem er det bare å editere skriptfila og kjøre den på nytt. Det er ikke nødvendig å kompilere før kjøring.


# Henvendelser

## For Nav-ansatte

- Dette Git-repositoriet eies
  av [Team tiltak og inkludering (TOI) i Produktområde arbeidsgiver](https://teamkatalog.nais.adeo.no/team/0150fd7c-df30-43ee-944e-b152d74c64d6)
  .
- Slack-kanaler:
  - [#arbeidsgiver-toi-dev](https://nav-it.slack.com/archives/C02HTU8DBSR)
  - [#arbeidsgiver-utvikling](https://nav-it.slack.com/archives/CD4MES6BB)

## For folk utenfor Nav

- Opprett gjerne en issue i Github for alle typer spørsmål
- IT-utviklerne i Github-teamet https://github.com/orgs/navikt/teams/toi
- IT-avdelingen
  i [Arbeids- og velferdsdirektoratet](https://www.nav.no/no/NAV+og+samfunn/Kontakt+NAV/Relatert+informasjon/arbeids-og-velferdsdirektoratet-kontorinformasjon)
