//Write a Java program to create an Animal interface with a method called bark()
// that takes no arguments and returns void. Create a Dog class that implements
// Animal and overrides speak() to print "Dog is barking".
package Interfaces;
interface  Animal{
    void bark();
}
class Dog implements Animal{
    @Override
    public void bark() {
        speak();
    }
    public void speak(){
        System.out.println("dog is barking");
    }
}
public class Program2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
    }
}
