public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1.concat(" World");

        System.out.println("Original: " + s1);
        System.out.println("After concat: " + s2);
        System.out.println("Original remains: " + s1);

        String s3 = s1.toUpperCase();
        System.out.println("Upper case: " + s3);
        System.out.println("Original remains: " + s1);
    }
}
