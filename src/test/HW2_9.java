package test;

import java.util.Random;
import java.util.Scanner;

public class HW2_9 {

    public static void main (String[] args){


        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = 0;
        int number = sc.nextInt();
        double result1 = 0;
        double result2 = 0;

        if (sc.hasNextInt() && number > 0){
            System.out.println("Thanks, you entered " + number);
            num = number;
        } else {
            System.out.println("You entered negative number");
        }
        sc.close();

        int[] mas = new int[num];

        for (int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(15) + 1;
            System.out.print(" " + mas[i]);
        }
        System.out.println();

        for (int i = 0; i < mas.length / 2; i++){
            result1 = result1 + mas[i];
        }
        for (int i = mas.length - 1; i > mas.length / 2; i--){
            result2 = result2 + mas[i];
        }
        if (result1 > result2){
            System.out.println("First part of array is bigger than the second one");
        } else if (result2 > result1){
            System.out.println("The second array is bigger than the first one");
        } if (result1 == result2){
            System.out.println("They are equal");
        }
    }
}
