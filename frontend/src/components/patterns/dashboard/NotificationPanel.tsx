import { motion } from 'framer-motion';
import { Card, CardHeader, CardTitle, CardContent } from '../../ui/Card';
import { Badge } from '../../ui/Badge';
import { Bell } from 'lucide-react';
import { Button } from '../../ui/Button';

export function NotificationPanel() {
  return (
    <Card className="h-full flex flex-col bg-primary text-primary-foreground">
      <CardHeader>
        <div className="flex items-center justify-between">
          <CardTitle className="text-primary-foreground">System Updates</CardTitle>
          <Bell className="h-5 w-5 opacity-80" />
        </div>
      </CardHeader>
      <CardContent className="flex flex-1 flex-col justify-between">
        <div>
          <Badge tone="neutral" className="bg-white/20 text-white hover:bg-white/30 border-none">New Release</Badge>
          <h3 className="mt-4 text-xl font-semibold leading-tight text-white">TimeForge v2.4 is live</h3>
          <p className="mt-2 text-sm text-primary-foreground/80">
            We've introduced advanced predictive modeling for substitute teacher allocation. Update your preferences to opt-in.
          </p>
        </div>
        <Button variant="secondary" className="mt-6 w-full bg-white text-primary hover:bg-white/90">
          View Changelog
        </Button>
      </CardContent>
    </Card>
  );
}
