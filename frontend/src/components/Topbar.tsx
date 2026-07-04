import { Menu, Search } from 'lucide-react';
import { ThemeToggle } from './ThemeToggle';
import { Button } from './ui/Button';

export function Topbar() {
  return (
    <header className="sticky top-0 z-20 border-b border-slate-200/70 bg-white/72 px-4 py-3 backdrop-blur-xl dark:border-slate-800 dark:bg-slate-950/72">
      <div className="flex items-center justify-between gap-4">
        <Button variant="ghost" className="h-10 w-10 px-0 lg:hidden" aria-label="Open navigation">
          <Menu size={20} />
        </Button>
        <div className="hidden min-w-0 flex-1 items-center gap-3 rounded-xl border border-slate-200 bg-white px-3 py-2 text-sm text-slate-500 shadow-sm dark:border-slate-800 dark:bg-slate-900 md:flex">
          <Search size={18} />
          <span>Search students, teachers, rooms, constraints</span>
        </div>
        <div className="flex items-center gap-3">
          <ThemeToggle />
          <div className="h-10 w-10 rounded-full bg-gradient-to-br from-primary to-cyan-400" aria-label="Platform admin avatar" />
        </div>
      </div>
    </header>
  );
}
