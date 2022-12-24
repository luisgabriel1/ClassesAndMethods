package Udemy;

import java.util.Scanner;

public class CalculationSumTest {
    public static void main(String[] args) {

        Scanner N1andN2 = new Scanner(System.in);
        CalculationSum calcSum = new CalculationSum();

        System.out.println("Inform First Number: ");
        calcSum.n1 = N1andN2.nextDouble();

        calcSum.n2 = 2.5;

        double calculationSumN1AndN2 = calcSum.sum();
        System.out.println(calculationSumN1AndN2);
    }
}
