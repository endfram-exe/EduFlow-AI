# TimeForge API Guidelines

> Version: 1.0.0
>
> Status: Active
>
> Owner: CTO
>
> Last Updated: July 2026

---

# Table of Contents

1. Purpose
2. API Philosophy
3. API Architecture
4. Versioning Strategy
5. Naming Conventions
6. HTTP Methods
7. Endpoint Structure
8. Request Standards
9. Response Standards
10. Error Handling
11. Authentication
12. Authorization
13. Validation
14. Pagination
15. Filtering
16. Sorting
17. Searching
18. Rate Limiting
19. Idempotency
20. File Uploads
21. Webhooks
22. API Documentation
23. Deprecation Policy
24. Version History

---

# Purpose

This document defines the official standards for designing and implementing APIs in TimeForge.

Every API endpoint must follow these guidelines to ensure:

- Consistency
- Predictability
- Security
- Scalability
- Maintainability

---

# API Philosophy

Our APIs should be:

- RESTful
- Versioned
- Stateless
- Secure
- Predictable
- Well documented
- Backward compatible whenever possible

Clients should never need to guess how an endpoint behaves.

---

# API Architecture

Client

↓

API Gateway

↓

Authentication

↓

Validation

↓

Controller

↓

Service

↓

Repository

↓

Database

Business logic belongs only in the Service layer.

---

# Base URL

Development

/api/v1

Production

https://api.timeforge.app/v1

Future versions

/api/v2

/api/v3

---

# Versioning Strategy

API versions are URL based.

Examples

GET /api/v1/dashboard

GET /api/v1/attendance

GET /api/v1/calendar

Breaking changes require a new version.

Minor improvements should remain backward compatible.

---

# Naming Conventions

Use nouns instead of verbs.

Good

/users

/students

/faculty

/assignments

/calendar

Bad

/getStudents

/createAssignment

/deleteAttendance

---

# HTTP Methods

GET

Retrieve resources.

POST

Create resources.

PUT

Replace resources.

PATCH

Update part of a resource.

DELETE

Delete resources.

---

# Endpoint Examples

GET /api/v1/students

GET /api/v1/students/{id}

POST /api/v1/students

PATCH /api/v1/students/{id}

DELETE /api/v1/students/{id}

---

# Request Format

Content-Type

application/json

Example

```json
{
  "firstName": "Aniket",
  "lastName": "Pal",
  "email": "aniket@example.com"
}
```

---

# Success Response

```json
{
  "success": true,
  "message": "Student created successfully.",
  "data": {
    "id": "uuid",
    "firstName": "Aniket"
  }
}
```

---

# Error Response

```json
{
  "success": false,
  "error": {
    "code": "VALIDATION_ERROR",
    "message": "Email is required."
  }
}
```

---

# Standard HTTP Status Codes

200 OK

201 Created

204 No Content

400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found

409 Conflict

422 Unprocessable Entity

429 Too Many Requests

500 Internal Server Error

---

# Authentication

Authentication uses JWT.

Future support

OAuth

Google

Microsoft

GitHub

Access Token

Short lived.

Refresh Token

Long lived.

Never store tokens in localStorage.

Prefer secure HTTP-only cookies.

---

# Authorization

Role-Based Access Control (RBAC)

Roles

Student

Faculty

Department Coordinator

Administrator

Super Admin

Permissions should always be checked on the server.

---

# Validation

Every request must be validated.

Recommended libraries

Zod

or

Valibot

Never trust client-side validation alone.

---

# Pagination

Collection endpoints must support pagination.

Example

GET /students?page=1&pageSize=20

Response

```json
{
  "data": [],
  "pagination": {
    "page": 1,
    "pageSize": 20,
    "total": 250,
    "totalPages": 13
  }
}
```

---

# Filtering

Example

GET /attendance?semester=5

GET /students?department=CSE

GET /assignments?status=pending

Multiple filters are allowed.

---

# Sorting

Example

GET /students?sort=name

GET /students?sort=-createdAt

Prefix

-

indicates descending order.

---

# Searching

Example

GET /students?search=aniket

Search should support:

Name

Email

Enrollment Number

Subject (where applicable)

---

# Bulk Operations

Supported where appropriate.

Examples

POST /students/bulk

POST /attendance/bulk

POST /faculty/import

Bulk operations must use database transactions.

---

# Rate Limiting

Protect public APIs.

Default

100 requests/minute

Authentication endpoints

10 requests/minute

AI endpoints

Lower limits depending on cost.

---

# Idempotency

Critical POST endpoints should support idempotency keys.

Examples

Payment

Institution onboarding

Bulk imports

This prevents duplicate processing.

---

# File Uploads

Supported types

PDF

DOCX

PPTX

PNG

JPG

CSV

Maximum size

Configured by environment.

Store files outside the database.

Save only metadata and references.

---

# Date & Time

Use ISO 8601 format.

Example

2026-07-05T14:30:00Z

Store timestamps in UTC.

Convert to local time in the client.

---

# API Security

Use HTTPS only.

Sanitize all input.

Escape output where needed.

Validate MIME types.

Apply rate limiting.

Use CORS.

Use Helmet middleware.

Never expose stack traces.

---

# Logging

Log

Request ID

User ID

Endpoint

Method

Status Code

Duration

Do not log passwords, tokens, or sensitive personal information.

---

# Error Codes

Examples

VALIDATION_ERROR

UNAUTHORIZED

FORBIDDEN

RESOURCE_NOT_FOUND

CONFLICT

RATE_LIMITED

INTERNAL_SERVER_ERROR

These codes should remain stable across API versions.

---

# Webhooks

Future support

Attendance events

Assignment submissions

Exam publication

Notification delivery

Webhook payloads should include:

Event type

Timestamp

Resource ID

Signature

---

# API Documentation

Every endpoint must include:

Description

Authentication requirements

Parameters

Request examples

Response examples

Error responses

OpenAPI (Swagger) documentation should be maintained alongside the implementation.

---

# Deprecation Policy

Deprecated endpoints remain supported for at least one major release.

Deprecation notice should include:

Reason

Replacement endpoint

Removal date

Clients should receive clear migration guidance.

---

# Monitoring

Track

Latency

Error rate

Traffic

Rate limit violations

Authentication failures

Use monitoring tools such as Sentry, Grafana, or Better Stack in production.

---

# Non-Negotiable Rules

- Never expose internal database IDs unnecessarily.
- Never return sensitive fields (passwords, secrets, tokens).
- Never introduce breaking changes without a new API version.
- Never bypass authentication or authorization checks.
- Always validate input.
- Always return consistent response structures.
- Always document new endpoints.

---

# Version History

## Version 1.0

Initial API guidelines.

Defines REST conventions, security practices, request/response formats, versioning strategy, and operational standards for all TimeForge APIs.

---

End of Document