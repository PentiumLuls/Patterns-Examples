package PizzaStore.pizza;

import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;

public class Pizza {

    protected String name;

    public Pizza prepare() {
        System.out.println("    >Preparing pizza");
        return this;
    }

    public Pizza bake() {
        System.out.println("    >Baking pizza");
        return this;
    }

    public Pizza cut() {
        System.out.println("    >Cutting pizza");
        return this;
    }

    public Pizza box() {
        System.out.println("    >Boxing pizza");
        return this;
    }

    public String getName() {
        return name;
    }
}
