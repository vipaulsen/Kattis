package main;

public class BatterUp {
    public static void main(String[] args) {
        Kattio io = new Kattio();

        double atBats = io.getInt();
        double bases = 0;
        int loopCounts = (int)atBats;
        int add;
        for (int i = 0; i < loopCounts; i++) {
            add = io.getInt();
            if(add >= 0)
                bases+=add;
            else
                atBats--;
        }

        System.out.println(bases/atBats);
        io.close();
    }
}
