package TransportPack;

import java.util.Scanner;

class FreightTransport extends GroundTransport{

    int loadCapacity;
    int cargo;

    public FreightTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelAmount, double oilConsumption, int loadCapacity){
        super (horsePower, maxSpeed, weight, brand, wheelAmount, oilConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void checkLoadCapacity(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a weight of the cargo you would like to carry");
        cargo = sc1.nextInt();
        if (cargo <= loadCapacity){
            System.out.println("Truck is loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }

}
