package test;

import java.util.Arrays;


public class Noughts_and_Crosses {

    public static void main(String[] args) {

        char[][] mas = new char[3][3];
        char x = 'x';
        char o  = 'o';
        char empty = '.';
        int num1 = 9;



        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                Arrays.fill(mas, empty);
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }

    }
}
