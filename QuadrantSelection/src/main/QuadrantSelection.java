package main;

public class QuadrantSelection {
    public static void main(String[] args) {
        Kattio kattio = new Kattio(System.in, System.out);

        int x = kattio.getInt();
        int y = kattio.getInt();

        if(x >= 0){
            if(y >= 0) kattio.print("1");
            else kattio.print("4");
        }else{
            if(y >= 0) kattio.print("2");
            else kattio.print("3");
        }
        kattio.close();
    }
}
