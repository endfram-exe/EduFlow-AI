import {
  BarChart3,
  Bell,
  BookOpen,
  Building2,
  CalendarCheck,
  CalendarDays,
  DoorOpen,
  FlaskConical,
  GraduationCap,
  LayoutDashboard,
  Settings,
  UserCircle,
  Users,
} from 'lucide-react';
import type { NavItem } from '../types';

export const primaryNavigation: NavItem[] = [
  { label: 'Dashboard', href: '/dashboard', icon: LayoutDashboard, section: 'Workspace' },
  { label: 'Teachers', href: '/teachers', icon: Users, section: 'Academics' },
  { label: 'Students', href: '/students', icon: GraduationCap, section: 'Academics' },
  { label: 'Classes', href: '/classes', icon: Building2, section: 'Academics' },
  { label: 'Sections', href: '/sections', icon: CalendarCheck, section: 'Academics' },
  { label: 'Subjects', href: '/subjects', icon: BookOpen, section: 'Academics' },
  { label: 'Timetable', href: '/timetable', icon: CalendarDays, section: 'Operations' },
  { label: 'Rooms', href: '/rooms', icon: DoorOpen, section: 'Operations' },
  { label: 'Laboratories', href: '/laboratories', icon: FlaskConical, section: 'Operations' },
  { label: 'Attendance', href: '/attendance', icon: CalendarCheck, section: 'Insights' },
  { label: 'Analytics', href: '/analytics', icon: BarChart3, section: 'Insights' },
  { label: 'Notifications', href: '/notifications', icon: Bell, section: 'Workspace' },
  { label: 'Settings', href: '/settings', icon: Settings, section: 'Workspace' },
  { label: 'Profile', href: '/profile', icon: UserCircle, section: 'Workspace' },
];
