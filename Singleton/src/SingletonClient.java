public class SingletonClient {   public static void main(String[] args) {
    // Get an instance of the Singleton
    Singleton singleton = Singleton.getInstance();

    // Call a method to demonstrate its functionality
    singleton.showMessage();

    // Try to create another instance (it should return the same instance)
    Singleton anotherSingleton = Singleton.getInstance();

    // Check if both instances are the same
    if (singleton == anotherSingleton) {
        System.out.println("Both instances are the same. Singleton pattern works!");
    } else {
        System.out.println("Singleton pattern failed!");
    }
}
}
