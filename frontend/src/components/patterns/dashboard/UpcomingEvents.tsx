import { motion } from 'framer-motion';
import { Card, CardHeader, CardTitle, CardContent } from '../../ui/Card';
import { Badge } from '../../ui/Badge';
import { Clock, MapPin } from 'lucide-react';

const EVENTS = [
  {
    id: 1,
    title: 'Faculty Meeting',
    time: '10:00 AM - 11:30 AM',
    location: 'Conference Room A',
    type: 'meeting',
  },
  {
    id: 2,
    title: 'Mid-term Exams Start',
    time: 'Tomorrow, 8:00 AM',
    location: 'Main Campus',
    type: 'academic',
  },
  {
    id: 3,
    title: 'System Maintenance',
    time: 'Friday, 11:00 PM',
    location: 'IT Services',
    type: 'system',
  },
];

export function UpcomingEvents() {
  return (
    <Card className="h-full">
      <CardHeader>
        <CardTitle>Upcoming Events</CardTitle>
      </CardHeader>
      <CardContent>
        <div className="space-y-4">
          {EVENTS.map((event, i) => (
            <motion.div
              key={event.id}
              initial={{ opacity: 0, y: 10 }}
              animate={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.3, delay: i * 0.1 }}
              className="flex items-start gap-4 rounded-lg border border-transparent p-2 transition-colors hover:bg-accent/50 hover:border-border"
            >
              <div className="flex flex-col items-center justify-center rounded-md bg-secondary/10 p-2 text-secondary">
                <Clock className="h-5 w-5" />
              </div>
              <div className="flex-1 space-y-1">
                <div className="flex items-center justify-between">
                  <p className="text-sm font-medium text-foreground">{event.title}</p>
                  <Badge tone="neutral" className="px-1.5 py-0 text-[10px] uppercase tracking-wider">{event.type}</Badge>
                </div>
                <div className="flex items-center gap-3 text-xs text-subtle">
                  <span>{event.time}</span>
                  <span className="flex items-center gap-1">
                    <MapPin className="h-3 w-3" />
                    {event.location}
                  </span>
                </div>
              </div>
            </motion.div>
          ))}
        </div>
      </CardContent>
    </Card>
  );
}
