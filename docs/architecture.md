# Architecture

EduFlow AI follows a modular clean architecture style:

- Controllers expose HTTP contracts and validate request DTOs.
- Services define use-case boundaries and orchestration points.
- Repositories isolate persistence access through Spring Data JPA.
- DTOs protect API contracts from persistence model drift.
- Mappers keep conversion logic explicit and testable.
- Configuration classes isolate module-specific wiring.
- Central exception handling standardizes failure responses.

The current implementation intentionally contains foundation behavior only. Domain business rules should be added inside services and kept behind DTO and repository boundaries.
