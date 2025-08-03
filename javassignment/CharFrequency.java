public class CharFrequency {
    public static void main(String[] args) {
        String text = "programming";
        int[] frequency = new int[256];

        for (char c : text.toCharArray()) {
            frequency[c]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + ": " + frequency[i]);
            }
        }
    }
}