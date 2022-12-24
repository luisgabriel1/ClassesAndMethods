package Udemy;
public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product("Notebook");
        //p1.name = "Notebook";
        p1.price = 4356.89;

        var p2 = new Product("BlackPen");
        //p2.name = "Black Pen";
        p2.price = 12.56;

        Product.discount = 0.50;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double priceFinal1 = p1.PriceWithDiscount();
        double priceFinal2 = p2.PriceWithDiscount();
        double AverageBag = (priceFinal1 + priceFinal2) / 2;


        System.out.printf("The price1 is: $%.2f \nThe price2 is: $%.2f\n", priceFinal1, priceFinal2);
        System.out.printf("Average of bag is: $%.2f", AverageBag);
    }
}
