package day3;

import java.util.ArrayList;
import java.util.Random;

public class HowisRandomNumMethodIsWorking {
    public static void main(String[] args) {

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("A1");
        s1.add("B2");
        s1.add("C3");
        s1.add("D4");
        s1.add("E5");

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            int randomNum = rnd.nextInt(5 - 1) + 1;

            System.out.println(s1.get(randomNum));
        }

    }
}
