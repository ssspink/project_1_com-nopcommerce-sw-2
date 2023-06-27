package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        OpenBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Locating element by locators
        driver.findElement(By.linkText("Log in")).click();
        //expected result
        String expectedText = "Welcome, Please Sign In!";
        // Getting text using get.Text method
        String actualText = driver.findElement(By.tagName("h1")).getText();
        //Comparing expected and actual result
        Assert.assertEquals("Check if is redirected to login page", expectedText, actualText);

    }

    @Test //Using Test annotation
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Locating elements and clicking the on the elements
        driver.findElement(By.linkText("Log in")).click();

        //entering valid username
        driver.findElement(By.id("Email")).sendKeys("pinkal2109@yahoo.co.uk");
        //entering password
        driver.findElement(By.id("Password")).sendKeys("password");
        //clicking log in button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedLogOutMessage = "Log out";
        String actualLogOutMessage = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("The Logout verification", expectedLogOutMessage, actualLogOutMessage);
        //put Thread sleep to wait to view the display

        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        Thread.sleep(8000);

    }

    @Test
    public void verifyTheErrorMessage() throws InterruptedException {
        //Locating elements and clicking the on the elements
        driver.findElement(By.linkText("Log in")).click();
        //entering valid username
        driver.findElement(By.id("Email")).sendKeys("spinkal2109@yahoo.co.uk");
        //entering password
        driver.findElement(By.id("Password")).sendKeys("ppassword");
        //clicking log in button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("The error Message Verifiction", expectedErrorMessage, actualErrorMessage);
        Thread.sleep(8000);
    }



        //closing the browser
        @After
        public void tearDown()
        {
            closeBrowser();
        }


    }

