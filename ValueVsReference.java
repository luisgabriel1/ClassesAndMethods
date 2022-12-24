package Udemy;

public class ValueVsReference {
    public static void main(String[] args) {

        double a = 2;
        double b = a;    // Atribuição por valor (Tipo primitivo).

        a++;
        b--;

        System.out.println(a  + " " + b);
    }
}
