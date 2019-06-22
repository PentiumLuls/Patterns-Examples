package duck;

import fly.behavior.FlyNoWay;
import quack.behavior.Quack;
import quack.behavior.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
