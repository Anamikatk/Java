import java.util.Scanner;
interface Shape 
{
    double area();
    double perimeter();
}

class Circle implements Shape 
{
    private double r;
    public Circle(double r) 
    {
        this.r=r;
    }
    public double area() 
    {
        return Math.PI*r*r;
    }
    public double perimeter() 
    {
        return 2*Math.PI*r;
    }
}

class Rectangle implements Shape 
{
    private double l;
    private double w;

    public Rectangle(double l, double w) 
    {
        this.l=l;
        this.w=w;
    }
    public double area() 
    {
        return l*w;
    }
    public double perimeter() 
    {
        return 2*(l+w);
    }
}

class p11 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int c;
        double res;

        do 
        {
            System.out.println("-----Menu-----");
            System.out.println("1. Calculate area and perimeter of a circle");
            System.out.println("2. Calculate area and perimeter of a rectangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            c = s.nextInt();
            switch (c) 
            {
                case 1:
                    System.out.println("Enter the radius of the circle : ");
                    double radius = s.nextDouble();
                    Circle circle = new Circle(radius);
                    res = circle.area();
                    System.out.println("Area of the circle : " + res);

                    res = circle.perimeter();
                    System.out.println("Perimeter of the circle : " + res);
                    break;

                case 2:
                    System.out.println("Enter the length of the rectangle : ");
                    double length = s.nextDouble();
                    System.out.println("Enter the width of the rectangle : ");
                    double width = s.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    res = rectangle.area();
                    System.out.println("Area of the rectangle : " + res);

                    res = rectangle.perimeter();
                    System.out.println("Perimeter of the rectangle : " + res);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice!!! Please enter a valid option.");
                    break;
            }

            System.out.println();
        } while (c != 3);
    }
}
