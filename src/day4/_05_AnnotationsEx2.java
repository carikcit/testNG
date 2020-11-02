package day4;

import org.testng.annotations.Test;

public class _05_AnnotationsEx2 {
     /*
    so, logically, we can replace beforeclass with before test, if the test cases coming from the same package, right?
     */

    @Test
    public void test1In05(){

        System.out.println("Test1 in the _05_Class");
    }

    @Test
    public void test2In05(){

        System.out.println("Test2 in the _05_Class");
    }
}
