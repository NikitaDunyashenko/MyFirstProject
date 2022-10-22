package test;

import java.util.Random;

public class HW2_3 {

    public static void main(String[] args) {
        int[] mas = new int[15];
        Random rand = new Random();
        int even = 0;

        for (int i = 0; i < mas.length; i++){
            mas [i] = rand.nextInt(99) + 1;
            System.out.print(" " + mas [i]);
        }
        for (int i = 0; i < mas.length; i++){
            if (mas [i] % 2 == 0){
                even = even + 1;
            }
        }
        System.out.println(" ");
        System.out.println("Amount of even numbers = " + even);
    }
}