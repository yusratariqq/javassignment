public class TextSplitter {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";
        char[] chars = sentence.toCharArray();
        StringBuilder word = new StringBuilder();

        for (char c : chars) {
            if (c == ' ') {
                System.out.println(word);
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        System.out.println(word);
    }
}
