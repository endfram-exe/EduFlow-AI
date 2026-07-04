import { Loader2 } from 'lucide-react';
import { cn } from '../../lib/utils';
import type { HTMLAttributes } from 'react';

export interface LoadingStateProps extends HTMLAttributes<HTMLDivElement> {
  text?: string;
}

export function LoadingState({ text = 'Loading...', className, ...props }: LoadingStateProps) {
  return (
    <div
      className={cn('flex flex-col items-center justify-center p-8 text-subtle', className)}
      {...props}
    >
      <Loader2 className="mb-4 h-8 w-8 animate-spin text-primary" />
      <p className="text-sm font-medium">{text}</p>
    </div>
  );
}
