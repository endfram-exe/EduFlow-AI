# TimeForge Sprint 02
## Frontend Foundation & Design System

---

# ROLE

You are a Principal Frontend Engineer at Stripe with 20+ years of experience building enterprise SaaS products.

You have expert knowledge of

- React 19
- TypeScript
- Vite
- TailwindCSS
- shadcn/ui
- Framer Motion
- React Router
- TanStack Query
- Lucide Icons
- Recharts
- Modern SaaS Design Systems

Your responsibility is to build the **frontend foundation** of TimeForge.

This is NOT a college project.

This is the first version of a commercial SaaS platform.

Everything must be production-quality.

---

# PRODUCT

Product Name

TimeForge

Tagline

AI-Powered Academic Operating System

Mission

Transform the way educational institutions manage time, scheduling, teachers, students, and academic operations through intelligent automation.

---

# OBJECTIVE

Build the entire frontend foundation.

DO NOT build backend logic.

DO NOT integrate APIs.

DO NOT create fake backend code.

Instead create

- Design System
- Component Library
- Routing
- Layout
- Navigation
- Dashboard
- Pages
- Theme
- Dummy Data

Everything should compile successfully.

---

# TECHNOLOGY STACK

React 19

TypeScript

Vite

TailwindCSS

shadcn/ui

Framer Motion

React Router DOM

TanStack Query

Lucide Icons

Recharts

clsx

tailwind-merge

date-fns

React Hook Form

Zod

Use npm.

---

# DESIGN PHILOSOPHY

The UI should feel like

Apple

+

Stripe

+

Linear

+

Notion

+

Vercel

+

Framer

It should NEVER resemble a traditional School ERP.

The design should communicate

Premium

Minimal

Professional

Modern

Spacious

Intelligent

AI-first

---

# DESIGN SYSTEM

Build an internal design system.

Everything must use reusable components.

Create

Typography

Spacing

Color Tokens

Radius

Shadows

Motion

Icons

Buttons

Cards

Inputs

Dialogs

Drawer

Dropdown

Data Table

Charts

Badges

Toast

Skeleton

Loading States

Empty States

Error States

Theme Provider

Dark Mode Ready

Light Mode Default

---

# COLOR PALETTE

Primary

#2563EB

Secondary

#38BDF8

Success

#10B981

Warning

#F59E0B

Danger

#EF4444

Background

#F8FAFC

Surface

#FFFFFF

Border

#E5E7EB

Text Primary

#0F172A

Text Secondary

#64748B

Muted

#94A3B8

Never hardcode colors.

Everything must come from design tokens.

---

# TYPOGRAPHY

Headings

Poppins

Body

Inter

Statistics

IBM Plex Sans

---

# BORDER RADIUS

Buttons

12px

Inputs

14px

Cards

24px

Dialogs

24px

Avatar

999px

---

# ICONS

Lucide Icons only.

---

# ANIMATIONS

Use Framer Motion.

Hover

150ms

Cards

200ms

Dialogs

250ms

Page

300ms

Use

Fade

Scale

Slide

Layout Animations

Do NOT use

Bounce

Spin

Flash

---

# GRID SYSTEM

12 Columns

Desktop

8 Columns

Tablet

4 Columns

Mobile

Use Bento Grid layouts.

Cards should have different sizes depending on importance.

---

# RESPONSIVENESS

Desktop

Laptop

Tablet

Mobile

Everything must adapt perfectly.

---

# ACCESSIBILITY

WCAG AA

Keyboard Navigation

Focus States

ARIA Labels

Proper Contrast

Semantic HTML

---

# FOLDER STRUCTURE

src/

app/

components/

ui/

layout/

dashboard/

navigation/

forms/

tables/

charts/

pages/

hooks/

services/

types/

constants/

theme/

assets/

utils/

---

# ROUTING

Create routing for

/

Landing

/login

/register

/forgot-password

/dashboard

/teachers

/students

/classes

/sections

/subjects

/timetable

/rooms

/laboratories

/attendance

/analytics

/settings

/profile

/notifications

/404

All pages should use dummy data.

---

# LAYOUT

Build

Sidebar

Navbar

Footer

Page Layout

Dashboard Layout

Responsive Sidebar

Search

Notifications

Profile Menu

Breadcrumb

---

# SIDEBAR

Inspired by

Linear

Vercel

Collapsed

Expanded

Smooth Animation

Icons

Section Labels

Active State

---

# DASHBOARD

The dashboard should be Bento Grid based.

Top

Welcome Card

Statistics Cards

Teachers

Students

Attendance

Classes

AI Insights

Recent Activity

Notifications

Upcoming Events

Attendance Chart

Timetable Status

Generate Timetable CTA

Recent Teachers

Recent Classes

Everything uses reusable cards.

---

# LANDING PAGE

This is NOT a school website.

This is a SaaS Landing Page.

Hero Section

Large Typography

Product Preview

Feature Grid

Pricing Preview

Testimonials

FAQ

Footer

Modern animations.

---

# COMPONENT LIBRARY

Generate reusable components.

Primary Button

Secondary Button

Ghost Button

Danger Button

Card

Stat Card

Chart Card

Input

Textarea

Select

Checkbox

Switch

Dialog

Drawer

Dropdown

Avatar

Tooltip

Toast

Loading Skeleton

Pagination

Table

Search Box

Date Picker

Calendar

Badge

Progress

Tabs

Accordion

Empty State

Error State

---

# CHARTS

Use Recharts.

Attendance

Teacher Workload

Student Growth

Timetable Statistics

Lab Utilization

Everything uses dummy data.

---

# DUMMY DATA

Generate realistic dummy data.

Teachers

Students

Classes

Subjects

Attendance

Notifications

Analytics

Timetable Summary

No lorem ipsum.

---

# CODE QUALITY

Follow

SOLID

DRY

KISS

Reusable Components

Strict TypeScript

Proper Folder Structure

No duplicated code.

---

# PERFORMANCE

Lazy Loading

Code Splitting

Memoization where appropriate

Image Optimization

Route Based Splitting

---

# OUTPUT

Generate a complete frontend project.

Everything should compile successfully.

Every page should be navigable.

Every component should be reusable.

No backend integration.

No API calls.

No TODO comments.

No placeholder code.

Everything should look like a premium SaaS platform.

---

# ACCEPTANCE CRITERIA

Sprint 02 is ONLY responsible for establishing the frontend foundation of TimeForge.

The deliverables for this sprint are:

## Fully Implemented

✅ Landing Page

- Premium SaaS hero section
- Feature showcase
- Bento Grid layout
- Pricing section (dummy)
- Testimonials (dummy)
- FAQ
- Footer
- Responsive
- Smooth animations

---

✅ Authentication UI

- Login Page
- Register Page
- Forgot Password Page

UI only.

No backend integration.

---

✅ Dashboard

A premium AI SaaS dashboard that includes:

- Welcome Banner
- Statistics Cards
- AI Insights Card
- Attendance Overview
- Timetable Status
- Notifications
- Recent Activities
- Upcoming Events
- Attendance Chart
- Teacher Workload Chart
- Generate Timetable CTA

Everything should use reusable components.

---

✅ Design System

Create and document:

- Color Tokens
- Typography
- Shadows
- Radius
- Motion
- Spacing
- Icons
- Component Variants

---

✅ Component Library

Fully build reusable components including:

Buttons

Cards

Forms

Tables

Dialogs

Drawer

Dropdown

Sidebar

Navbar

Breadcrumb

Toast

Skeleton

Badges

Charts

Progress

Calendar

Avatar

Pagination

Search

Everything production ready.

---

✅ Layout System

Responsive

Sidebar

Navbar

Footer

Dashboard Layout

Page Layout

Theme Provider

Dark Mode Ready

Light Mode Default

---

## Scaffold Only

The following pages should be created but contain only

- Shared Layout
- Page Header
- Breadcrumb
- Placeholder Content
- Coming Soon Card

Do NOT fully implement these pages.

Create placeholders only.

- Teachers
- Students
- Classes
- Sections
- Subjects
- Rooms
- Laboratories
- Timetable
- Attendance
- Analytics
- Notifications
- Settings
- Profile

Each page must already use the global layout and routing.

---

## Routing

Every route should work correctly.

404 page must be implemented.

---

## Dummy Data

Use realistic educational data.

Never use Lorem Ipsum.

---

## Performance

Use

- Lazy Loading
- Code Splitting
- Memoization where appropriate

---

## Code Quality

Strict TypeScript

Reusable Components

No duplicated code

No TODO comments

No placeholder variables

No console.log

---

## Documentation

Create README files where appropriate.

Document the design system.

Document folder structure.

---

## Final Result

Running

npm install

npm run dev

should launch a beautiful, premium SaaS frontend that looks production-ready.

Only the Landing Page, Authentication UI, Dashboard, Design System, Component Library, and Layout System should be fully implemented.

All remaining modules should exist as clean placeholders that are ready for future backend integration.

# IMPORTANT

Do NOT implement backend logic.

Do NOT create REST APIs.

Do NOT implement authentication.

Do NOT connect databases.

Build only the frontend architecture and design system.

The goal of Sprint 02 is to create a production-ready UI foundation that future backend modules can integrate into without major redesign.