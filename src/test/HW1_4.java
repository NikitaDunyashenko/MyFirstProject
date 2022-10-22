package test;

public class HW1_4 {

    public static void main (String[] args){

      int result = 0;
      int A  = 5;

for (int B = 0; B < 6; B++) {
    if (B == 0) {
        result = A;
    } else {
        result = result + A;
    }
}
System.out.println("A * B = " + result);
    }
}
