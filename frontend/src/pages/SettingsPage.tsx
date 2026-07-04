import { ShieldCheck, SlidersHorizontal } from 'lucide-react';
import { Card } from '../components/ui/Card';

export function SettingsPage() {
  return (
    <section className="space-y-6">
      <div>
        <p className="text-sm font-semibold uppercase tracking-wide text-cyan-600">Workspace</p>
        <h1 className="mt-2 text-3xl font-semibold text-slate-950 dark:text-white">Settings</h1>
      </div>
      <div className="grid gap-4 lg:grid-cols-2">
        <Card>
          <ShieldCheck className="text-cyan-500" size={24} />
          <h2 className="mt-4 text-lg font-semibold text-slate-950 dark:text-white">Security posture</h2>
          <p className="mt-2 text-sm text-slate-500">JWT authentication, role boundaries, and audit-ready access controls are wired for implementation.</p>
        </Card>
        <Card>
          <SlidersHorizontal className="text-cyan-500" size={24} />
          <h2 className="mt-4 text-lg font-semibold text-slate-950 dark:text-white">Platform preferences</h2>
          <p className="mt-2 text-sm text-slate-500">Theme, tenant, academic year, and notification preferences belong in this workspace area.</p>
        </Card>
      </div>
    </section>
  );
}
