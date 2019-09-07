import java.lang.Math;
public class AreaCalculator {


    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        double areaCircle = Math.PI * (radius * radius);
        System.out.println("Area of cirle is " + areaCircle);
        return areaCircle;
    }
    public static double area(double length, double breadth){
        if((length < 0) || (breadth < 0)){
            return -1;
        }
        double areaRectangle = length * breadth;
        System.out.println("The area of the rectangle is " + areaRectangle);
        return areaRectangle;

    }


}
