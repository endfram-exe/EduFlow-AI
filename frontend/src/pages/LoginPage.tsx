import { GraduationCap } from 'lucide-react';
import { Link } from 'react-router-dom';
import { Button } from '../components/ui/Button';
import { Card } from '../components/ui/Card';

export function LoginPage() {
  return (
    <main className="grid min-h-screen place-items-center px-4">
      <Card className="w-full max-w-md">
        <div className="mb-8 flex items-center gap-3">
          <div className="grid h-10 w-10 place-items-center rounded-xl bg-primary text-white">
            <GraduationCap size={22} />
          </div>
          <div>
            <h1 className="text-xl font-semibold text-slate-950 dark:text-white">Welcome back</h1>
            <p className="text-sm text-slate-500">Sign in to EduFlow AI</p>
          </div>
        </div>
        <form className="space-y-4">
          <input className="h-11 w-full rounded-lg border border-slate-200 bg-white px-3 text-sm outline-none focus:ring-2 focus:ring-cyan-300 dark:border-slate-800 dark:bg-slate-950" placeholder="admin@school.edu" type="email" />
          <input className="h-11 w-full rounded-lg border border-slate-200 bg-white px-3 text-sm outline-none focus:ring-2 focus:ring-cyan-300 dark:border-slate-800 dark:bg-slate-950" placeholder="Password" type="password" />
          <Link to="/dashboard" className="block">
            <Button className="w-full" type="button">Sign in</Button>
          </Link>
        </form>
        <p className="mt-5 text-center text-sm text-slate-500">
          New to EduFlow AI? <Link className="font-semibold text-primary" to="/register">Create workspace</Link>
        </p>
      </Card>
    </main>
  );
}
