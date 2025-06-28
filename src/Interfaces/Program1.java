// Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes.
package Interfaces;
interface Shape{
    void getArea();
}
class Rectangle implements Shape{
    int length,breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    @Override
    public void getArea() {
        int a=length*breadth;
        System.out.println("Area of rectangle is "+a);
    }
}
class Circle implements Shape{
    int radius;
    Circle(int r){
        radius=r;
    }
    @Override
    public void getArea() {
        System.out.printf("area of circle is %4.2f",3.14*Math.pow(radius,2));
    }
}
class Triangle implements Shape{
    int base,height;
    Triangle(int b,int h){
        base=b;
        height=h;
    }
    @Override
    public void getArea() {
        System.out.printf("area of triangle is %2.3f",0.5*base*height);
    }
}
public class Program1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,6);
        Circle c=new Circle(5);
        Triangle t=new Triangle(7,6);
        r.getArea();
        t.getArea();
        c.getArea();
    }
}
