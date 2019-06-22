package duck;

import fly.behavior.FlyBehavior;
import quack.behavior.QuackBehavior;

public class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
