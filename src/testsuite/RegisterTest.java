package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest
{
    //base Url
    String baseUrl= "https://demo.nopcommerce.com/";
    //Browser setup
    @Before
    public void setUp()
    {
        OpenBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        //Clicking on the register page
        driver.findElement(By.linkText("Register")).click();
       //Selecting gender
        driver.findElement(By.id("gender-male")).click();
        //Inspecting and Entering value into first name field
        driver.findElement(By.id("FirstName")).sendKeys("jay");
        //Inspecting and Entering value into last name field
        driver.findElement(By.id("LastName")).sendKeys("patel");
        //selecting date of birth

        WebElement dateEle =driver.findElement(By.name("DateOfBirthDay"));
        dateEle.click();

        //Using select class to select the date
        Select  date= new Select(dateEle);
        //Using Byvalue Method to enter the date
        date.selectByValue("21");
        //Selecting month of the birth
        WebElement mothEle=driver.findElement(By.name("DateOfBirthMonth"));
       //Using select class to select the date
        Select month = new Select(mothEle);
        //getting Birth month
        month.selectByVisibleText("September");
        //getting year of the birth
        WebElement yearEle =driver.findElement(By.name("DateOfBirthYear"));
        //Using select class to select year
        Select year= new Select(yearEle);
        year.selectByVisibleText("1982");
        //Inspecting email field and Entering email ID
        driver.findElement(By.id("Email")).sendKeys("pinkal2109@yahoo.co.uk");
        //Entering password into password field
        driver.findElement(By.name("Password")).sendKeys("password");
        //confirming password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
        //clicking register button
        driver.findElement(By.id("register-button")).click();

        //Expected Result of RegisterPage
        String expectedResult= "Your registration completed";
        //ActualResul of registerPage
        String actualResult= driver.findElement(By.className("result")).getText();
              //Verifying the register
        Assert.assertEquals("The Register page result" ,expectedResult,actualResult);



    }
        @After
        public void tearDown(){
        closeBrowser();

    }


}
