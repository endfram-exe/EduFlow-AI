# TimeForge Git Workflow

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
2. Workflow Philosophy
3. Repository Strategy
4. Branching Model
5. Sprint Workflow
6. Development Workflow
7. Commit Standards
8. Pull Request Standards
9. Code Review Process
10. Merge Strategy
11. Release Strategy
12. Hotfix Process
13. Semantic Versioning
14. GitHub Project Management
15. Labels
16. Milestones
17. Branch Protection Rules
18. CI/CD Requirements
19. Definition of Ready
20. Definition of Done
21. Version History

---

# Purpose

This document defines the official Git workflow for TimeForge.

Objectives:

- Predictable development
- Safe collaboration
- Clean commit history
- High-quality releases
- Easy rollback

---

# Workflow Philosophy

Every change should be:

Planned

↓

Architected

↓

Implemented

↓

Reviewed

↓

Tested

↓

Merged

↓

Released

Git history should tell the story of the project.

---

# Team Roles

Founder

- Product decisions
- Sprint approval
- Feature acceptance

---

CTO (ChatGPT)

- Architecture
- Technical review
- Quality assurance
- Merge recommendation

---

Antigravity

- Feature implementation
- Refactoring
- Bug fixes

---

Codex

- Task implementation
- Boilerplate generation
- Refactoring support

---

# Repository Strategy

Single repository (Monorepo)

```
timeforge/

frontend/

backend/

docs/

packages/

scripts/

.github/

```

---

# Branching Model

Main branches

```
main

develop
```

Feature branches

```
feature/dashboard

feature/calendar

feature/authentication

feature/attendance

feature/ai-assistant
```

Bug fixes

```
bugfix/sidebar-overflow

bugfix/login-validation
```

Hotfixes

```
hotfix/v1.0.1

hotfix/auth-token
```

Release branches

```
release/v1.1.0

release/v2.0.0
```

---

# Branch Rules

main

Production-ready code only.

Never commit directly.

---

develop

Integration branch.

All completed features merge here first.

---

feature/*

One feature per branch.

Keep branches focused.

---

# Sprint Workflow

Sprint Planning

↓

Architecture Specification

↓

Implementation

↓

Local Testing

↓

Commit

↓

Push

↓

Pull Request

↓

Architecture Review

↓

Requested Changes (if any)

↓

Approval

↓

Merge into develop

↓

Release

---

# Development Workflow

Step 1

Pull latest develop.

```
git checkout develop
git pull origin develop
```

---

Step 2

Create feature branch.

```
git checkout -b feature/dashboard-widgets
```

---

Step 3

Implement feature.

---

Step 4

Run quality checks.

```
npm run lint

npm run type-check

npm run test

npm run build
```

---

Step 5

Commit changes.

---

Step 6

Push branch.

```
git push origin feature/dashboard-widgets
```

---

Step 7

Open Pull Request.

---

Step 8

Architecture Review.

---

Step 9

Merge after approval.

---

# Commit Standards

TimeForge follows Conventional Commits.

Examples

```
feat: add dashboard widgets

fix: resolve sidebar collapse issue

refactor: simplify timetable engine

docs: update architecture guide

style: improve spacing consistency

test: add attendance service tests

chore: update dependencies
```

---

# Commit Rules

Every commit should:

- Build successfully
- Represent one logical change
- Have a meaningful message

Avoid:

```
update

changes

fix

new code

misc
```

---

# Pull Request Template

Every PR should include:

## Summary

What changed?

---

## Motivation

Why was the change needed?

---

## Screenshots

For UI updates.

---

## Testing

How was it tested?

---

## Checklist

- Builds successfully

- No TypeScript errors

- No ESLint errors

- Responsive

- Accessible

- Documentation updated

---

# Code Review Process

Every PR is reviewed for:

Architecture

Performance

Accessibility

Security

Readability

Maintainability

Documentation

Testing

Design System compliance

---

# Merge Strategy

Preferred strategy

Squash and Merge

Benefits

Clean history

One commit per feature

Easy rollback

---

Merge Commit

Allowed only for large release branches.

---

Rebase

Optional before opening PR.

---

# Release Strategy

Development

↓

Release Candidate

↓

Testing

↓

Production

Every release should have release notes.

---

# Hotfix Process

Critical production issue

↓

Create hotfix branch

↓

Implement fix

↓

Review

↓

Merge into main

↓

Merge back into develop

↓

Tag release

---

# Semantic Versioning

Format

MAJOR.MINOR.PATCH

Examples

1.0.0

1.1.0

1.1.3

2.0.0

Rules

MAJOR

Breaking changes.

MINOR

New features.

PATCH

Bug fixes.

---

# GitHub Issues

Every feature should have an issue.

Template

Title

Description

Acceptance Criteria

Priority

Sprint

Assignee

---

# Labels

Type

feature

bug

enhancement

documentation

refactor

performance

security

accessibility

testing

Priority

P0

P1

P2

P3

Status

blocked

in progress

review

ready

done

---

# Milestones

Epic 1

Frontend Foundation

Epic 2

Authentication

Epic 3

Academic Workspace

Epic 4

AI Integration

Epic 5

Backend Services

Epic 6

Production Launch

---

# Branch Protection Rules

Protect

main

Rules

Require pull requests

Require review

Require passing CI

Disallow force push

Disallow direct commits

Require up-to-date branches

---

# CI/CD Pipeline

Every Pull Request runs

Install

↓

Lint

↓

Type Check

↓

Tests

↓

Build

↓

Preview Deployment

↓

Review

↓

Merge

---

# Release Checklist

Before production release

- All tests passing

- Documentation updated

- No critical bugs

- Security review complete

- Accessibility verified

- Performance verified

- Release notes prepared

---

# Definition of Ready

A task is ready when:

✓ Requirements are clear

✓ UI defined

✓ Architecture approved

✓ Dependencies identified

✓ Acceptance criteria written

---

# Definition of Done

A feature is complete when:

✓ Code merged

✓ Documentation updated

✓ Tests passing

✓ Review completed

✓ CI passing

✓ Production ready

---

# GitHub Project Structure

Repository

↓

Milestones

↓

Epics

↓

Sprints

↓

Issues

↓

Pull Requests

↓

Releases

---

# Non-Negotiable Rules

- Never commit directly to `main`.
- Never merge without review.
- Never ignore CI failures.
- Never force-push protected branches.
- Never bypass architecture review.
- Always use Conventional Commits.
- Always keep documentation synchronized with implementation.
- Every feature must be traceable to an issue and a sprint.

---

# Version History

## Version 1.0

Initial Git workflow.

Defines the branching model, sprint workflow, pull request process, code review standards, release management, and GitHub collaboration practices for TimeForge.

---

End of Document