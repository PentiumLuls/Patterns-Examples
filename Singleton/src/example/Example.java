package example;

public class Example {
    public static void main(String[] args) {
        // Doesn`t work
        // Singleton instance1 = new Singleton();

        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
    }
}
