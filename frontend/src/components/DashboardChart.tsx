import { Area, AreaChart, CartesianGrid, ResponsiveContainer, Tooltip, XAxis, YAxis } from 'recharts';

const data = [
  { month: 'Jan', utilization: 71, coverage: 82 },
  { month: 'Feb', utilization: 76, coverage: 86 },
  { month: 'Mar', utilization: 82, coverage: 88 },
  { month: 'Apr', utilization: 79, coverage: 91 },
  { month: 'May', utilization: 86, coverage: 93 },
  { month: 'Jun', utilization: 91, coverage: 96 },
];

export function DashboardChart() {
  return (
    <div className="h-72">
      <ResponsiveContainer width="100%" height="100%">
        <AreaChart data={data}>
          <defs>
            <linearGradient id="utilization" x1="0" x2="0" y1="0" y2="1">
              <stop offset="5%" stopColor="#0b3b8f" stopOpacity={0.28} />
              <stop offset="95%" stopColor="#0b3b8f" stopOpacity={0} />
            </linearGradient>
          </defs>
          <CartesianGrid strokeDasharray="3 3" stroke="#e2e8f0" />
          <XAxis dataKey="month" tickLine={false} axisLine={false} />
          <YAxis tickLine={false} axisLine={false} />
          <Tooltip />
          <Area type="monotone" dataKey="utilization" stroke="#0b3b8f" fill="url(#utilization)" strokeWidth={3} />
          <Area type="monotone" dataKey="coverage" stroke="#06b6d4" fill="transparent" strokeWidth={3} />
        </AreaChart>
      </ResponsiveContainer>
    </div>
  );
}
