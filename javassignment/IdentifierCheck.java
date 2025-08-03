public class IdentifierCheck {
    public static void main(String[] args) {
        int validVar = 10;
        int _validVar = 20;
        int $validVar = 30;
        // int 1invalid = 40;  // Compile error
        // int class = 50;    // Compile error

        System.out.println("Valid identifiers:");
        System.out.println("validVar: " + validVar);
        System.out.println("_validVar: " + _validVar);
        System.out.println("$validVar: " + $validVar);
    }
}