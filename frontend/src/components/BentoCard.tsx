import type { ReactNode } from 'react';
import { motion } from 'framer-motion';
import { Card } from './ui/Card';
import { cn } from '../lib/utils';

type BentoCardProps = {
  title: string;
  value: string;
  meta: string;
  icon: ReactNode;
  className?: string;
  children?: ReactNode;
};

export function BentoCard({ title, value, meta, icon, className, children }: BentoCardProps) {
  return (
    <motion.div initial={{ opacity: 0, y: 14 }} animate={{ opacity: 1, y: 0 }} transition={{ duration: 0.35 }}>
      <Card className={cn('min-h-40', className)}>
        <div className="flex items-start justify-between gap-4">
          <div>
            <p className="text-sm font-medium text-slate-500 dark:text-slate-400">{title}</p>
            <h3 className="mt-3 text-3xl font-semibold text-slate-950 dark:text-white">{value}</h3>
            <p className="mt-2 text-sm text-slate-500 dark:text-slate-400">{meta}</p>
          </div>
          <div className="rounded-xl bg-cyanSoft p-3 text-primary dark:bg-cyan-950/60 dark:text-cyan-200">{icon}</div>
        </div>
        {children ? <div className="mt-5">{children}</div> : null}
      </Card>
    </motion.div>
  );
}
