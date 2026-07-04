import { GraduationCap, Users, DoorOpen, CalendarCheck } from 'lucide-react';
import { DashboardChart } from '../components/DashboardChart';
import { Card, CardHeader, CardTitle, CardContent } from '../components/ui/Card';
import { StatCard } from '../components/patterns/dashboard/StatCard';
import { InsightWidget } from '../components/patterns/dashboard/InsightWidget';
import { DashboardHeader } from '../components/patterns/dashboard/DashboardHeader';
import { QuickActions } from '../components/patterns/dashboard/QuickActions';
import { UpcomingEvents } from '../components/patterns/dashboard/UpcomingEvents';
import { NotificationPanel } from '../components/patterns/dashboard/NotificationPanel';

const modules = [
  'Authentication', 'Teachers', 'Students', 'Subjects', 'Classes', 
  'Sections', 'Rooms', 'Labs', 'Timetables', 'Constraints', 
  'Substitutes', 'Analytics', 'Notifications', 'AI'
];

export function DashboardPage() {
  return (
    <section className="space-y-8 animate-in fade-in duration-500">
      <DashboardHeader />

      <div className="grid gap-4 sm:grid-cols-2 lg:grid-cols-4">
        <StatCard
          title="Students"
          value="12,480"
          meta="Across 18 campuses"
          icon={<GraduationCap size={22} />}
          trend={{ value: 4.2, label: 'vs last month' }}
          delay={0.1}
        />
        <StatCard
          title="Teachers"
          value="824"
          meta="96% timetable coverage"
          icon={<Users size={22} />}
          trend={{ value: 1.1, label: 'vs last month' }}
          delay={0.15}
        />
        <StatCard
          title="Rooms"
          value="312"
          meta="Live utilization model"
          icon={<DoorOpen size={22} />}
          trend={{ value: -2.4, label: 'vs last month' }}
          delay={0.2}
        />
        <StatCard
          title="Timetable Readiness"
          value="94%"
          meta="Constraint model prepared"
          icon={<CalendarCheck size={22} />}
          trend={{ value: 12, label: 'vs last month' }}
          delay={0.25}
        >
          <div className="mt-2 h-2 w-full overflow-hidden rounded-full bg-muted">
            <div className="h-full w-[94%] bg-primary transition-all duration-1000 ease-out" />
          </div>
        </StatCard>
      </div>

      <div className="grid gap-4 xl:grid-cols-3">
        <div className="xl:col-span-2 space-y-4">
          <Card>
            <CardHeader>
              <CardTitle>Operational Health</CardTitle>
            </CardHeader>
            <CardContent>
              <DashboardChart />
            </CardContent>
          </Card>
          
          <div className="grid gap-4 sm:grid-cols-2">
            <UpcomingEvents />
            <QuickActions />
          </div>
        </div>
        
        <div className="space-y-4 flex flex-col h-full">
          <InsightWidget />
          <div className="flex-1">
            <NotificationPanel />
          </div>
        </div>
      </div>
      
      <div className="grid gap-4 xl:grid-cols-3">
        <Card className="xl:col-span-3">
          <CardHeader>
            <CardTitle>Platform Modules</CardTitle>
          </CardHeader>
          <CardContent>
            <div className="grid grid-cols-2 sm:grid-cols-4 md:grid-cols-7 gap-3">
              {modules.map((module) => (
                <div
                  key={module}
                  className="rounded-lg border border-border bg-surface px-3 py-2 text-sm font-medium text-foreground text-center shadow-sm"
                >
                  {module}
                </div>
              ))}
            </div>
          </CardContent>
        </Card>
      </div>
    </section>
  );
}
