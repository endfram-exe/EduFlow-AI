# TimeForge Database Design

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
2. Database Philosophy
3. Database Technology
4. Design Principles
5. Multi-Tenant Architecture
6. Naming Conventions
7. Core Entities
8. Entity Relationships
9. Database Modules
10. Indexing Strategy
11. Constraints
12. Migrations
13. Soft Deletes
14. Auditing
15. Transactions
16. Performance
17. Security
18. Backup Strategy
19. Future Scaling
20. Version History

---

# Purpose

This document defines the official database architecture for TimeForge.

Every database schema, migration, and model must follow the standards defined here.

Goals:

- Data consistency
- High performance
- Maintainability
- Scalability
- Security
- Future-proof architecture

---

# Database Philosophy

TimeForge is built around a relational data model.

Core principles:

• Normalize where practical

• Denormalize only for performance

• Never duplicate business data unnecessarily

• Use foreign keys

• Use transactions

• Preserve audit history

---

# Primary Database

Database Engine

PostgreSQL

Reasons:

- ACID compliant
- Excellent indexing
- JSON support
- Mature ecosystem
- Reliable transactions
- Scales to enterprise workloads

---

# ORM

Official ORM

Prisma

Reasons:

- Type-safe

- Excellent migration tooling

- Auto-generated client

- Strong TypeScript support

---

# Database Design Principles

Every table should have:

- Primary Key
- createdAt
- updatedAt
- Optional deletedAt
- Proper indexes
- Foreign keys

Every relationship must be explicit.

---

# Multi-Tenant Architecture

Future versions of TimeForge will support multiple institutions.

Architecture

Institution

↓

Departments

↓

Programs

↓

Semesters

↓

Sections

↓

Students

↓

Faculty

All academic data belongs to one institution.

No institution can access another institution's data.

---

# Primary Modules

Database is divided into logical modules.

## Authentication

Users

Roles

Permissions

Sessions

Refresh Tokens

---

## Institution

Institution

Campus

Department

Program

Semester

Section

Academic Year

---

## Student

Student

Enrollment

Attendance

Grades

Assignments

Performance

---

## Faculty

Faculty

Workload

Availability

Subjects

Classes

---

## Academic

Courses

Subjects

Timetable

Lecture Slots

Examinations

Assignments

Calendar

---

## AI

Recommendations

Suggestions

Conflict Reports

Predictions

Chat History

---

## Notifications

Notifications

Templates

Delivery Logs

Preferences

---

## Analytics

Reports

Attendance Analytics

Performance Analytics

Usage Metrics

---

# Core Entities

Institution

Department

Course

Subject

Section

Student

Faculty

Classroom

Lecture

Timetable

Attendance

Assignment

Submission

Exam

Grade

Calendar Event

Notification

AI Conversation

Audit Log

User

Role

Permission

Settings

---

# Relationship Overview

Institution

└── Departments

      └── Programs

            └── Semesters

                  └── Sections

                        ├── Students

                        ├── Faculty

                        ├── Timetable

                        └── Attendance

---

# Naming Conventions

Tables

Singular PascalCase

Example

Student

Faculty

Assignment

Prisma Models

PascalCase

Database Tables

snake_case

Columns

camelCase (Prisma)

snake_case (Database)

---

# Primary Keys

Every table uses

UUID

Example

id UUID PRIMARY KEY

Benefits

Globally unique

Better distributed systems support

Safer public identifiers

---

# Foreign Keys

Always use foreign key constraints.

Example

studentId

facultyId

departmentId

institutionId

Never store relationships as plain text.

---

# Timestamps

Every table includes

createdAt

updatedAt

Optional

deletedAt

---

# Soft Deletes

Soft deletes are preferred for:

Users

Students

Faculty

Assignments

Timetables

Benefits

Recovery

Audit history

Accidental deletion protection

---

# Hard Deletes

Allowed only for

Temporary cache

Sessions

Logs

Expired notifications

---

# Indexing Strategy

Indexes should exist for:

Primary Keys

Foreign Keys

Email

Username

Institution ID

Academic Year

Semester

Section

Attendance Date

Timetable Date

Composite indexes should be used for frequently queried combinations.

---

# Constraints

Use constraints wherever possible.

Examples

Unique Email

Unique Username

Foreign Key Integrity

Check Constraints

NOT NULL

Never rely solely on application validation.

---

# Transactions

Use transactions for:

Attendance submission

Timetable generation

Assignment grading

Bulk imports

User creation

Institution onboarding

---

# Audit Logging

Critical operations should be recorded.

Examples

Login

Role changes

Attendance edits

Timetable modifications

Grade changes

Account deletion

Audit fields

Who

When

What

Previous Value

New Value

---

# Data Retention

Academic records

Permanent

Attendance

Permanent

Audit Logs

Minimum 5 years

Notifications

180 days

Sessions

30 days

---

# Performance Guidelines

Avoid SELECT *

Select only required columns.

Use pagination.

Use indexes.

Avoid N+1 queries.

Optimize joins.

Monitor slow queries.

---

# Backup Strategy

Daily Backup

Weekly Full Backup

Monthly Archive

Point-in-Time Recovery

Automated verification

---

# Security

Encrypt passwords.

Never store plaintext passwords.

Use parameterized queries.

Limit database permissions.

Rotate credentials.

Store secrets in environment variables.

---

# Migration Policy

Schema changes must be made through Prisma Migrations.

Never manually edit production schemas.

Migration workflow

Modify Prisma Schema

↓

Generate Migration

↓

Review Migration

↓

Apply to Development

↓

Test

↓

Deploy

---

# Seed Data

Development only.

Seed includes:

Administrator

Demo Institution

Sample Faculty

Sample Students

Sample Courses

Sample Timetable

---

# Future Scaling

Future enhancements include:

Read Replicas

Database Partitioning

Horizontal Scaling

Redis Cache

Materialized Views

Analytics Warehouse

Event Sourcing

---

# Non-Negotiable Rules

Never delete production data without approval.

Never disable foreign keys.

Never skip migrations.

Never use auto-increment IDs.

Never duplicate business entities.

Always use UUIDs.

Always maintain audit history.

---

# Version History

## Version 1.0

Initial database architecture.

Defines the database philosophy, entity organization, migration strategy, indexing, auditing, multi-tenancy, and long-term scalability principles for TimeForge.

---

End of Document