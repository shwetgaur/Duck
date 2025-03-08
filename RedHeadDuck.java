package Duck;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehavior = new Quack();
        swimBehavior = new SwimWithlegs();
    }

    //@Override
    void display() {
        System.out.println("I am a RedHead Duck");
    }    
}
