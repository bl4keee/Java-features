package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageValue {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("The whole list: " + nums);
        System.out.println("The average of this list: " + average(nums));
    }

    public static Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
