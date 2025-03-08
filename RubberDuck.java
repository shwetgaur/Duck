package Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        swimBehavior = new Floating();
    }

    //@Override
    void display() {
        System.out.println("I'm a rubber duck");
    }

}
