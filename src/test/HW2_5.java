package test;

import java.util.Random;

public class HW2_5 {

    public static void main (String[] args){
        Random rand = new Random();
        int[] mas1 = new int [5];
        int[] mas2 = new int [5];
        int sum1 = 0;
        int sum2 = 0;
        double avg1;
        double avg2;

        for (int i = 0; i < mas1.length; i++){
            mas1 [i] = rand.nextInt(15) + 1;
            sum1 = sum1 + mas1 [i];
            System.out.print(" " + mas1 [i]);
        }
        System.out.println(" ");
        for (int i = 0; i < mas2.length; i++){
            mas2 [i] = rand.nextInt(15) + 1;
            sum2 = sum2 + mas2 [i];
            System.out.print(" " + mas2 [i]);
        }
        avg1 = (double) sum1/mas1.length;
        avg2 = (double) sum2/mas2.length;

        System.out.println(" ");

        if (avg1 > avg2){
            System.out.println("Average of the first array is  bigger");
        } else if (avg2 > avg1){
            System.out.println("Average of the second array is  bigger");
        } else {
            System.out.println("Averages are equal");
        }
    }
}
