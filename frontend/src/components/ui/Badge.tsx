import type { HTMLAttributes } from 'react';
import { cn } from '../../lib/utils';

type BadgeTone = 'primary' | 'secondary' | 'success' | 'warning' | 'danger' | 'neutral';

const tones: Record<BadgeTone, string> = {
  primary: 'bg-primary/10 text-primary',
  secondary: 'bg-secondary/15 text-foreground',
  success: 'bg-success/10 text-success',
  warning: 'bg-warning/15 text-foreground',
  danger: 'bg-danger/10 text-danger',
  neutral: 'bg-accent text-subtle',
};

type BadgeProps = HTMLAttributes<HTMLSpanElement> & {
  tone?: BadgeTone;
};

export function Badge({ className, tone = 'neutral', ...props }: BadgeProps) {
  return <span className={cn('inline-flex items-center rounded-full px-2.5 py-1 text-xs font-semibold', tones[tone], className)} {...props} />;
}
