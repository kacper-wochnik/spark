package loginTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conf {
    public WebDriver driver;	
    public WebDriverWait wait;
    
    //simplivied parameter for account type and security page
    public boolean accountTypeParam = false;
    public boolean securityPageParam = false;
    
    //sign in parameters
    public String emailAddressParam = "kwSparkTest@outlook.com";
    public String passParam = "Spark123";

    //env url parameter
    public String testUrl = "https://outlook.live.com/owa/";
	
	public void setUpBrowser() {
	    driver = new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	    wait = new WebDriverWait(driver, 15);
	    driver.manage().window().maximize();
		driver.get(testUrl);  
	}	
	
	public void closeBrowser() {
		driver.quit();  
	}	
}
