package main;

import java.util.LinkedHashMap;

public class OddManOut {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int cases = io.getInt();
        LinkedHashMap<Integer, Integer> guestList = new LinkedHashMap<>();

        for (int i = 0; i < cases; i++){
            int guests = io.getInt();
            for (int j = 0; j < guests; j++) {
                int invitationCode = io.getInt();
                if(!guestList.containsKey(invitationCode))
                    guestList.put(invitationCode, 1);
                else{
                    guestList.put(invitationCode, guestList.get(invitationCode) + 1);
                }
            }
            int finalI = i;
            guestList.forEach((key, value)->{
                if(value == 1) System.out.println("Case #" + (finalI + 1) + ": " + key);
            });
            guestList.clear();
        }
        io.close();
    }
}
