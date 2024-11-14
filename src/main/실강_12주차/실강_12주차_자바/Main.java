package main.실강_12주차.실강_12주차_자바;

abstract class Shape2 {
    double x;
    double y;
    Shape2(double _x, double _y) {
        x = _x;
        y = _y;
    }

}

interface Measurable2 {
    double getWidth();
    double getHeight();
    default double getArea() {
        return getWidth() * getHeight();
    }
}

class Rectangle extends Shape2 implements Measurable2 {
    double width;
    public double getWidth(){
        return width;
    }
    double height;
    public double getHeight(){
        return height;
    }

    Rectangle(double x, double y, double _width, double _height){
        super(x, y);
        width = _width;
        height = _height;
    }
}

class Circle extends Shape2 implements Measurable2{
    double radius;
    Circle(double x, double y, double _radius){
        super(x, y);
        radius = _radius;
    }

    public double getWidth(){
        return 2.0 * radius;
    }
    public double getHeight(){
        return 2.0 * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.0, 10.0, 3.0, 4.0);
        Circle c = new Circle(5.0, 5.0, 2.0);
        Measurable2[] arr = new Measurable2[2];
        arr[0] = r;
        arr[1] = c;

        for (Measurable2 s: arr){
            System.out.println("Height is "+s.getHeight());
            System.out.println("Area is "+s.getArea());
        }
    }
}
