# EduFlow AI

**The AI Powered School ERP Platform**

EduFlow AI is a production-grade SaaS foundation for modern school operations. This repository is organized as an enterprise monorepo with a React 19 frontend, Java 21 Spring Boot backend, Flyway-managed MySQL schema, Docker Compose runtime, API documentation, CI workflows, and quality gates.

## Repository Layout

- `frontend/` - React 19, TypeScript, Vite, Tailwind CSS, shadcn-style UI primitives, routing, dashboard, authentication views, charts, and theme support.
- `backend/` - Spring Boot 3, Java 21, clean modular architecture, security, JPA, Flyway, OpenAPI, and integration-ready module boundaries.
- `database/` - Database schema, migration, seed, and data governance notes.
- `docs/` - Product, architecture, installation, API, contribution, roadmap, and license documentation.
- `deployment/` - Container and deployment-facing configuration.
- `infrastructure/` - Infrastructure-as-code placeholders and platform notes.
- `.github/` - CI workflow definitions.
- `tests/` - Cross-project and end-to-end testing assets.
- `assets/` - Brand and product assets.
- `scripts/` - Developer automation.
- `api/` - API contracts and exported OpenAPI artifacts.

## Quick Start

```powershell
docker compose up --build
```

The frontend is served on `http://localhost:5173`, the backend on `http://localhost:8080`, and Swagger UI on `http://localhost:8080/swagger-ui.html`.

## Local Development

```powershell
cd backend
mvn test
```

```powershell
cd frontend
npm install
npm run build
```

## Principles

EduFlow AI is built around clear module ownership, DTO boundaries, dependency injection, structured validation, centralized exception handling, and a frontend component system designed for enterprise SaaS usability.
