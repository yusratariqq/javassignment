public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.insert(0, "Hello ");
        sb.replace(6, 10, "World");
        sb.delete(11, 16);
        sb.reverse();

        System.out.println(sb.toString());
    }
}
