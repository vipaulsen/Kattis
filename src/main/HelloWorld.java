package main;

public class HelloWorld {
    public static void main(String[] args) {
        Kattio kattio = new Kattio(System.in,System.out);
        kattio.print("Hello World!");
        kattio.close();
    }
}