package main;

import java.util.Vector;

public class SymmetricalOrder {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int amount = io.getInt();
        Vector<String> v;
        String s;
        int set = 0;
        while(amount != 0){
            set++;
            v = new Vector<>(amount);
            for(int i = 0; i < amount; i++){
               s = io.getWord();
               if(i%2==0)
                   v.add(i/2, s);
               else
                   v.add((i/2)+1, s);
            }

            System.out.println("SET " + set);
            for (String name : v) {
                System.out.println(name);
            }

            amount = io.getInt();
        }
        io.close();
    }
}
