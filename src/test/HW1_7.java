package test;

public class HW1_7 {

    public static void main (String[] args){

int result = 0;

        for (int i = 1; i <= 99; i++){
            if (i % 2 == 1) {
                result = result + i;
            }
        }
        System.out.println(result);
    }
}
