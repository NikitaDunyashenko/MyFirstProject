package TransportPack;

class MilitaryAirTransport extends AirTransport {

    boolean ejectionSystem;
    int missileAmount;

    public MilitaryAirTransport(int horsePower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, boolean ejectionSystem, int missileAmount){
        super (horsePower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.ejectionSystem = ejectionSystem;
        this.missileAmount = missileAmount;
    }

    public void missileLaunch(){
        for (int i = 0; i < 9; i++) {
            if (missileAmount > 0) {
                System.out.println("Missile launched successfully");
            } else {
                System.out.println("Missiles are absent");
            }
            missileAmount--;
        }
    }

    public void ejectionCheck(){
        if (ejectionSystem == true){
            System.out.println("Ejection completed successfully");
        } else {
            System.out.println("You don't have an ejection system");
        }
    }

}
