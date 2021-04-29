package main;

public class AlphabetSpam {
    public static void main(String[] args) {
        int whitespace = 0;
        int lowercase = 0;
        int uppercase = 0;
        int symbols = 0;
        Kattio io = new Kattio();
        String input = io.getWord();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current == '_') whitespace++;
            else if(current < 91 && current > 64) uppercase++;
            else if(current < 123 && current >96) lowercase++;
            else symbols++;
        }
        io.println((double)whitespace/input.length());
        io.println((double)lowercase/input.length());
        io.println((double)uppercase/input.length());
        io.println((double)symbols/input.length());
        io.close();
    }
}
