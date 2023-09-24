package chapter11ab;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
        Rectangle rectangle1 = new Rectangle(7, 10);
        rectangle1.print();
        System.out.println(rectangle1.calculateArea());
    }
}
