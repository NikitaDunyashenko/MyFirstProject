package test;

public class task_2_2 {

    public static void main (String[] args){
        int[] mas = new int[50];
        int index = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 1){
                mas [index] = i;
                index ++;
            }
            System.out.println(index);
        }

    }
}
