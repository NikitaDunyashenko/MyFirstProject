package test;

public class HW2_2 {

    public static void main (String[] args){
        int[] mas = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99};


        for (int i = 0; i < mas.length; i++){
            System.out.println(" " + mas [i]);
        }
        for (int i = mas.length - 1; i >= 0; i--){
            System.out.print(" " + mas [i]);
        }
    }
}
