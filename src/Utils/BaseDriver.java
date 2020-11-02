package Utils;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;

public class BaseDriver {
    protected WebDriver driver;

    @BeforeMethod(groups ={"SmokeTesting","Regression"})
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tahsin\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccount.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        try {
//        These two elements are showing in the chrome but not in the firefox
            WebElement advancedButton = driver.findElement(By.id("details-button"));
            advancedButton.click();

            //        These two elements are showing in the chrome but not in the firefox
            WebElement ProceedButton = driver.findElement(By.id("proceed-link"));
            ProceedButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("This part is just for chrome");
        }

        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("jsnow@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("123qwe");

        WebElement loginButtonLogPage = driver.findElement(By.cssSelector("input[value='Login']"));
        loginButtonLogPage.click();
    }


    @AfterMethod
    public void afterMethod() {
       // driver.quit();
    }
}


