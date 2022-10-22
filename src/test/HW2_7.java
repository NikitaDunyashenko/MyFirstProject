package test;

import java.util.Random;

public class HW2_7 {

    public static void main (String[] args){

        int[] mas = new int [12];
        Random rand = new Random();
        int max = mas [0];
        int index = 0;

        for (int i = 0; i < mas.length; i++){
            mas [i] = rand.nextInt(15) + 1;
            System.out.print(" " + mas [i]);
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++){
            if (mas [0] < mas [i]){
                max = mas [i];
                index = i;
            }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Index of Maximum is " + index);
    }
}
