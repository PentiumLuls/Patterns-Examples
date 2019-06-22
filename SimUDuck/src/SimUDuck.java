import duck.DecoyDuck;
import duck.Duck;
import duck.MallardDuck;
import fly.behavior.FlyWithWings;

public class SimUDuck {

    public static void main(String[] args) {
        System.out.println("~~ DUCK REAL LIFE SIM ~~");
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();

        System.out.println(">Mallard duck");
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println(">Decoy duck");
        decoyDuck.performFly();
        decoyDuck.setFlyBehavior(new FlyWithWings());
        System.out.println("~~Decoy duck improves her flying skills");
        System.out.println("    Now she can reach the sky with her 5Lvl wings@");
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
