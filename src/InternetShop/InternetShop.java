package InternetShop;

public class InternetShop {

    private String phoneNumber1;
    private String phoneNumber2;
    private String instagram;

    public InternetShop(String phoneNumber1, String phoneNumber2, String instagram) {
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.instagram = instagram;
    }

    public void getContacts() {
        System.out.printf("Call us: %s\t, %s\t or write us: %s\n", phoneNumber1, phoneNumber2, instagram);
    }

}
