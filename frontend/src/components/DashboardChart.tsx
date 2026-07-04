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
    <div className="h-72 w-full pt-4">
      <ResponsiveContainer width="100%" height="100%">
        <AreaChart data={data} margin={{ top: 0, right: 0, left: -20, bottom: 0 }}>
          <defs>
            <linearGradient id="utilization" x1="0" x2="0" y1="0" y2="1">
              <stop offset="5%" stopColor="hsl(var(--tf-primary))" stopOpacity={0.28} />
              <stop offset="95%" stopColor="hsl(var(--tf-primary))" stopOpacity={0} />
            </linearGradient>
          </defs>
          <CartesianGrid strokeDasharray="3 3" stroke="hsl(var(--tf-border))" vertical={false} />
          <XAxis 
            dataKey="month" 
            tickLine={false} 
            axisLine={false} 
            tick={{ fill: 'hsl(var(--tf-muted))', fontSize: 12 }} 
            dy={10}
          />
          <YAxis 
            tickLine={false} 
            axisLine={false} 
            tick={{ fill: 'hsl(var(--tf-muted))', fontSize: 12 }}
          />
          <Tooltip 
            contentStyle={{ 
              backgroundColor: 'hsl(var(--tf-surface))', 
              borderColor: 'hsl(var(--tf-border))',
              borderRadius: 'var(--tf-radius-md)',
              boxShadow: 'var(--tf-shadow-md)',
              color: 'hsl(var(--tf-text-primary))'
            }} 
            itemStyle={{ color: 'hsl(var(--tf-text-primary))' }}
          />
          <Area 
            type="monotone" 
            dataKey="utilization" 
            stroke="hsl(var(--tf-primary))" 
            fill="url(#utilization)" 
            strokeWidth={3} 
          />
          <Area 
            type="monotone" 
            dataKey="coverage" 
            stroke="hsl(var(--tf-secondary))" 
            fill="transparent" 
            strokeWidth={3} 
          />
        </AreaChart>
      </ResponsiveContainer>
    </div>
  );
}
