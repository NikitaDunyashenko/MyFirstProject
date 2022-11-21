package InternetShop;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Product {

    private String code;
    public String product;
    public String country;
    int index;

    public Product(String product, String country, int index) {
        this.product = product;
        this.country = country;
        this.code = getFullCode(country, product, index);
        this.index = index;
    }

    private @NotNull String createCode1(String country) {
        StringBuilder str1 = new StringBuilder(country);
        String partOfCode1 = str1.substring(0, 3);
        StringBuilder str_1 = new StringBuilder(partOfCode1);
        String finalPartOfCode1 = str_1.toString().toUpperCase();
        return finalPartOfCode1;
    }

    private @NotNull String createCode2(String product) {
        StringBuilder str2 = new StringBuilder(product);
        String partOfCode2 = str2.substring(0, 3);
        StringBuilder str_2 = new StringBuilder(partOfCode2);
        String finalPartOfCode2 = str_2.toString().toUpperCase();
        return finalPartOfCode2;
    }

    private @NotNull Integer createCode3(int index) {
        return index;
    }

    public String getFullCode(String country, String product, int index) {
        this.code = this.createCode1(country) + this.createCode2(product) + this.createCode3(index);
        return code;
    }

    public void displayProductInfo() {
            System.out.printf("Product: %16s\tcode: %s\n", product, code);
    }

    public void getProductInfo() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the code of the product");
        String userCode = sc1.next();

        if (this.code.contains(userCode)){
            System.out.printf("Product: %s\tCode: %s\tCountry: %s", product, code, country);
            System.out.println();
            System.out.println("Do you want to put this good into the basket? (Yes/No)");
            Scanner sc2 = new Scanner(System.in);
            String userAnswer = sc2.next();
            if (userAnswer.equals("Yes")){
                System.out.println("You bought it");
                this.saleProduct(this.code);
            } else {
                System.out.println("Ok, thanks for confirmation");
            }
        } else {
            System.out.println("Product with such a code isn't found. Try again");
        }
    }

    public String saleProduct(String code) {
        return product;
    }

}
