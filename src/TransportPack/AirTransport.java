package TransportPack;

abstract class AirTransport extends Transport {

    int wingspan;
    int minLengthRunway;

    public AirTransport(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway){
        super(horsePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }
}
