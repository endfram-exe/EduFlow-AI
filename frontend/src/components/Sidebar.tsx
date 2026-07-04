import { BarChart3, Bell, Bot, CalendarDays, GraduationCap, LayoutDashboard, Settings, Users } from 'lucide-react';
import { NavLink } from 'react-router-dom';
import { cn } from '../lib/utils';

const navItems = [
  { label: 'Dashboard', href: '/dashboard', icon: LayoutDashboard },
  { label: 'Students', href: '/dashboard?view=students', icon: GraduationCap },
  { label: 'Teachers', href: '/dashboard?view=teachers', icon: Users },
  { label: 'Timetable', href: '/dashboard?view=timetable', icon: CalendarDays },
  { label: 'Analytics', href: '/dashboard?view=analytics', icon: BarChart3 },
  { label: 'AI', href: '/dashboard?view=ai', icon: Bot },
  { label: 'Notifications', href: '/dashboard?view=notifications', icon: Bell },
  { label: 'Settings', href: '/settings', icon: Settings },
];

export function Sidebar() {
  return (
    <aside className="hidden min-h-screen w-72 border-r border-slate-200/70 bg-white/78 px-4 py-5 backdrop-blur-xl dark:border-slate-800 dark:bg-slate-950/76 lg:block">
      <div className="flex items-center gap-3 px-2">
        <div className="grid h-10 w-10 place-items-center rounded-xl bg-primary text-white">
          <GraduationCap size={21} />
        </div>
        <div>
          <p className="text-sm font-semibold text-slate-950 dark:text-white">EduFlow AI</p>
          <p className="text-xs text-slate-500">School ERP Platform</p>
        </div>
      </div>
      <nav className="mt-8 space-y-1">
        {navItems.map((item) => (
          <NavLink
            key={item.label}
            to={item.href}
            className={({ isActive }) =>
              cn(
                'flex items-center gap-3 rounded-lg px-3 py-2.5 text-sm font-medium text-slate-600 transition hover:bg-cyan-50 hover:text-primary dark:text-slate-300 dark:hover:bg-slate-900',
                isActive && 'bg-cyan-50 text-primary dark:bg-slate-900 dark:text-cyan-200',
              )
            }
          >
            <item.icon size={18} />
            {item.label}
          </NavLink>
        ))}
      </nav>
    </aside>
  );
}
