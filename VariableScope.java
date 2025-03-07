// Define the class
public class VariableScope {

    // Global variable (accessible throughout the class)
    static int globalCount = 100;

    // Main method
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount); // Accessing global variable
        showScope(); // Calling the showScope method
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        int localCount = 50; // Local variable (only accessible inside this method)

        System.out.println("Global Count (from showScope): " + globalCount); // Accessing global variable
        System.out.println("Local Count (from showScope): " + localCount); // Accessing local variable
    }
}
