# TimeForge Coding Standards

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
2. Engineering Philosophy
3. General Principles
4. TypeScript Standards
5. React Standards
6. Component Standards
7. File & Folder Naming
8. Import Order
9. Styling Standards
10. State Management
11. Error Handling
12. API Integration
13. Performance
14. Accessibility
15. Security
16. Testing Standards
17. Documentation
18. Code Review Checklist
19. Definition of Done
20. Version History

---

# Purpose

This document defines the coding standards for every line of code written in TimeForge.

Goals:

- Readability
- Maintainability
- Scalability
- Predictability
- Consistency

Good code should be easy to read, easy to extend, and easy to review.

---

# Engineering Philosophy

We write code for:

- Future teammates
- Future maintainers
- Future ourselves

Code is read far more often than it is written.

Always optimize for clarity over cleverness.

---

# General Principles

Follow these principles:

- DRY (Don't Repeat Yourself)
- KISS (Keep It Simple, Stupid)
- SOLID
- Composition over inheritance
- Explicit over implicit
- Small reusable functions
- Single responsibility

Avoid:

- Deep nesting
- Long functions
- Global mutable state
- Duplicate logic
- Hardcoded values

---

# TypeScript Standards

TypeScript is mandatory.

Rules:

- No `any`
- Prefer `unknown` when necessary
- Use interfaces for object contracts
- Use type aliases for unions and utility types
- Enable strict mode
- Never disable TypeScript errors without approval

Example:

Good

```ts
interface Student {
  id: string;
  name: string;
}
```

Bad

```ts
const student: any = {};
```

---

# React Standards

Use:

- Functional components
- Hooks
- Composition

Avoid:

- Class components
- Inline business logic
- Massive components

One component should have one responsibility.

---

# Component Standards

Structure:

- UI Components
- Composite Components
- Feature Components

Every component should:

- Be reusable
- Accept typed props
- Avoid side effects
- Be accessible
- Be documented if reusable

---

# File Naming

Use:

PascalCase

Examples

DashboardCard.tsx

StudentTable.tsx

AttendanceChart.tsx

Hooks

camelCase

Example

useAttendance.ts

Utility files

camelCase

Example

formatDate.ts

---

# Folder Naming

Use lowercase with hyphens when appropriate.

Example

features/

dashboard/

attendance/

calendar/

---

# Import Order

1. React
2. Third-party libraries
3. Internal aliases
4. Relative imports
5. Styles
6. Types

Example

```ts
import { useState } from "react";

import { Button } from "@/components/ui/button";

import { formatDate } from "@/utils/formatDate";

import "./styles.css";
```

---

# Styling Standards

Use TailwindCSS.

Rules:

- Never hardcode colors
- Use TimeForge design tokens
- Prefer utility classes
- Avoid inline styles

Responsive design is mandatory.

---

# State Management

Hierarchy:

Local

↓

Feature

↓

Global

Keep state as close as possible to where it is used.

Avoid unnecessary global state.

---

# API Integration

Never call APIs directly inside UI components.

Use:

Service Layer

↓

Hooks

↓

Components

Benefits:

- Easier testing
- Better separation
- Reusable logic

---

# Error Handling

Always handle:

Loading

Success

Error

Empty

Never leave users without feedback.

Errors should be:

Human readable

Recoverable

Logged

---

# Forms

Validate:

Client side

↓

Server side

Use schema validation.

Display inline validation messages.

---

# Performance Standards

Use:

Lazy loading

Memoization

Virtualization

Pagination

Code splitting

Avoid:

Unnecessary re-renders

Heavy computations inside render

Large bundle sizes

---

# Accessibility

Every feature must support:

Keyboard navigation

Focus management

ARIA labels

Semantic HTML

Visible focus indicators

Target WCAG 2.2 AA compliance.

---

# Security

Never:

Expose secrets

Trust user input

Store sensitive data in localStorage

Always:

Validate input

Sanitize output

Use HTTPS

Escape user-generated content

---

# Logging

Development:

Console logs are acceptable.

Production:

Use structured logging.

Remove debugging logs before merge.

---

# Testing Standards

Minimum coverage target:

80%

Test:

- Utilities
- Hooks
- Services
- Critical components
- API integrations

Testing pyramid:

Unit

↓

Integration

↓

End-to-End

---

# Documentation

Every reusable component should include:

Purpose

Props

Usage example

Notes

Complex business logic should be explained with comments where necessary.

---

# Git Commit Convention

Use Conventional Commits.

Examples

feat: add dashboard widgets

fix: resolve sidebar collapse bug

refactor: simplify timetable service

docs: update API guidelines

style: improve spacing consistency

test: add attendance service tests

---

# Pull Request Checklist

Before opening a PR:

- Code builds successfully
- No TypeScript errors
- No ESLint errors
- Responsive
- Accessible
- Tests pass
- Documentation updated
- Screenshots attached (UI changes)

---

# Code Review Checklist

Reviewers should verify:

Architecture

Readability

Naming

Performance

Accessibility

Security

Reusability

Documentation

Testing

No duplicated logic

---

# Definition of Done

A task is complete only if:

✓ Feature implemented

✓ Type-safe

✓ Responsive

✓ Accessible

✓ Tested

✓ Reviewed

✓ Documented

✓ No lint errors

✓ No TypeScript errors

✓ Merged successfully

---

# Non-Negotiable Rules

- No `any` types.
- No commented-out code.
- No dead code.
- No duplicated business logic.
- No hardcoded secrets.
- No direct database access outside repositories.
- No business logic inside UI components.
- Always use design tokens.
- Always write meaningful commit messages.
- Always keep documentation updated.

---

# Version History

## Version 1.0

Initial coding standards.

Defines engineering practices, TypeScript conventions, React patterns, styling rules, testing expectations, and code review standards for TimeForge.

---

End of Document