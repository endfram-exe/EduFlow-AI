import type { LucideIcon } from 'lucide-react';

export type NavItem = {
  label: string;
  href: string;
  icon: LucideIcon;
  section?: string;
};

export type Teacher = {
  id: string;
  name: string;
  department: string;
  workload: number;
  status: 'Balanced' | 'Review' | 'Available';
};

export type Student = {
  id: string;
  name: string;
  grade: string;
  attendance: number;
  advisor: string;
};

export type ClassGroup = {
  id: string;
  name: string;
  sections: number;
  students: number;
  lead: string;
};

export type NotificationItem = {
  id: string;
  title: string;
  detail: string;
  time: string;
  tone: 'primary' | 'success' | 'warning' | 'danger';
};

export type ChartDatum = {
  label: string;
  attendance?: number;
  workload?: number;
  growth?: number;
  utilization?: number;
  generated?: number;
  manual?: number;
};
