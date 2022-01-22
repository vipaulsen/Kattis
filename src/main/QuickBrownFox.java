package main;

import java.util.*;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++) {
            HashSet<Character> hs = new HashSet<>();
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                hs.add(Character.toLowerCase(line.charAt(j)));
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 'a'; j <= 'z'; j++) {
                if(!hs.contains((char) j))
                    sb.append((char) j);
            }
            if(sb.length() == 0)
                System.out.println("pangram");
            else{
                System.out.println("missing " + sb);
            }
        }
    }
}
