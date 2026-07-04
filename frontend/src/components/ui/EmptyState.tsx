import type { LucideIcon } from 'lucide-react';
import { Sparkles } from 'lucide-react';
import { Card } from './Card';

type EmptyStateProps = {
  title: string;
  description: string;
  icon?: LucideIcon;
};

export function EmptyState({ title, description, icon: Icon = Sparkles }: EmptyStateProps) {
  return (
    <Card className="text-center">
      <div className="mx-auto grid h-12 w-12 place-items-center rounded-button bg-primary/10 text-primary">
        <Icon size={22} />
      </div>
      <h3 className="mt-4 text-lg font-semibold">{title}</h3>
      <p className="mx-auto mt-2 max-w-md text-sm leading-6 text-subtle">{description}</p>
    </Card>
  );
}
