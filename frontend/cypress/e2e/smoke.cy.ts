describe('EduFlow AI shell', () => {
  it('loads the landing page', () => {
    cy.visit('/');
    cy.contains('EduFlow AI');
    cy.contains('Open dashboard');
  });
});
