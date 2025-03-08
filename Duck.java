package Duck;

abstract public class Duck {
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;


    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    //abstract void display();


    public void performQuack() {
        quackBehavior.quack();
    }

}
