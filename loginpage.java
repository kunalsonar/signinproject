package Pageobjmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
public WebDriver driver;

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//button[@id='log-in']");
	private By amount = By.xpath("//th[@id='amount']");
	

public  loginpage(WebDriver driver2) {

	this.driver=driver2;
}

public WebElement enterUserName() {
return driver.findElement(username);
}

public WebElement enterPassword() {
return driver.findElement(password);
}

public WebElement clickonLogin() {
return driver.findElement(login);
}

public WebElement clickonamount() {
return driver.findElement(amount);
}


}
