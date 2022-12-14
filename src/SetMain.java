import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + "  elements.");

        Set<Integer> intersection = new HashSet<>(squares);

        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentences = "one day in the year of the fox";
        String[] arrayWords = sentences.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String i : arrayWords) {
            System.out.println(i);
        }
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1= new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2= new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        System.out.println("unionSet");
        Set<String> unionSet= new HashSet<>(nature);
        unionSet.addAll(divine);
        printSet(unionSet);

        System.out.println("intersectionSet");
        Set<String> intersectionSet= new HashSet<>(nature);
        intersectionSet.retainAll(divine);
        printSet(intersectionSet);

        System.out.println("Symetric differeance");
        unionSet.removeAll(intersectionSet);
        printSet(unionSet);


        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }
        if (nature.containsAll(intersectionSet)) {
            System.out.println("intersectionSet is a subset of nature");
        }
        if (divine.containsAll(intersectionSet)) {
            System.out.println("intersectionSet is a subset of divine");
        }

    }
    public static void printSet(Set<String>a){
        System.out.println("\t");
        for (String i:a){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
