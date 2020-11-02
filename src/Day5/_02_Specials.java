package Day5;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_Specials extends BaseDriver {
    @Test
    public void specials(){
        WebElement SpacialButton=driver.findElement(By.linkText("Specials"));
        SpacialButton.click();

        List<WebElement> oldPriceList= driver.findElements(By.cssSelector("span[class='price-old']"));

        List<WebElement> imageList= driver.findElements(By.xpath("//div[@class='image']"));
        System.out.println(oldPriceList.size()==imageList.size());
        System.out.println(oldPriceList);
        System.out.println(imageList);
        Assert.assertTrue(oldPriceList.size()==imageList.size());


    }


}
