package main;

public class DasBlinkenLights {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int p = io.getInt();
        int q = io.getInt();
        int s = io.getInt();
        String result = "no";
        for (int i = 1; i <= s; i++) {
            if(i%p == 0 && i%q == 0){
                result = "yes";
                break;
            }
        }
        System.out.println(result);
    }
}
