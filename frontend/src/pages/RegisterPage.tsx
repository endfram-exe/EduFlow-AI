import { Link } from 'react-router-dom';
import { Button } from '../components/ui/Button';
import { Card } from '../components/ui/Card';

export function RegisterPage() {
  return (
    <main className="grid min-h-screen place-items-center px-4">
      <Card className="w-full max-w-lg">
        <h1 className="text-2xl font-semibold text-slate-950 dark:text-white">Create school workspace</h1>
        <p className="mt-2 text-sm text-slate-500">Set up the operating layer for a campus group.</p>
        <form className="mt-6 grid gap-4">
          <input className="h-11 rounded-lg border border-slate-200 bg-white px-3 text-sm outline-none focus:ring-2 focus:ring-cyan-300 dark:border-slate-800 dark:bg-slate-950" placeholder="School group name" />
          <input className="h-11 rounded-lg border border-slate-200 bg-white px-3 text-sm outline-none focus:ring-2 focus:ring-cyan-300 dark:border-slate-800 dark:bg-slate-950" placeholder="Work email" type="email" />
          <input className="h-11 rounded-lg border border-slate-200 bg-white px-3 text-sm outline-none focus:ring-2 focus:ring-cyan-300 dark:border-slate-800 dark:bg-slate-950" placeholder="Region" />
          <Link to="/dashboard">
            <Button className="w-full" type="button">Create workspace</Button>
          </Link>
        </form>
      </Card>
    </main>
  );
}
