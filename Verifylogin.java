package testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobjmodel.loginpage;
import Resources.baseclass;

public class Verifylogin extends baseclass {
@Test
public void enterCredientials() throws InterruptedException {
loginpage log = new loginpage(driver);
log.enterUserName().sendKeys("kunal");
log.enterPassword().sendKeys("kunal123");
log.clickonLogin().click();
log.clickonamount().click();
Thread.sleep(5000);

}
}
