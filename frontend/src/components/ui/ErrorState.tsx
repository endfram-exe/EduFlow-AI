import { AlertTriangle } from 'lucide-react';
import { Card } from './Card';
import { Button } from './Button';

type ErrorStateProps = {
  title: string;
  description: string;
};

export function ErrorState({ title, description }: ErrorStateProps) {
  return (
    <Card className="border-danger/30 bg-danger/5">
      <AlertTriangle className="text-danger" size={22} />
      <h3 className="mt-4 text-lg font-semibold">{title}</h3>
      <p className="mt-2 text-sm leading-6 text-subtle">{description}</p>
      <Button className="mt-5" variant="danger" type="button">
        Review issue
      </Button>
    </Card>
  );
}
