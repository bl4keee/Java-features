package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Tyler", "John");
        System.out.println("The list of names: " + names);
        System.out.println("The list of names with all uppercase letters: " + upperCase(names));
    }

    public static List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
