describe('TimeForge shell', () => {
  it('loads the landing page', () => {
    cy.visit('/');
    cy.contains('TimeForge');
    cy.contains('Open dashboard');
  });
});
