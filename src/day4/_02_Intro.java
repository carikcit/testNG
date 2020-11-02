package day4;

import org.testng.annotations.*;

public class _02_Intro {


    /*
        Before Method is running before every @Test
        BeforeTest is running before every test <tag> in the xml file
     */



    @Test
    public void test1() {
        System.out.println("Test1 in the _02_Intro");
    }

    @Test
    public void test2() {
        System.out.println("Test2 in the _02_Intro");
    }


}
