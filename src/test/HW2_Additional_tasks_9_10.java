package test;

import java.util.Random;

public class HW2_Additional_tasks_9_10 {

    public static void main(String[] args) {

        int[] mas = new int[10];
        Random rand = new Random();
        int min1 = 101;
        int max = 0;
        int index1 = 0;
        int change;


        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100) + 1;
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0 && mas[i] < min1) {
                min1 = mas[i];
            }
        }
        System.out.println("Minimum element of the array with even indexes = " + min1);
        System.out.println("-----------");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                index1 = i;
            }
        }
        for (int i = 0; i < mas.length; i++) {

            change = mas[0];
            mas[0] = mas[index1];
            mas[index1] = change;


            System.out.print(mas[i] + " ");



        }
    }
}
