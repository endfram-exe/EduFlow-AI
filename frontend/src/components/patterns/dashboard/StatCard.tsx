import { type ReactNode } from 'react';
import { motion } from 'framer-motion';
import { Card, CardContent } from '../../ui/Card';
import { Badge } from '../../ui/Badge';
import { cn } from '../../../lib/utils';
import { TrendingUp, TrendingDown, Minus } from 'lucide-react';

export interface StatCardProps {
  title: string;
  value: string;
  meta: string;
  icon: ReactNode;
  trend?: {
    value: number;
    label: string;
  };
  className?: string;
  children?: ReactNode;
  delay?: number;
}

export function StatCard({ title, value, meta, icon, trend, className, children, delay = 0 }: StatCardProps) {
  return (
    <motion.div
      initial={{ opacity: 0, y: 15 }}
      animate={{ opacity: 1, y: 0 }}
      transition={{ duration: 0.4, delay, ease: 'easeOut' }}
    >
      <Card className={cn('min-h-[160px] hover:shadow-md transition-all duration-card', className)}>
        <CardContent className="p-5 flex flex-col h-full justify-between">
          <div>
            <div className="flex items-start justify-between gap-4">
              <p className="text-sm font-medium text-subtle">{title}</p>
              <div className="flex h-10 w-10 shrink-0 items-center justify-center rounded-lg bg-primary/10 text-primary">
                {icon}
              </div>
            </div>
            <div className="mt-2 flex items-baseline gap-2">
              <h3 className="text-3xl font-semibold tracking-tight text-foreground">{value}</h3>
              {trend && (
                <Badge tone={trend.value > 0 ? 'success' : trend.value < 0 ? 'danger' : 'neutral'} className="h-6">
                  {trend.value > 0 ? <TrendingUp className="mr-1 h-3 w-3" /> : trend.value < 0 ? <TrendingDown className="mr-1 h-3 w-3" /> : <Minus className="mr-1 h-3 w-3" />}
                  {Math.abs(trend.value)}%
                </Badge>
              )}
            </div>
            <p className="mt-2 text-sm text-subtle">{meta}</p>
          </div>
          {children && <div className="mt-4">{children}</div>}
        </CardContent>
      </Card>
    </motion.div>
  );
}
