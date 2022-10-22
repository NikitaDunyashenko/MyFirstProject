package test;

public class HW1_2 {

    public static void main (String[] args){

        int ameba = 0;

        for (int i = 0; i < 9; i++){
            if (i == 0) {
                ameba = 1;
                System.out.println(ameba);
            } else {
                ameba = ameba * 2;

                System.out.println(ameba);
            }

        }
    }
}
