import { BarChart3, Bell, Bot, CalendarDays, GraduationCap, LayoutDashboard, Settings, Users } from 'lucide-react';
import { NavLink } from 'react-router-dom';
import { cn } from '../lib/utils';
import { motion } from 'framer-motion';

const navItems = [
  { label: 'Dashboard', href: '/dashboard', icon: LayoutDashboard },
  { label: 'Students', href: '/dashboard?view=students', icon: GraduationCap },
  { label: 'Teachers', href: '/dashboard?view=teachers', icon: Users },
  { label: 'Timetable', href: '/dashboard?view=timetable', icon: CalendarDays },
  { label: 'Analytics', href: '/dashboard?view=analytics', icon: BarChart3 },
  { label: 'AI Insights', href: '/dashboard?view=ai', icon: Bot },
  { label: 'Notifications', href: '/dashboard?view=notifications', icon: Bell },
  { label: 'Settings', href: '/settings', icon: Settings },
];

export function Sidebar() {
  return (
    <aside className="hidden min-h-screen w-72 border-r border-border bg-surface/80 px-4 py-5 backdrop-blur-xl lg:block">
      <div className="flex items-center gap-3 px-2">
        <div className="grid h-10 w-10 place-items-center rounded-xl bg-primary text-primary-foreground shadow-sm">
          <GraduationCap size={21} />
        </div>
        <div>
          <p className="text-sm font-semibold text-foreground tracking-tight">TimeForge</p>
          <p className="text-[11px] font-medium text-subtle uppercase tracking-wider">AI-Powered OS</p>
        </div>
      </div>
      <nav className="mt-8 space-y-1">
        {navItems.map((item) => (
          <NavLink
            key={item.label}
            to={item.href}
            className={({ isActive }) =>
              cn(
                'group relative flex items-center gap-3 rounded-lg px-3 py-2.5 text-sm font-medium transition-colors duration-200',
                isActive 
                  ? 'bg-accent text-foreground' 
                  : 'text-subtle hover:bg-accent/50 hover:text-foreground'
              )
            }
          >
            {({ isActive }) => (
              <>
                {isActive && (
                  <motion.div
                    layoutId="sidebar-active"
                    className="absolute inset-0 rounded-lg bg-accent"
                    initial={false}
                    transition={{ type: 'spring', stiffness: 300, damping: 30 }}
                  />
                )}
                <item.icon size={18} className="relative z-10" />
                <span className="relative z-10">{item.label}</span>
              </>
            )}
          </NavLink>
        ))}
      </nav>
    </aside>
  );
}
