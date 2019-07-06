package SimUDuck.duck;

import SimUDuck.behavior.fly.FlyWithWings;
import SimUDuck.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
