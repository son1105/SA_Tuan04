package example;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}
