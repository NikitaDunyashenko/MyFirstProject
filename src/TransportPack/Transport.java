package TransportPack;

public abstract class Transport {

    int horsePower;
    int maxSpeed;
    int weight;
    String brand;
    double wattPower;

    public Transport (int horsePower, int maxSpeed, int weight, String brand){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

}
