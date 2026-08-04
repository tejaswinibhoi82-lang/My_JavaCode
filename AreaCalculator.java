public class AreaCalculator
{
    public static double area (double radius)
    {
        if (radius < 0.0)
            return -1.0;
        return radius * radius * Math.PI;
    }
    public static double area (double l, double b)
    {
        if (l < 0.0 || b < 0.0)
            return -1.0;
        return l * b;
    }
    public static void main (String[]args)
    {
        double areaOfCircle = area (5.0);
        double areaOfRectangle = area (5.0, 4.0);
        System.out.println ("Area of Circle is " + areaOfCircle);
        System.out.println ("Area of Rectangle is " + areaOfRectangle);
    }
}
