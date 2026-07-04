import { type HTMLAttributes, forwardRef } from 'react';
import { cva, type VariantProps } from 'class-variance-authority';
import { cn } from '../../lib/utils';

const badgeVariants = cva(
  'inline-flex items-center rounded-full px-2.5 py-1 text-xs font-semibold transition-colors focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2',
  {
    variants: {
      tone: {
        primary: 'bg-primary/10 text-primary hover:bg-primary/20',
        secondary: 'bg-secondary/15 text-foreground hover:bg-secondary/25',
        success: 'bg-success/10 text-success hover:bg-success/20',
        warning: 'bg-warning/15 text-foreground hover:bg-warning/25',
        danger: 'bg-danger/10 text-danger hover:bg-danger/20',
        neutral: 'bg-accent text-subtle hover:bg-accent/80',
      },
    },
    defaultVariants: {
      tone: 'neutral',
    },
  }
);

export interface BadgeProps extends HTMLAttributes<HTMLSpanElement>, VariantProps<typeof badgeVariants> {}

const Badge = forwardRef<HTMLSpanElement, BadgeProps>(({ className, tone, ...props }, ref) => {
  return (
    <span
      ref={ref}
      className={cn(badgeVariants({ tone }), className)}
      {...props}
    />
  );
});
Badge.displayName = 'Badge';

export { Badge, badgeVariants };
