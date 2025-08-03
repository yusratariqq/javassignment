public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String original = "Java";
        String modified = original.concat(" Rules");

        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
        System.out.println("Original unchanged: " + original);
    }
}
