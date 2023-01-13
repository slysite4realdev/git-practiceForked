import java.sql.SQLOutput;
import java.util.Scanner;
public class nilsSylvester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the rectangle A:");
        double lengthA = Integer.valueOf(scanner.nextLine());
        System.out.println("What is the width of the rectangle A:");
        double widthA = Integer.valueOf(scanner.nextLine());

        System.out.println("What is the length of the rectangle B:");
        double lengthB = Integer.valueOf(scanner.nextLine());
        System.out.println("What is the width of the rectangle B:");
        double widthB = Integer.valueOf(scanner.nextLine());

        double areaOfRectA = calcAreaRectangle(lengthA, widthA);
        double perimeterOfRectA = calcPerimeterRect(lengthA, widthA);

        double areaOfRectB = calcAreaRectangle(lengthB, widthB);
        double perimeterOfRectB = calcPerimeterRect(lengthB, widthB);

        System.out.println("The area of rectangle A is " + areaOfRectA);
        System.out.println("The area of rectangle B is " + areaOfRectB);
        System.out.println("The perimeter of rectangle A is " + perimeterOfRectA);
        System.out.println("The perimeter of rectangle B is " + perimeterOfRectB);

       if (areaOfRectA >= areaOfRectB){
           double areaDiff = areaOfRectA - areaOfRectB;
           System.out.println("The difference in area between rectangles A and B is " + areaDiff);
       }
       else{
           double areaDiff = areaOfRectB - areaOfRectA;
           System.out.println("The difference in area between rectangles A and B is " + areaDiff);
       }

    }
    public static double calcAreaRectangle(double a, double b){
        // Area of rectangle is length * width
        double areaRect = a * b;
        return areaRect;

        }
    public static double calcPerimeterRect(double c, double d){
        // perimeter of rectangle is 2*length + 2*width
        double perimeterRect = (2 * c) + (2 * d);
        return perimeterRect;
    }
}
