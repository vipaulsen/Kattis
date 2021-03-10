package main;

public class Greetings {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        String s = io.getWord();
        int eCounter = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == 'e'){
                eCounter+=2;
            }
        }
        StringBuilder sb = new StringBuilder();

        sb.append("h");
        sb.append("e".repeat(eCounter));
        sb.append("y");

        io.print(sb);
        io.close();
    }
}
