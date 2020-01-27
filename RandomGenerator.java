package randomexample;

import java.util.Random;


public class RandomGenerator {

    public static void main(String args[])
    {
        Random fgenerator=new Random();
        int i=fgenerator.nextInt(10);
        System.out.println(i);

        i=fgenerator.nextInt(10);
        System.out.println(i);
        i=fgenerator.nextInt(10);
        System.out.println(i);



    }
}
