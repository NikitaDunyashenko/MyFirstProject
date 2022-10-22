package test;

import java.util.Random;
import java.util.Scanner;

public class HW2_10 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number more than 3");
        int number = sc.nextInt();
        int n = 0;
        int num = 0;

        if (sc.hasNextInt() && number > 3) {
            System.out.println("You entered " + number);
            n = number;
        } else {
            System.out.println("Your number is not appropriate");
        }

        System.out.println();

        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(n) + 1;
            System.out.print(" " + mas[i]);
            if (mas[i] % 2 == 0) {
                num = num + 1;
            }
        }

        System.out.println();

        int[] mas2 = new int[num];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < num; j++) {
                if (mas[i] % 2 == 0) {
                    mas2[j] = mas[i];
                    System.out.print(" " + mas2[j]);
                    break;
                }
            }
        }
    }
}