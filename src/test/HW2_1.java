package test;

public class HW2_1 {

    public static void main(String[] args) {

        int[] mas = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i < mas.length; i++) {
            if (i == 0) {
                System.out.print(mas[i]);
            } else {
                System.out.print(" " + mas[i]);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (i == 0) {
                System.out.println();
            } else {
                System.out.println(mas[i]);
            }
        }
    }
}
