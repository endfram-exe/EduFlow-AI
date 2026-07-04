import type { ButtonHTMLAttributes } from 'react';
import { cn } from '../../lib/utils';

type SwitchProps = ButtonHTMLAttributes<HTMLButtonElement> & {
  checked?: boolean;
};

export function Switch({ checked = false, className, ...props }: SwitchProps) {
  return (
    <button
      type="button"
      role="switch"
      aria-checked={checked}
      className={cn('relative h-6 w-11 rounded-full border border-border transition duration-hover', checked ? 'bg-primary' : 'bg-accent', className)}
      {...props}
    >
      <span className={cn('absolute top-0.5 h-5 w-5 rounded-full bg-surface shadow-sm transition duration-hover', checked ? 'left-5' : 'left-0.5')} />
    </button>
  );
}
