export const designSystem = {
  colors: {
    primary: '#2563EB',
    secondary: '#38BDF8',
    success: '#10B981',
    warning: '#F59E0B',
    danger: '#EF4444',
    background: '#F8FAFC',
    surface: '#FFFFFF',
    border: '#E5E7EB',
    textPrimary: '#0F172A',
    textSecondary: '#64748B',
    muted: '#94A3B8',
  },
  typography: {
    heading: 'Poppins',
    body: 'Inter',
    statistics: 'IBM Plex Sans',
  },
  radius: {
    button: '12px',
    input: '14px',
    card: '24px',
    dialog: '24px',
    avatar: '999px',
  },
  motion: {
    hover: '150ms',
    card: '200ms',
    dialog: '250ms',
    page: '300ms',
  },
  spacing: {
    grid: '12 columns desktop, 8 columns tablet, 4 columns mobile',
  },
} as const;
