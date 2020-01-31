package loginTestPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends PageObject {

	@Before
	public void setUp() throws Exception {
		setUpBrowser();
		assertTrue(logInButton().isDisplayed());
	}

	@Test
	public void test() {
		logInButton().click();
		assertTrue(emailInput().isDisplayed());
		emailInput().sendKeys(emailAddressParam);
		nextButton().click();
		if(accountTypeParam) {
			//TODO
			
			//I`m considering that modal with 'account type' will be displayed based on some parameter filled by tester
			//but it might be also possible to process this workflow based on accountTypeForm().isDisplayed() parameter instead of "if(accountTypeParam)"
		}else {
			assertTrue(passwordInput().isDisplayed());
			if(securityPageParam) {
				//TODO
				
				//I`m considering that security page will be displayed based on some parameter filled by tester
				//but it might be also possible to process this workflow based on securityPage().isDisplayed() parameter instead of "if(securityPageParam)"
			}else {
				passwordInput().sendKeys(passParam);
				nextButton().click();
			}
		}
		assertEquals("User is not logged in", driver.getCurrentUrl(), "https://outlook.live.com/mail/0/inbox");
	}

	@After
	public void tearDown() {
		closeBrowser();
	}
}
