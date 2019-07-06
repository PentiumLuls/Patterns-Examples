package SimUDuck.duck;

import SimUDuck.behavior.fly.FlyNoWay;
import SimUDuck.behavior.quack.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
