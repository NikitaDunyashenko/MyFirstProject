package TransportPack;

abstract class GroundTransport extends Transport{

    int wheelAmount;
    double oilConsumption;

    public GroundTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelAmount, double oilConsumption){
        super (horsePower, maxSpeed, weight, brand);
        this.wheelAmount = wheelAmount;
        this.oilConsumption = oilConsumption;
    }

}
