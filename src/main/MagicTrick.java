package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] separateCharacters = scan.nextLine().toCharArray();
        Set<Character> duplicateChecker = new HashSet<>();
        int result = 1;
        for (char c : separateCharacters) {
            if(!duplicateChecker.add(c)){
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }

}
