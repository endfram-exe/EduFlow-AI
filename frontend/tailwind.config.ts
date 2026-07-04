import type { Config } from 'tailwindcss';

export default {
  darkMode: ['class'],
  content: ['./index.html', './src/**/*.{ts,tsx}'],
  theme: {
    extend: {
      fontFamily: {
        heading: ['Poppins', 'Inter', 'ui-sans-serif', 'system-ui'],
        body: ['Inter', 'ui-sans-serif', 'system-ui'],
        stat: ['"IBM Plex Sans"', 'Inter', 'ui-sans-serif', 'system-ui'],
      },
      colors: {
        border: 'hsl(var(--tf-border))',
        input: 'hsl(var(--tf-input))',
        ring: 'hsl(var(--tf-ring))',
        background: 'hsl(var(--tf-background))',
        surface: 'hsl(var(--tf-surface))',
        foreground: 'hsl(var(--tf-text-primary))',
        muted: 'hsl(var(--tf-muted))',
        subtle: 'hsl(var(--tf-text-secondary))',
        primary: {
          DEFAULT: 'hsl(var(--tf-primary))',
          foreground: 'hsl(var(--tf-primary-foreground))',
        },
        secondary: {
          DEFAULT: 'hsl(var(--tf-secondary))',
          foreground: 'hsl(var(--tf-secondary-foreground))',
        },
        success: {
          DEFAULT: 'hsl(var(--tf-success))',
          foreground: 'hsl(var(--tf-success-foreground))',
        },
        warning: {
          DEFAULT: 'hsl(var(--tf-warning))',
          foreground: 'hsl(var(--tf-warning-foreground))',
        },
        danger: {
          DEFAULT: 'hsl(var(--tf-danger))',
          foreground: 'hsl(var(--tf-danger-foreground))',
        },
        accent: {
          DEFAULT: 'hsl(var(--tf-accent))',
          foreground: 'hsl(var(--tf-accent-foreground))',
        },
      },
      boxShadow: {
        sm: 'var(--tf-shadow-sm)',
        md: 'var(--tf-shadow-md)',
        lg: 'var(--tf-shadow-lg)',
        soft: 'var(--tf-shadow-soft)',
        elevated: 'var(--tf-shadow-elevated)',
        focus: 'var(--tf-shadow-focus)',
      },
      borderRadius: {
        sm: 'var(--tf-radius-sm)',
        md: 'var(--tf-radius-md)',
        lg: 'var(--tf-radius-lg)',
        xl: 'var(--tf-radius-xl)',
        '2xl': 'var(--tf-radius-2xl)',
        full: 'var(--tf-radius-full)',
        button: 'var(--tf-radius-button)',
        input: 'var(--tf-radius-input)',
        card: 'var(--tf-radius-card)',
        dialog: 'var(--tf-radius-dialog)',
        avatar: 'var(--tf-radius-avatar)',
      },
      spacing: {
        1: 'var(--tf-spacing-1)',
        2: 'var(--tf-spacing-2)',
        3: 'var(--tf-spacing-3)',
        4: 'var(--tf-spacing-4)',
        5: 'var(--tf-spacing-5)',
        6: 'var(--tf-spacing-6)',
        8: 'var(--tf-spacing-8)',
        10: 'var(--tf-spacing-10)',
        12: 'var(--tf-spacing-12)',
      },
      transitionDuration: {
        fast: 'var(--tf-motion-fast)',
        normal: 'var(--tf-motion-normal)',
        slow: 'var(--tf-motion-slow)',
        hover: 'var(--tf-motion-fast)',
        card: 'var(--tf-motion-normal)',
        dialog: 'var(--tf-motion-slow)',
        page: 'var(--tf-motion-slow)',
      },
      transitionTimingFunction: {
        DEFAULT: 'var(--tf-motion-easing)',
      },
      zIndex: {
        dropdown: 'var(--tf-z-dropdown)',
        sticky: 'var(--tf-z-sticky)',
        fixed: 'var(--tf-z-fixed)',
        modal: 'var(--tf-z-modal)',
        popover: 'var(--tf-z-popover)',
        toast: 'var(--tf-z-toast)',
      },
      keyframes: {
        'accordion-down': {
          from: { height: '0' },
          to: { height: 'var(--radix-accordion-content-height)' },
        },
        'accordion-up': {
          from: { height: 'var(--radix-accordion-content-height)' },
          to: { height: '0' },
        },
      },
      animation: {
        'accordion-down': 'accordion-down 0.2s ease-out',
        'accordion-up': 'accordion-up 0.2s ease-out',
      },
    },
  },
  plugins: [require('tailwindcss-animate')],
} satisfies Config;
