package test;

import java.util.Random;

public class HW2_4 {

    public static void main (String[] args){
        int[] mas = new int [20];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++){
            mas [i] = rand.nextInt(20) + 1;
            System.out.print (" " + mas [i]);
        }
        System.out.println(" ");
        for (int i = 0; i < mas.length; i++){
            if (i % 2 == 1){
                mas [i] = 0;
            }
            System.out.print(" " + mas [i]);
        }
    }
}
