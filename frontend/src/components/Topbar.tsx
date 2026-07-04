import { Menu, Search } from 'lucide-react';
import { ThemeToggle } from './ThemeToggle';
import { Button } from './ui/Button';
import { Avatar, AvatarFallback } from './ui/Avatar';

export function Topbar() {
  return (
    <header className="sticky top-0 z-sticky border-b border-border bg-background/80 px-4 py-3 backdrop-blur-xl">
      <div className="flex items-center justify-between gap-4">
        <Button variant="ghost" className="h-10 w-10 px-0 lg:hidden" aria-label="Open navigation">
          <Menu size={20} />
        </Button>
        <div className="group hidden min-w-0 flex-1 items-center gap-3 rounded-xl border border-border bg-surface px-3 py-2 text-sm text-subtle shadow-sm transition-all focus-within:border-primary focus-within:ring-1 focus-within:ring-primary md:flex">
          <Search size={18} className="text-subtle transition-colors group-focus-within:text-primary" />
          <input 
            type="text" 
            placeholder="Search students, teachers, rooms, constraints..." 
            className="w-full bg-transparent outline-none placeholder:text-muted"
          />
        </div>
        <div className="flex items-center gap-3">
          <ThemeToggle />
          <Avatar className="cursor-pointer transition-transform hover:scale-105">
            <AvatarFallback className="bg-primary text-primary-foreground">TF</AvatarFallback>
          </Avatar>
        </div>
      </div>
    </header>
  );
}
