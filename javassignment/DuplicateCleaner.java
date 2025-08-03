import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DuplicateCleaner {
    public static void main(String[] args) {
        int[] withDupes = {1, 2, 2, 3, 4, 4};

        // Correct way to remove duplicates
        int[] unique = Arrays.stream(withDupes)
                .distinct()
                .toArray();

        System.out.println("Unique: " + Arrays.toString(unique));
    }
}