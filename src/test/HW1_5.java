package test;

public class HW1_5 {

    public static void main(String[] args) {

        double num1 = 0;

        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                num1 = 2.54;
                System.out.println(num1);
            } else {
                num1 = num1 + 2.54;
                System.out.println(num1);
            }
        }
    }
}

