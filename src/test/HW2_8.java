package test;

import java.util.Random;

public class HW2_8 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        double[] mas3 = new double[10];
        int integer = 0;

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rand.nextInt(9) + 1;
            System.out.print(" " + mas1[i]);
        }

        System.out.println();

        for (int j = 0; j < mas2.length; j++) {
            mas2[j] = rand.nextInt(9) + 1;
            System.out.print(" " + mas2[j]);
        }

        System.out.println();

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (i == j) {
                    for (int k = 0; k < mas3.length; k++) {
                        mas3[k] = (double) mas1[i] / mas2[j];
                        System.out.print(" " + mas3[k]);
                        if (mas3[k] % 1 == 0){
                            integer = integer + 1;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Amount of integer numbers is " + integer);
    }
}