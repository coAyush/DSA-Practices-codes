//Write a Java program to create an interface Flyable with a method called fly_obj().
// Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable
// interface.
// Implement the fly_obj() method for each of the three classes
package Interfaces;
interface Flyable{
    void fly_obj();
}
class SpaceCraft implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("i am in spacecraft");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("i am in airplane");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("i am in helicopter");
    }
}
public class Program3 {
    public static void main(String[] args) {
        SpaceCraft s=new SpaceCraft();
        s.fly_obj();
        Airplane a=new Airplane();
        a.fly_obj();
        Helicopter h=new Helicopter();
        h.fly_obj();
    }
}
