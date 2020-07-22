package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {

    public static void main(String[] args) {
        List<String> things = Arrays.asList("imo", "abe", "bye", "ok");
        System.out.println("The list of things:" + things);
        System.out.println("The string that starts with 'a' and has length of 3 from the list: " + filter(things));
    }

    public static List<String> filter(List<String> list) {
        return list.stream()
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.length() == 3)
                .collect(Collectors.toList());
    }
}
