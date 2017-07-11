import { Angular4ClientPage } from './app.po';

describe('angular4-client App', () => {
  let page: Angular4ClientPage;

  beforeEach(() => {
    page = new Angular4ClientPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
