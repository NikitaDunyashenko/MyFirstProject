package test;

import java.util.Random;

public class HW2_Additional {

    public static void main(String[] args) {

        int[] mas = new int[10];
        Random rand = new Random();
        int result = 1;
        int sum1 = 0;
        int n = 0;
        double avg1;
        int C = 34;
        int sum2 = 0;
        double avg2;
        int k = 0;
        int m = 0;
        int max = 0;
        int max1 = 0;
        int index1 = 0;
        int min1 = 101;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100) + 1;
            if (mas[i] % 3 == 0) {
                result = result * mas[i];
            }
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        System.out.println("Product of array elements that are multiples of 3 = " + result);
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                sum1 = sum1 + mas[i];
                n = n + 1;
            }
        }
        avg1 = (double) sum1 / n;

        System.out.println("Average of the elements with odd indexes = " + avg1);
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > C) {
                sum2 = sum2 + mas[i];
                k = k + 1;
            }
        }
        avg2 = (double) sum2 / k;

        System.out.println("Average of the elements more than C = " + avg2);
        System.out.println("-----------");

        int min = mas[1];

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1 && min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println("The smallest element with an odd index = " + min);
        System.out.println("-----------");

        int[] mas2 = new int[10];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas2.length; j++) {
                if (i == j) {
                    if (j == 0 || j % 2 == 0) {
                        mas2[j] = 0;
                        System.out.print(mas2[j] + " ");
                    }
                    if (i % 2 == 1) {
                        mas2[j] = mas[i];
                        System.out.print(mas2[j] + " ");
                    }
                }
            }
        }

        System.out.print(" = Decreased array with 0 instead of numbers of even indexes");
        System.out.println();
        System.out.println("-----------");

        int[] mas3 = new int[10];
        mas3 = mas;
        boolean index = false;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas3.length; j++) {
                if (mas[i] == mas3[j] && i != j) {
                    index = true;
                }
            }
        }
        if (index == false) {
            System.out.println("Elements of the array are repeated");
        } else {
            System.out.println("Elements of the array are not repeated");
        }

        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas3.length; j++) {
                if (mas[i] == mas3[j] && i != j) {
                    m++;
                }
            }
        }
        System.out.println(m + " times we can meet a similar number");
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                index1 = i;
            }
        }
        mas3[index1] = 0;

        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] > max1) {
                max1 = mas3[i];
            }
        }
        System.out.println("Second biggest number is " + max1);
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0 && mas[i] < min1) {
                min1 = mas[i];
            }
        }
    }
}