package day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Intro {
     /*
        dependsOnMethod
            @Test
                login
            @Test
                addToCart
                If login is not going to work do not run the addToCart test (ignore)
     */

    @Test
    public void addAddressBook(){

        System.out.println("This is addAddressBook");
        Assert.assertEquals("Hello" ,"Hello123" );

    }

    @Test(dependsOnMethods = "addAddressBook")
    public void editAddressBook(){

        System.out.println("This is editAddressBook");

    }

    @Test(dependsOnMethods = "editAddressBook")
    public void deleteAddressBook(){

        System.out.println("This is deleteAddressBook");

    }
}
