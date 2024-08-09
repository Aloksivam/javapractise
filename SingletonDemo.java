class Singleton {
    // Static variable to hold the one instance of the class
    private static Singleton instance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public static method that returns the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Try to create multiple instances
        Singleton obj1 = Singleton.getInstance();  // Output: Singleton instance created
        Singleton obj2 = Singleton.getInstance();  // No output (same instance returned)

        // Check if both references point to the same object
        System.out.println(obj1 == obj2);  // Output: true
    }
}
