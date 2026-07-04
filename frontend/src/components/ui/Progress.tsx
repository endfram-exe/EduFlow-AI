import { cn } from '../../lib/utils';

type ProgressProps = {
  value: number;
  className?: string;
};

export function Progress({ value, className }: ProgressProps) {
  const normalized = Math.max(0, Math.min(100, value));
  return (
    <div className={cn('h-2 overflow-hidden rounded-full bg-accent', className)} role="progressbar" aria-valuenow={normalized} aria-valuemin={0} aria-valuemax={100}>
      <div className="h-full rounded-full bg-primary transition-all duration-card" style={{ width: `${normalized}%` }} />
    </div>
  );
}
