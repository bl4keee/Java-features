package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 data chains:");
        List<String> input = new ArrayList<String>();

        for(int i = 0; i < 4; i++) {
            input.add(scanner.nextLine());
        }

        System.out.println(input);
        input.sort((a, b) -> b.length() - a.length());
        System.out.println(input);
    }
}
