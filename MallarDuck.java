package Duck;

public class MallarDuck extends Duck{  
    public MallarDuck() {
        quackBehavior = new Quack();
        swimBehavior = new SwimWithlegs();
    }

    //@Override
    void display() {
        System.out.println("I am a Mallar Duck");
    }    

}
