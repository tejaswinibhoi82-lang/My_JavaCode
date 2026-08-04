public class methodOverArea {
    public static void main(String args[]) {
        int length, breadth;
        length = 12;
        breadth = 16;
        double height = 2.5;
        double sq_area, rect_area, tri_area;
        sq_area = area(length);
        rect_area = area(length, breadth);
        tri_area = area(breadth, height);
        System.out.println("The area of the square is :" + sq_area);
        System.out.println("The area of the rectangle is :" + rect_area);
        System.out.println("The area of the triangle is :" + tri_area);
    }

    public static double area(int length) {
        double area = length * length;
        return area;
    }

    public static double area(int length, int breadth) {
        double area = length * breadth;
        return area;
    }

    public static double area(int breadth, double height) {
        double area = (height * breadth) / 2;
        return area;
    }
}
