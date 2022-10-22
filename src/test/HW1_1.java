package test;

public class HW1_1 {

    public static void main(String[] args) {

        double day = 0;
        double result = 0;

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                day = 10;
            } else {
                day = day * 1.1;
            }
            result = day + result;
        }
System.out.println(result);
}
    }


