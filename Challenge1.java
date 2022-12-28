package Udemy;

public class Challenge1 {
    // You can only move inside of method main for correct the error.
    int a = 3;
    public static void main (String[] arg) {
        
        // Cold just put a static at var a the this is resolution.

        // My resolution of error went to do a construct b who calls the class Challenge1.
        // Then I passed a var x that calls the class's arg.
        // In this case Class receives the argument of a = 3 and b receives the class constructor and x receives class.arg = b.a
        Challenge1 b = new Challenge1();
        int x = b.a;
        System.out.println(x);
    }
}
