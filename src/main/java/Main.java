
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String textForDictionary = "There was only the broad square with the scattered dim moons of the street " +
                "lamps and with the monumental stone arch which receded into the mist as though it would prop " +
                "up the melancholy sky and protect beneath itself the faint lonely flame on the tomb of the " +
                "Unknown Soldier, which looked like the last grave of mankind in the midst of night and loneliness";

        Function<String, List<String>> dictionary = s -> Arrays.stream(s.split("\\W"))
                .map(w -> w.toLowerCase(Locale.ENGLISH))
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());

        dictionary.apply(textForDictionary)
                .forEach(System.out::println);
    }
}