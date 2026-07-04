import { Link } from 'react-router-dom';
import { Button } from '../components/ui/Button';

export function NotFoundPage() {
  return (
    <main className="grid min-h-screen place-items-center px-4 text-center">
      <div>
        <p className="text-sm font-semibold uppercase tracking-wide text-cyan-600">404</p>
        <h1 className="mt-3 text-4xl font-semibold text-slate-950 dark:text-white">Page not found</h1>
        <p className="mt-3 text-slate-500">The workspace view you requested does not exist.</p>
        <Link className="mt-6 inline-block" to="/dashboard">
          <Button>Return to dashboard</Button>
        </Link>
      </div>
    </main>
  );
}
