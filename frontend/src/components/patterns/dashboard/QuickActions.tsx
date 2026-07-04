import { motion } from 'framer-motion';
import { Card, CardHeader, CardTitle, CardContent } from '../../ui/Card';
import { Button } from '../../ui/Button';
import { FilePlus2, UserPlus, CalendarPlus, Wand2 } from 'lucide-react';

const actions = [
  { label: 'Add Student', icon: UserPlus, variant: 'secondary' as const },
  { label: 'New Timetable', icon: CalendarPlus, variant: 'secondary' as const },
  { label: 'Import Data', icon: FilePlus2, variant: 'secondary' as const },
  { label: 'AI Optimize', icon: Wand2, variant: 'primary' as const },
];

export function QuickActions() {
  return (
    <Card className="h-full">
      <CardHeader>
        <CardTitle>Quick Actions</CardTitle>
      </CardHeader>
      <CardContent>
        <div className="grid grid-cols-2 gap-3 sm:grid-cols-4 xl:grid-cols-2 2xl:grid-cols-4">
          {actions.map((action, i) => (
            <motion.div
              key={action.label}
              initial={{ opacity: 0, scale: 0.95 }}
              animate={{ opacity: 1, scale: 1 }}
              transition={{ duration: 0.2, delay: i * 0.05 }}
            >
              <Button
                variant={action.variant}
                className="h-auto w-full flex-col gap-2 py-4 shadow-sm"
              >
                <action.icon className="h-5 w-5" />
                <span className="text-xs">{action.label}</span>
              </Button>
            </motion.div>
          ))}
        </div>
      </CardContent>
    </Card>
  );
}
