package Udemy;

public class Product {

    String name;
    double price;
    static double discount = 0.50;


    Product(String FirstName) {
        name = FirstName;
    }

    double PriceWithDiscount (){
        return price * (1 - discount);

    }
}
