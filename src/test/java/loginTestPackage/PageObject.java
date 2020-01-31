package loginTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageObject extends Conf{
	
	public WebElement logInButton() {
		return wait.until(ExpectedConditions.visibilityOf(staticStrip().findElement(By.cssSelector("a.internal.sign-in-link"))));
	}
	
	public WebElement staticStrip() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("static-strip")));
	}

	public WebElement emailInput() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loginfmt")));
	}
	
	public WebElement passwordInput() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwd")));
	}
	
	public WebElement nextButton() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary")));
	}
}
