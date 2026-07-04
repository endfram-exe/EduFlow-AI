# TimeForge Design System v1.0

The TimeForge Design System is built on a centralized theme architecture using TailwindCSS, class-variance-authority (cva), and Radix UI / Vaul primitives.

## Design Tokens

All design tokens are stored in `src/styles/globals.css` as CSS custom properties with the `--tf-*` prefix to prevent collision and ensure consistency.

### Colors
- `--tf-primary`: Primary brand color (blue)
- `--tf-secondary`: Secondary brand color (cyan)
- `--tf-background`: Application background
- `--tf-surface`: Surface background (cards, modals)
- `--tf-danger`, `--tf-warning`, `--tf-success`: Semantic colors
- `--tf-border`, `--tf-input`, `--tf-ring`: Border and focus ring colors
- `--tf-text-primary`, `--tf-text-secondary`, `--tf-muted`: Typography colors

### Spacing & Radius
- `--tf-spacing-1` to `--tf-spacing-12`: Consistent layout spacing
- `--tf-radius-sm` to `--tf-radius-full`: Border radius tokens for elements
- Component-specific radii: `--tf-radius-button`, `--tf-radius-card`, `--tf-radius-dialog`

### Shadows & Elevation
- `--tf-shadow-sm` to `--tf-shadow-lg`: General box shadows
- `--tf-shadow-soft`: Subdued shadow for cards
- `--tf-shadow-elevated`: High elevation shadow for modals/dropdowns
- `--tf-shadow-focus`: Accessible focus ring shadow

### Motion & Z-Index
- `--tf-motion-fast`, `--tf-motion-normal`, `--tf-motion-slow`: Transition durations
- `--tf-z-dropdown` to `--tf-z-toast`: Centralized z-index layers

## Reusable UI Primitives

All primitives are located in `src/components/ui/` and support standard accessible states (Hover, Focus, Disabled, Loading).

### `Button`
A highly composable button with variants: `primary`, `secondary`, `outline`, `ghost`, `danger`.
Supports `isLoading` prop to display a spinner and disable interactions.

### `Card`
A composable card system:
`Card`, `CardHeader`, `CardTitle`, `CardDescription`, `CardContent`, `CardFooter`.

### `Input` & `Textarea`
Standard form controls with centralized focus rings (`--tf-ring`) and disabled states.

### `Badge`
A small status indicator with variants matching semantic colors (`primary`, `secondary`, `success`, `warning`, `danger`, `neutral`).

### `Avatar`
A user representation primitive using Radix UI: `Avatar`, `AvatarImage`, `AvatarFallback`.

### `Modal`
An accessible dialog primitive using Radix UI:
`Modal`, `ModalTrigger`, `ModalContent`, `ModalHeader`, `ModalFooter`, `ModalTitle`, `ModalDescription`.

### `Drawer`
A bottom-sheet drawer using Vaul for mobile-friendly interactions:
`Drawer`, `DrawerTrigger`, `DrawerContent`, `DrawerHeader`, `DrawerFooter`, `DrawerTitle`, `DrawerDescription`.

### `Toast`
Notification primitives using Radix UI:
`ToastProvider`, `ToastViewport`, `Toast`, `ToastTitle`, `ToastDescription`, `ToastAction`, `ToastClose`.

### `Skeleton`
A pulsing placeholder for loading states.

### `EmptyState`
A standard empty state placeholder with an icon, title, and description, wrapped in a `Card`.

### `LoadingState`
A dedicated section-level loading spinner and text.

## Usage Guidelines
1. **Never hardcode colors, spacing, or shadows.** Always use Tailwind utility classes mapped to our tokens (e.g., `bg-primary`, `p-4`, `shadow-soft`).
2. **Accessible by default.** Rely on the primitives' built-in focus and ARIA attributes.
3. **Use `cva` for variants.** When creating new components with multiple states, use `class-variance-authority` to manage classes predictably.
