package Udemy;

public class AreaCircumference {
    double ray;
    final static double PI = 3.14;
    AreaCircumference(double rayInitial){
        ray = rayInitial;
    }
    double area(){
        return PI * Math.pow(ray, 2);
    }
}
