package test;

import java.util.Random;
import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {

        boolean macIsBurned = false;
        boolean macIsBurned2 = false;
        Computer macBookPro = new Computer("Apple M1", "8GB", "512GB", 10);
        macBookPro.displayInfo();
        System.out.println();

        for (int i = 0; i <= 12; i++) {

            Random rand = new Random();
            int index = rand.nextInt(1) + 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number 0 or 1");
            int number = sc.nextInt();
            int count = 0;

            if (macIsBurned == true) {
                System.out.println("Computer is dead. Impossible to switch on");
                break;
            }
            if (number == index) {
                macBookPro.switchOn();
                count++;
            }
            if (count > 10 || number != index) {
                macBookPro.burnedOut();
                macIsBurned = true;
            }
        }

        for (int i = 0; i <= 12; i++) {

            Random rand = new Random();
            int index = rand.nextInt(1) + 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number 0 or 1");
            int number = sc.nextInt();

            if (macIsBurned2 == true){
                System.out.println("Computer is dead. Impossible to switch off");
                break;
            }
            if (number == index) {
                macBookPro.switchOff();
            }
            if (number != index) {
                macBookPro.burnedOut();
                macIsBurned2 = true;
            }
        }
    }
}

class Computer {

    String processor;
    String operationalStorage;
    String storage;
    int resourceProductivity;

    Computer(String processor, String operationalStorage, String storage, int resourceProductivity) {
        this.processor = processor;
        this.operationalStorage = operationalStorage;
        this.storage = storage;
        this.resourceProductivity = resourceProductivity;
    }

    void displayInfo() {
        System.out.printf("MacBookPro: %s %s %s %d ", processor, operationalStorage, storage, resourceProductivity);
    }

    void switchOn() {
        System.out.println("Computer is on");
    }

    void burnedOut(){
        System.out.println("Computer burned out");

    }

    void switchOff(){
        System.out.println("Computer is off");
    }
}
