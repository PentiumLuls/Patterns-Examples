import duck.DecoyDuck;
import duck.Duck;
import duck.MallardDuck;

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
        decoyDuck.performQuack();
    }
}
