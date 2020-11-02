package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReusableMethods  {
    /*
       Create one method
       Parameter is two List of String
       Verify both of the list is equal
    */
    public static void verifyTwoStringList(List<String> list1 , List<String> list2){

        for(int i = 0 ; i <list1.size() ; i++){

//            System.out.println(list1.get(i).equals(list2.get(i)));
            Assert.assertEquals(list1.get(i) , list2.get(i));

        }

    }

        /*
            Create a method
            Which is taking a WebElement list
            Make each WebElement to String (get the text from each one)
            Return the List of String
         */

    public static List<String> WebElmentToString(List<WebElement> myElements){

        List<String> actualResultString = new ArrayList<>();

        for(WebElement eachElement:myElements){

            actualResultString.add(eachElement.getText());

        }

        return actualResultString;
    }


    //Create one method it should search for the sucess message and verify it
    public void verifySuccessMessage(WebDriver driver){

        WebElement SuccessMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']"));

        Assert.assertTrue(SuccessMessage.getText().toLowerCase().contains("success"));
//        Assert.assertEquals(SuccessMessage.getText() , "Success: Your account has been successfully updated.");
//         Success: Your account has been successfully updated.
//         Success: Your newsletter subscription has been successfully updated
    }

    public void selectByIndex(WebElement dropdownName )   {

        Select s1 = new Select(dropdownName);

        s1.selectByIndex(RandomNumberGenerator(s1.getOptions().size()));// s1.getOptions().size() return is how many options we have in the dropdown

    }

//    Create a random number generator method and use it in the selectByIndex method

    public int RandomNumberGenerator(int max){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max-1)+1;
        /*
              int randomNumber = rnd.nextInt(10);
                0 and 10
                    0-1-2...9
                int randomNumber = rnd.nextInt(10-1)+1;
                0 and 10-1 = 9
                    0-1-2-3-4..8
                    1-2-3-4..9
         */
        return randomNumber;
    }

}
