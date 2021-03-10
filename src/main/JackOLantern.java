package main;

public class JackOLantern {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int eyeDesigns = io.getInt();
        int noseDesigns = io.getInt();
        int mouthDesigns = io.getInt();
        int combinations = eyeDesigns * noseDesigns * mouthDesigns;

        io.print(combinations);

        io.close();
    }
}
