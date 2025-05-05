package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath = "//h2[@class='_8eso']")
	WebElement welMsg;
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement pass;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getWelcomeMessage() {
		return welMsg.getText();
	}
	
	public void enterEmail(String username) {
		email.clear();
		email.sendKeys(username);
	}
	
	public String getEmailPlaceholder() {
		return email.getDomAttribute("placeholder");
	}
	
	public void enterPassword(String password) {
		pass.clear();
		pass.sendKeys(password);
	}
	
	public String getPasswordPlaceholder() {
		return pass.getDomAttribute("placeholder");
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public String getLoginBtnText() {
		return loginBtn.getText();
	}
	
	public void loginWithCredentials(String username, String password) {
		enterEmail(username);
		enterPassword(password);
//		clickLoginBtn();
	}
	
	
	
	
	
	
	
	
	
}
