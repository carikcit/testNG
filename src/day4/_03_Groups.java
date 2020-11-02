package day4;

import org.testng.annotations.Test;

public class _03_Groups {
    @Test(groups = "Regression")
    public void Test1(){
        System.out.println("Test1 for Regression");
    }
    @Test(groups = "Regression")
    public void Test2(){
        System.out.println("Test2 for Regression");
    }
    @Test(groups = "SmokeTest")
    public void Test3(){
        System.out.println("Test3 for SmokeTest here.");
    } @Test(groups = "SmokeTest")
    public void Test4(){
        System.out.println("Test4 for SmokeTest");
    }

}
