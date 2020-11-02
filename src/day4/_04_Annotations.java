package day4;

import org.testng.annotations.*;

public class _04_Annotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite _04_Intro");
    }

    @BeforeTest//Test mean before <test> tag in the xml file.
    public void beforeTest(){
        System.out.println("Before test _04_Intro");
    }

    @AfterTest //Test mean before <test> tag in the xml file.
    public void afterTest(){
        System.out.println("After test _04_Intro");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite _04_Intro");
    }

    @BeforeClass
    public void bClass(){
        System.out.println("Before class in test _04_");
    }

    @AfterClass
    public void aClass(){
        System.out.println("After class in test _04_");
    }

    @BeforeMethod //This will run before every @Test in the class
    public void beforeMethod(){
        System.out.println("before method _04_Intro");
    }

    @AfterMethod //This will run after every @Test in the class
    public void afterMethod(){
        System.out.println("After method _04_Intro");
    }

    @Test
    public void test1(){
        System.out.println("Test1 in the _04_Intro");
    }

    @Test
    public void test2(){
        System.out.println("Test2 in the _04_Intro");
    }
}
