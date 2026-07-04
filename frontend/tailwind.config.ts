import type { Config } from 'tailwindcss';

export default {
  darkMode: ['class'],
  content: ['./index.html', './src/**/*.{ts,tsx}'],
  theme: {
    extend: {
      colors: {
        border: 'hsl(var(--border))',
        background: 'hsl(var(--background))',
        foreground: 'hsl(var(--foreground))',
        primary: {
          DEFAULT: '#0b3b8f',
          foreground: '#ffffff',
        },
        cyanSoft: '#dffbff',
        surface: '#f8fafc',
      },
      boxShadow: {
        soft: '0 18px 60px rgba(15, 23, 42, 0.10)',
      },
      borderRadius: {
        card: '1rem',
      },
    },
  },
  plugins: [],
} satisfies Config;
