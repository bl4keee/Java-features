package Lambdas;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class CommaSeparated {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("The list of nums: " + nums);
        System.out.println("The list of nums separated with slash: " + separate(nums));
    }

    private static String separate(List<Integer>list) {
        return list.stream()
                .map(String::valueOf)
                .collect(joining(" / "));
    }
}
