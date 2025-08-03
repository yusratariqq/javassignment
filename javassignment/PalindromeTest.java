public class PalindromeTest {
    public static void main(String[] args) {
        String text = "madam";
        boolean isPal = new StringBuilder(text).reverse().toString().equals(text);
        System.out.println(text + " is " + (isPal ? "" : "not ") + "a palindrome");
    }
}
