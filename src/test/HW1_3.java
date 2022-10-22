package test;

public class HW1_3 {

    public static void main (String[] args){
        int num1 = 0;
        int result = 0;

        for (int i = 0; i < 9; i++){
            if (i == 0) {
                num1 = 1;
            } else {
                num1 = num1 * 2;
            }
            result = num1 + result;
        }
        System.out.println(result);
    }
}
