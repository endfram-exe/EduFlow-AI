import { motion } from 'framer-motion';
import { Card, CardHeader, CardTitle, CardContent } from '../../ui/Card';
import { Badge } from '../../ui/Badge';
import { BrainCircuit, AlertTriangle, Zap, CheckCircle2 } from 'lucide-react';
import { Button } from '../../ui/Button';

export interface Insight {
  id: string;
  type: 'optimization' | 'warning' | 'success';
  title: string;
  description: string;
  actionLabel?: string;
  impact: string;
}

const INSIGHTS_DUMMY_DATA: Insight[] = [
  {
    id: '1',
    type: 'optimization',
    title: 'Room Utilization Opportunity',
    description: 'Science Lab 4B is underutilized by 32% on Tuesdays and Thursdays. Suggest consolidating lab sessions.',
    actionLabel: 'View Schedule',
    impact: 'High Impact',
  },
  {
    id: '2',
    type: 'warning',
    title: 'Schedule Conflict Risk',
    description: 'Professor Adams is scheduled for consecutive classes across campus next semester (Building A to E).',
    actionLabel: 'Resolve Conflict',
    impact: 'Critical',
  },
  {
    id: '3',
    type: 'success',
    title: 'Timetable Generated',
    description: 'The Spring 2027 timetable generation completed successfully satisfying 98% of hard constraints.',
    impact: 'Resolved',
  },
];

export function InsightWidget() {
  return (
    <Card className="h-full flex flex-col">
      <CardHeader className="pb-4">
        <div className="flex items-center justify-between">
          <div className="flex items-center gap-2">
            <BrainCircuit className="h-5 w-5 text-secondary" />
            <CardTitle>AI Insights</CardTitle>
          </div>
          <Badge tone="primary">3 Signals</Badge>
        </div>
      </CardHeader>
      <CardContent className="flex-1">
        <div className="space-y-4">
          {INSIGHTS_DUMMY_DATA.map((insight, index) => (
            <motion.div
              key={insight.id}
              initial={{ opacity: 0, x: -10 }}
              animate={{ opacity: 1, x: 0 }}
              transition={{ duration: 0.3, delay: index * 0.1 }}
              className="group flex flex-col gap-2 rounded-lg border border-border bg-surface p-4 transition-colors hover:bg-accent/50"
            >
              <div className="flex items-start justify-between gap-4">
                <div className="flex items-start gap-3">
                  <div className="mt-0.5 shrink-0">
                    {insight.type === 'optimization' && <Zap className="h-4 w-4 text-secondary" />}
                    {insight.type === 'warning' && <AlertTriangle className="h-4 w-4 text-warning" />}
                    {insight.type === 'success' && <CheckCircle2 className="h-4 w-4 text-success" />}
                  </div>
                  <div>
                    <h4 className="text-sm font-semibold text-foreground">{insight.title}</h4>
                    <p className="mt-1 text-sm leading-relaxed text-subtle">{insight.description}</p>
                  </div>
                </div>
              </div>
              <div className="mt-2 flex items-center justify-between pl-7">
                <Badge
                  tone={
                    insight.type === 'warning' ? 'danger' : insight.type === 'success' ? 'success' : 'secondary'
                  }
                >
                  {insight.impact}
                </Badge>
                {insight.actionLabel && (
                  <Button variant="ghost" size="sm" className="h-7 text-xs opacity-0 transition-opacity group-hover:opacity-100 focus:opacity-100">
                    {insight.actionLabel}
                  </Button>
                )}
              </div>
            </motion.div>
          ))}
        </div>
      </CardContent>
    </Card>
  );
}
