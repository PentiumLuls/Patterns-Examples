package example;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        // In multi thread it may create another instance
        // See Readme.md file in this module root
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }
}

