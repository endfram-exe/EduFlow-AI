import type { ChartDatum, ClassGroup, NotificationItem, Student, Teacher } from '../types';

export const teachers: Teacher[] = [
  { id: 'TF-T-104', name: 'Maya Srinivasan', department: 'Mathematics', workload: 78, status: 'Balanced' },
  { id: 'TF-T-118', name: 'Owen Ramirez', department: 'Physics', workload: 86, status: 'Review' },
  { id: 'TF-T-121', name: 'Leah Chen', department: 'Computer Science', workload: 72, status: 'Available' },
  { id: 'TF-T-143', name: 'Arjun Mehta', department: 'English', workload: 81, status: 'Balanced' },
];

export const students: Student[] = [
  { id: 'ST-2841', name: 'Aarav Kapoor', grade: 'Grade 10', attendance: 96, advisor: 'Maya Srinivasan' },
  { id: 'ST-3018', name: 'Nora Williams', grade: 'Grade 9', attendance: 93, advisor: 'Owen Ramirez' },
  { id: 'ST-3122', name: 'Isha Nair', grade: 'Grade 11', attendance: 98, advisor: 'Leah Chen' },
  { id: 'ST-3307', name: 'Ethan Brooks', grade: 'Grade 8', attendance: 91, advisor: 'Arjun Mehta' },
];

export const classGroups: ClassGroup[] = [
  { id: 'CL-10', name: 'Grade 10', sections: 5, students: 186, lead: 'Maya Srinivasan' },
  { id: 'CL-09', name: 'Grade 9', sections: 4, students: 154, lead: 'Owen Ramirez' },
  { id: 'CL-11', name: 'Grade 11', sections: 6, students: 208, lead: 'Leah Chen' },
];

export const notifications: NotificationItem[] = [
  { id: 'N-01', title: 'Physics lab conflict resolved', detail: 'AI moved Grade 9B practical to Lab 3 without staff overload.', time: '11 min ago', tone: 'success' },
  { id: 'N-02', title: 'Substitute coverage recommended', detail: 'Two coverage options are available for Friday second period.', time: '32 min ago', tone: 'warning' },
  { id: 'N-03', title: 'Attendance anomaly detected', detail: 'Grade 8C has a 7% drop against its four-week trend.', time: '1 hr ago', tone: 'danger' },
];

export const upcomingEvents = [
  { title: 'Science assessment window', time: 'Today, 1:30 PM', campus: 'North Campus' },
  { title: 'Timetable approval sync', time: 'Tomorrow, 9:00 AM', campus: 'Academic Office' },
  { title: 'Parent communication batch', time: 'Friday, 4:15 PM', campus: 'All campuses' },
];

export const recentActivities = [
  'AI generated 42 timetable improvements for Grade 10.',
  'Teacher workload model recalculated after room maintenance.',
  'Attendance digest prepared for section coordinators.',
  'New Computer Science elective mapped to Lab 2 capacity.',
];

export const attendanceChartData: ChartDatum[] = [
  { label: 'Mon', attendance: 94 },
  { label: 'Tue', attendance: 96 },
  { label: 'Wed', attendance: 93 },
  { label: 'Thu', attendance: 97 },
  { label: 'Fri', attendance: 95 },
  { label: 'Sat', attendance: 91 },
];

export const workloadChartData: ChartDatum[] = [
  { label: 'Math', workload: 78 },
  { label: 'Science', workload: 84 },
  { label: 'English', workload: 72 },
  { label: 'Arts', workload: 64 },
  { label: 'Sports', workload: 69 },
];

export const growthChartData: ChartDatum[] = [
  { label: 'Jan', growth: 1180 },
  { label: 'Feb', growth: 1218 },
  { label: 'Mar', growth: 1266 },
  { label: 'Apr', growth: 1310 },
  { label: 'May', growth: 1368 },
  { label: 'Jun', growth: 1424 },
];

export const labUtilizationData: ChartDatum[] = [
  { label: 'Lab 1', utilization: 82 },
  { label: 'Lab 2', utilization: 76 },
  { label: 'Lab 3', utilization: 91 },
  { label: 'Robotics', utilization: 68 },
];

export const timetableStatsData: ChartDatum[] = [
  { label: 'Week 1', generated: 84, manual: 16 },
  { label: 'Week 2', generated: 88, manual: 12 },
  { label: 'Week 3', generated: 91, manual: 9 },
  { label: 'Week 4', generated: 94, manual: 6 },
];
