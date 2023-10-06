public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
    }

    // Lazy initialization of the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // A method to demonstrate Singleton functionality
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

