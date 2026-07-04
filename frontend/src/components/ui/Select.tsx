import type { SelectHTMLAttributes } from 'react';
import { cn } from '../../lib/utils';

export function Select({ className, children, ...props }: SelectHTMLAttributes<HTMLSelectElement>) {
  return (
    <select className={cn('h-11 w-full rounded-input border border-input bg-surface px-3 text-sm text-foreground transition duration-hover focus:border-secondary', className)} {...props}>
      {children}
    </select>
  );
}
