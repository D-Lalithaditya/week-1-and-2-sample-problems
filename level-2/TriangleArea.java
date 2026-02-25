import java.util.Scanner;

class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;

        double areaInSqInches = 0.5 * baseInInches * heightInInches;

        System.out.println("The Area of the triangle in sq in is "
                + areaInSqInches + " and sq cm is " + areaInSqCm);

        input.close();
    }
}