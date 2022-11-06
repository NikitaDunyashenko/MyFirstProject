package TransportPack;

import java.util.Scanner;

class CivilAirTransport extends AirTransport {

    int passengerAmount;
    boolean businessClass;
    int passengers;

    public CivilAirTransport(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, int passengerAmount, boolean businessClass){
        super (horsePower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.passengerAmount = passengerAmount;
        this.businessClass = businessClass;
    }

    public void checkPassengerAmount(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number of passengers you would like to carry");
        passengers = sc2.nextInt();
        if (passengers <= passengerAmount) {
            System.out.println("Plane is loaded");
        } else {
            System.out.println("You need a bigger plane");
        }
    }
}
