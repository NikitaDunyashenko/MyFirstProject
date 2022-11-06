package TransportPack;

import java.util.Scanner;

class PassengerTransport extends GroundTransport {

    String bodyType;
    int passengerAmount;
    double voltPower;
    double distance;
    double oilConsumptionOnTheWholeWay;
    int time;


    public PassengerTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelAmount, double oilConsumption, String bodyType, int passengerAmount){
        super (horsePower, maxSpeed, weight, brand, wheelAmount, oilConsumption);
        this.bodyType = bodyType;
        this.passengerAmount = passengerAmount;

    }

    public void changePower(){
        voltPower = horsePower * 0.74;
    }

    public void description(){
        System.out.printf("Car: %f %d %d %s %d %f %s %d", voltPower, maxSpeed, weight, brand, wheelAmount, oilConsumption, bodyType, passengerAmount);
    }

    public void calculateDistance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time of the road");
        time = sc.nextInt();
        distance = maxSpeed * time;
    }

    public void calculateConsumption(){
        oilConsumptionOnTheWholeWay = oilConsumption * distance / 100;
    }

    public void displayInfo(){
        System.out.println("During " + time + " hours," + " Auto " + brand + " running with maximum speed " + maxSpeed + " km/h " + "will drive " + distance + " kilometres " + "and consume " + oilConsumptionOnTheWholeWay + " litres of petrol");
    }

}
