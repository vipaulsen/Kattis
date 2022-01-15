package main;

import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        Set<String> noDupWords = new HashSet<>(Arrays.asList(words));
        System.out.println(words.length == noDupWords.size() ? "yes" : "no");

    }
}
