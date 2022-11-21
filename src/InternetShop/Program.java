package InternetShop;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        InternetShop contacts = new InternetShop("+375 (44) 709-67-60 (Telegram, Viber, WatsApp)", "+375 (44) 709-67-61 (Telegram, Viber, WatsApp)", "Mobi_Live");

        Product mobileTelephone = new Product("Mobile Telephone", "USA", 1001);
        Product laptop = new Product("Laptop", "Britain", 1002);
        Product computer = new Product("Computer", "Italy", 1003);
        Product washMachine = new Product("Wash Machine", "Germany",  1004);
        Product fridge = new Product("Fridge", "Belarus", 1005);
        Product microwave = new Product("Microwave", "Poland", 1006);

        List<Product> products = new ArrayList<>();
        products.add(mobileTelephone);
        products.add(laptop);
        products.add(computer);
        products.add(washMachine);
        products.add(fridge);
        products.add(microwave);

        System.out.println("The list of goods for selling:");
        for (Product goods : products) {
            goods.displayProductInfo();
        }

        computer.getProductInfo();

        for (Product goods : products) {
            goods.saleProduct("ITACOM1003");
                products.remove(products);
            }

        System.out.println("The list of left goods for selling:");
        for (Product goods : products) {
            goods.displayProductInfo();
        }

        contacts.getContacts();




    }
}