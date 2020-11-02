package Day5;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUs extends BaseDriver {


    @Test
    @Parameters("enquiry")
    public void contactUs(String enquiry) {
        WebElement contactButton = driver.findElement(By.linkText("Contact Us"));
        contactButton.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.sendKeys(enquiry);

        WebElement submitButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submitButton.click();


        WebElement successMessage = driver.findElement(By.cssSelector("div[id='content']>p"));
        Assert.assertTrue(successMessage.getText().contains("successfully"));
    }


}
