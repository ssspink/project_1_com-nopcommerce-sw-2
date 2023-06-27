package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest
{   //passing Url
    String baseUrl = " https://demo.nopcommerce.com/";
    @Before
    //Browser Set up
    public void setUp() {
        OpenBrowser(baseUrl);
    }
    //Using annotation
    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {   //Finding element by using linkText
        driver.findElement(By.linkText("Computers")).click();
        //Expected result
        String expectedMessage ="Computers";
        //actual message
        String actualMessage =driver.findElement(By.linkText("Computers")).getText();

        Assert.assertEquals("The text message is",expectedMessage ,actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {   //Finding element by using LinkText
        driver.findElement(By.linkText("Apparel")).click();
        //ExpectedMessage
        String expectedMessageApparel ="Apparel";
        //ActualMessage
       String actualMessageApparel = driver.findElement(By.linkText("Apparel")).getText();
       //Verifying expected and actual result
       Assert.assertEquals("The message is",expectedMessageApparel,actualMessageApparel);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        //finding element by using LinkText
       driver.findElement(By.linkText("Digital downloads")).click();
       //Expected Message
        String expectedMessageDigitalDownloads = "Digital downloads";
        //Actual Message
        String actualMessageDigitalDownloads =driver.findElement(By.linkText("Digital downloads")).getText();
        Assert.assertEquals("The DigitalDownloadsPages" ,expectedMessageDigitalDownloads,
                actualMessageDigitalDownloads);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
           //Finding element by using linktext
        driver.findElement(By.linkText("Books")).click();
        //Expected Message
        String expectedMessageBooks = "Books";
        String actualMessageBooks =driver.findElement(By.linkText("Books")).getText();
        Assert.assertEquals("The verify for books",expectedMessageBooks,actualMessageBooks);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        //finding element by usingLink text
        driver.findElement(By.linkText("Jewelry")).click();
        //expected Message from Required Documents
        String expectedMessageJewelry ="Jewelry";
        //Actual Message from console
        String actualMessageJewelry =driver.findElement(By.linkText("Jewelry")).getText();
        Assert.assertEquals("Compraing Expected and Actual message",
                expectedMessageJewelry ,actualMessageJewelry);
    }
        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully()
        {
            //finding element by using LinkText
            driver.findElement(By.linkText("Gift Cards")).click();
            String expectedMessageGiftCard = "Gift Cards";
            String actualMessageGiftCard= driver.findElement(By.linkText("Gift Cards")).getText();
            Assert.assertEquals(expectedMessageGiftCard,actualMessageGiftCard);

        }



}
