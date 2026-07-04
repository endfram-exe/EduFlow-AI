import type { HTMLAttributes } from 'react';
import { cn } from '../../lib/utils';

type AvatarProps = HTMLAttributes<HTMLDivElement> & {
  name: string;
};

export function Avatar({ name, className, ...props }: AvatarProps) {
  const initials = name
    .split(' ')
    .map((part) => part[0])
    .join('')
    .slice(0, 2)
    .toUpperCase();

  return (
    <div className={cn('grid h-10 w-10 place-items-center rounded-avatar bg-primary/10 font-semibold text-primary', className)} aria-label={name} {...props}>
      {initials}
    </div>
  );
}
