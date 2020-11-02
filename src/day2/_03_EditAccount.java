package day2;

import Utils.BaseDriver;
import Utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_EditAccount extends BaseDriver {
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test(groups = "SmokeTesting")
    public void editAccountFunc(){

        editAccountFunction("John" , " Snow");
        editAccountFunction("Michael" , "Jackson");
    }

//    take 2 string as a parameter and create a new method

    public void editAccountFunction(String firstName , String lastName){

        WebElement editAccount = driver.findElement(By.linkText("Edit Account"));
        editAccount.click();

        WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
        WebElement lastNameInput = driver.findElement(By.id("input-lastname"));

        firstNameInput.clear();
        lastNameInput.clear();

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);

        WebElement continueButton =driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        continueButton.click();

        reusableMethods.verifySuccessMessage(driver);
    }

}
