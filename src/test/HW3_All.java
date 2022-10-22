package test;

import java.util.Random;
import java.util.Scanner;

public class HW3_All {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int product1 = 1;
        int product2 = 1;

        System.out.println("Enter the size of the matrix");
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
            num2 = num1;
        }

        int[][] mas = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                mas[i][j] = rand.nextInt(50) + 1;
                System.out.print(mas[i][j] + " ");
                if (i == j && mas[i][j] % 2 == 0) {
                    sum = sum + mas[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum of the main diagonal of the even numbers = " + sum);

        System.out.println("-------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    product1 = product1 * mas[i][j];
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == mas.length - j - 1 && j == mas.length - 1 - i) {
                    product2 = product2 * mas[i][j];
                }
            }
        }
        if (product1 > product2) {
            System.out.print("Product of main diagonal multipliers is bigger and equals to " + product1);
        } else if (product2 > product1) {
            System.out.print("Product of secondary diagonal multipliers is bigger and equals to " + product2);
        } else {
            System.out.print("They are equal");
        }

        System.out.println();
        System.out.println("------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < num1; k++) {
                    if ((i == j) || (i == j + k && j == i - k)) {
                        if (mas[i][j] % 2 == 1) {
                            System.out.print(mas[i][j] + " ");
                            break;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("--------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 2; k < num1; k++) {
                    if ((i == 0 && j == 0) || (i == mas.length - j - k && j == mas.length - i - k) && (j != mas.length - i - 1 && i != mas.length - j - 1)) {
                        if (mas[i][j] % 2 == 0) {
                            System.out.print(mas[i][j] + " ");
                            break;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas[i].length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}


