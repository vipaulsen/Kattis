package main;

public class SpeedLimit {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        while(io.hasMoreTokens()) {
            int amountOfValues = io.getInt();
            if(amountOfValues < 1 || amountOfValues > 10) break;
            int totalTime = 0;
            int distance = 0;
            for (int i = 0; i < amountOfValues; i++) {
                int speed = io.getInt();
                int elapsedTime = io.getInt() - totalTime;
                totalTime += elapsedTime;
                distance += elapsedTime * speed;
            }
            System.out.println(distance + " miles");
        }
        io.close();
    }
}
