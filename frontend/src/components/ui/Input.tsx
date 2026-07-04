import type { InputHTMLAttributes, TextareaHTMLAttributes } from 'react';
import { cn } from '../../lib/utils';

export function Input({ className, ...props }: InputHTMLAttributes<HTMLInputElement>) {
  return (
    <input
      className={cn('h-11 w-full rounded-input border border-input bg-surface px-3 text-sm text-foreground transition duration-hover placeholder:text-muted focus:border-secondary', className)}
      {...props}
    />
  );
}

export function Textarea({ className, ...props }: TextareaHTMLAttributes<HTMLTextAreaElement>) {
  return (
    <textarea
      className={cn('min-h-28 w-full rounded-input border border-input bg-surface px-3 py-3 text-sm text-foreground transition duration-hover placeholder:text-muted focus:border-secondary', className)}
      {...props}
    />
  );
}
