import { Activity, BrainCircuit, CalendarCheck, DoorOpen, GraduationCap, Sparkles, Users } from 'lucide-react';
import { BentoCard } from '../components/BentoCard';
import { DashboardChart } from '../components/DashboardChart';
import { Card } from '../components/ui/Card';

const modules = ['Authentication', 'Teachers', 'Students', 'Subjects', 'Classes', 'Sections', 'Rooms', 'Labs', 'Timetables', 'Constraints', 'Substitutes', 'Analytics', 'Notifications', 'AI'];

export function DashboardPage() {
  return (
    <section className="space-y-6">
      <div className="flex flex-col justify-between gap-4 md:flex-row md:items-end">
        <div>
          <p className="text-sm font-semibold uppercase tracking-wide text-cyan-600">Command center</p>
          <h1 className="mt-2 text-3xl font-semibold text-slate-950 dark:text-white">AI powered school operations</h1>
          <p className="mt-2 max-w-2xl text-slate-600 dark:text-slate-300">
            A modern ERP foundation for scheduling, people operations, analytics, and communication across campuses.
          </p>
        </div>
      </div>

      <div className="grid gap-4 md:grid-cols-2 xl:grid-cols-4">
        <BentoCard title="Students" value="12,480" meta="Across 18 campuses" icon={<GraduationCap size={22} />} />
        <BentoCard title="Teachers" value="824" meta="96% timetable coverage" icon={<Users size={22} />} />
        <BentoCard title="Rooms" value="312" meta="Live utilization model" icon={<DoorOpen size={22} />} />
        <BentoCard title="AI Signals" value="38" meta="Optimization opportunities" icon={<BrainCircuit size={22} />} />
      </div>

      <div className="grid gap-4 xl:grid-cols-3">
        <Card className="xl:col-span-2">
          <div className="mb-4 flex items-center justify-between">
            <div>
              <h2 className="text-lg font-semibold text-slate-950 dark:text-white">Operational health</h2>
              <p className="text-sm text-slate-500">Utilization and coverage trends</p>
            </div>
            <Activity className="text-cyan-500" size={22} />
          </div>
          <DashboardChart />
        </Card>
        <Card>
          <div className="flex items-center justify-between">
            <h2 className="text-lg font-semibold text-slate-950 dark:text-white">Platform modules</h2>
            <Sparkles className="text-cyan-500" size={21} />
          </div>
          <div className="mt-5 grid grid-cols-2 gap-2">
            {modules.map((module) => (
              <div key={module} className="rounded-lg border border-slate-200 bg-slate-50 px-3 py-2 text-sm font-medium text-slate-700 dark:border-slate-800 dark:bg-slate-950 dark:text-slate-200">
                {module}
              </div>
            ))}
          </div>
        </Card>
      </div>

      <div className="grid gap-4 lg:grid-cols-3">
        <BentoCard className="lg:col-span-2" title="Timetable readiness" value="94%" meta="Constraint model prepared for OR-Tools integration" icon={<CalendarCheck size={22} />}>
          <div className="h-3 rounded-full bg-slate-100 dark:bg-slate-800">
            <div className="h-3 w-[94%] rounded-full bg-gradient-to-r from-primary to-cyan-400" />
          </div>
        </BentoCard>
        <BentoCard title="Notifications" value="128k" meta="Monthly family and staff messages" icon={<Sparkles size={22} />} />
      </div>
    </section>
  );
}
