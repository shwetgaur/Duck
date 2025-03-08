package Duck;

public class SwimWithlegs implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Swimming with legs");
    }
}