package TransportPack;

public class Program {

    public static void main(String[] args){

        PassengerTransport audi = new PassengerTransport(610, 330, 2500, "Audi", 4, 24, "sedan", 5);
        audi.changePower();
        audi.description();
        System.out.println();
        audi.calculateDistance();
        audi.calculateConsumption();
        audi.displayInfo();

        FreightTransport scania = new FreightTransport(310, 150, 4500, "Scania", 10, 20, 10000);
        scania.checkLoadCapacity();

        CivilAirTransport boeing = new CivilAirTransport(3100, 880, 87000, "Boeing", 50, 350, 120, true);
        boeing.checkPassengerAmount();

        MilitaryAirTransport globemaster = new MilitaryAirTransport(5000, 850, 50000, "Boeing C-17 Globemaster III", 50, 350, true, 8);
        globemaster.missileLaunch();
        globemaster.ejectionCheck();

    }
}
