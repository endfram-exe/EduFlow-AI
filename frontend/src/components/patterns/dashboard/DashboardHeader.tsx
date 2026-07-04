import { type HTMLAttributes } from 'react';
import { cn } from '../../../lib/utils';
import { Button } from '../../ui/Button';
import { Download, Calendar } from 'lucide-react';

interface DashboardHeaderProps extends HTMLAttributes<HTMLDivElement> {}

export function DashboardHeader({ className, ...props }: DashboardHeaderProps) {
  return (
    <div className={cn("flex flex-col justify-between gap-4 md:flex-row md:items-end", className)} {...props}>
      <div>
        <p className="text-sm font-semibold uppercase tracking-wide text-primary">Command Center</p>
        <h1 className="mt-2 text-3xl font-semibold tracking-tight text-foreground">AI-Powered Operations</h1>
        <p className="mt-2 max-w-2xl text-subtle">
          A modern ERP foundation for scheduling, people operations, analytics, and communication across campuses.
        </p>
      </div>
      <div className="flex items-center gap-3">
        <Button variant="outline" size="sm">
          <Calendar className="mr-2 h-4 w-4" />
          Today
        </Button>
        <Button size="sm">
          <Download className="mr-2 h-4 w-4" />
          Export Report
        </Button>
      </div>
    </div>
  );
}
