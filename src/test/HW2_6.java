package test;

import java.util.Random;

public class HW2_6 {

    public static void main(String[] args) {
        int[] mas = new int[4];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10) + 1;
            System.out.print(" " + mas[i]);
        }

        System.out.println();

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < mas[i - 1]) {
                System.out.println("Progression is not increasing");
                break;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i + 1] > mas[i] && mas[i + 2] < mas[i + 3]) {
                System.out.println("Progression is increasing");
            }
        }
    }
}


