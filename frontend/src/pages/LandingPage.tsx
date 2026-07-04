import { ArrowRight, BarChart3, Bot, CalendarDays, GraduationCap } from 'lucide-react';
import { Link } from 'react-router-dom';
import { ThemeToggle } from '../components/ThemeToggle';
import { Button } from '../components/ui/Button';

const heroCards = [
  { title: 'Timetable AI', value: '94% readiness', icon: CalendarDays },
  { title: 'Analytics', value: '38 signals', icon: BarChart3 },
  { title: 'AI Copilot', value: 'Policy aware', icon: Bot },
  { title: 'Academics', value: '12.4k learners', icon: GraduationCap },
];

export function LandingPage() {
  return (
    <main className="min-h-screen">
      <nav className="mx-auto flex max-w-7xl items-center justify-between px-6 py-5">
        <div className="flex items-center gap-3">
          <div className="grid h-10 w-10 place-items-center rounded-xl bg-primary text-white">
            <GraduationCap size={22} />
          </div>
          <span className="text-sm font-semibold text-slate-950 dark:text-white">TimeForge</span>
        </div>
        <div className="flex items-center gap-3">
          <ThemeToggle />
          <Link to="/login">
            <Button variant="secondary">Sign in</Button>
          </Link>
        </div>
      </nav>

      <section className="mx-auto grid max-w-7xl gap-8 px-6 pb-12 pt-10 lg:grid-cols-[1.05fr_0.95fr] lg:items-center">
        <div>
          <p className="text-sm font-semibold uppercase tracking-wide text-cyan-600">The AI-Powered Academic Operating System</p>
          <h1 className="mt-4 max-w-3xl text-5xl font-semibold leading-tight text-slate-950 dark:text-white md:text-6xl">TimeForge</h1>
          <p className="mt-5 max-w-2xl text-lg leading-8 text-slate-600 dark:text-slate-300">
            A modern SaaS command center for school scheduling, academics, facilities, analytics, and intelligent operations.
          </p>
          <div className="mt-8 flex flex-wrap gap-3">
            <Link to="/dashboard">
              <Button>
                Open dashboard <ArrowRight size={18} />
              </Button>
            </Link>
            <Link to="/register">
              <Button variant="secondary">Create workspace</Button>
            </Link>
          </div>
        </div>
        <div className="rounded-[2rem] border border-white/80 bg-white/75 p-4 shadow-soft backdrop-blur dark:border-slate-800 dark:bg-slate-900/76">
          <div className="grid gap-4 md:grid-cols-2">
            {heroCards.map(({ title, value, icon: Icon }) => (
              <div key={title} className="rounded-2xl border border-slate-200 bg-slate-50 p-5 dark:border-slate-800 dark:bg-slate-950">
                <Icon className="text-cyan-500" size={24} />
                <p className="mt-6 text-sm text-slate-500">{title}</p>
                <p className="mt-1 text-2xl font-semibold text-slate-950 dark:text-white">{value}</p>
              </div>
            ))}
          </div>
        </div>
      </section>
    </main>
  );
}
