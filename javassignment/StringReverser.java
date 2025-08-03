public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello";
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed: " + new String(chars));
    }
}