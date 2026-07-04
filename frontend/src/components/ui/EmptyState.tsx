import type { LucideIcon } from 'lucide-react';
import { Sparkles } from 'lucide-react';
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from './Card';
import { cn } from '../../lib/utils';
import type { HTMLAttributes } from 'react';

export interface EmptyStateProps extends HTMLAttributes<HTMLDivElement> {
  title: string;
  description: string;
  icon?: LucideIcon;
}

export function EmptyState({ title, description, icon: Icon = Sparkles, className, ...props }: EmptyStateProps) {
  return (
    <Card className={cn("text-center", className)} {...props}>
      <CardHeader>
        <div className="mx-auto flex h-12 w-12 items-center justify-center rounded-button bg-primary/10 text-primary">
          <Icon size={22} />
        </div>
        <CardTitle className="mt-4">{title}</CardTitle>
        <CardDescription className="mx-auto max-w-md">{description}</CardDescription>
      </CardHeader>
      <CardContent />
    </Card>
  );
}
