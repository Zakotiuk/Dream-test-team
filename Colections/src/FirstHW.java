import java.util.HashSet;
import java.util.Set;

public class FirstHW {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Fill set1
        set1.add("Math");
        set1.add("Biology");
        set1.add("Chemistry");

        // Fill set2
        set2.add("Ukr. lang.");
        set2.add("Chemistry");
        set2.add("PE");

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersect(set1, set2));
    }
}
