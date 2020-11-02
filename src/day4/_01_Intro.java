package day4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class _01_Intro {


    /*
        Before Method is running before every @Test
        BeforeTest is running before every test <tag> in the xml file
     */


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @Test
    public void test1() {
        System.out.println("Test1 in the _01_Intro");
    }

    @Test
    public void test2() {
        System.out.println("Test2 in the _01_Intro");
    }


}
