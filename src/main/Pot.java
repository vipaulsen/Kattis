package main;

public class Pot {
    public static void main(String[] args){
        Kattio io = new Kattio(System.in, System.out);
        int nrAmount = io.getInt();
        int sum = 0;
        int current;
        for(int i = 1; i <= nrAmount; i++) {
            current = io.getInt();
            int base = current/10;
            sum += Math.pow(base, current % 10);
        }
        io.print(sum);
        io.close();
    }
}
