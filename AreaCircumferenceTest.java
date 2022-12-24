package Udemy;

public class AreaCircumferenceTest {
    public static void main(String[] args) {

        AreaCircumference a1 = new AreaCircumference(10);
        //a1.pi = 10;
        AreaCircumference a2 = new AreaCircumference(5);
        // a2.pi = 5;

        //AreaCircumference.PI = 3.1415;

        System.out.println(a1.area());

        System.out.println(a2.area());
        System.out.println(AreaCircumference.PI);
        System.out.println(Math.PI);

    }
}
