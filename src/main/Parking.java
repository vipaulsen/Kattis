package main;

import java.util.HashSet;
import java.util.Set;

public class Parking {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int testCases = io.getInt();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < testCases; i++) {
            int stores = io.getInt();
            int[] storesDistances = new int[stores];
            int total = 0;
            //init array
            for (int j = 0; j < stores; j++) {
                storesDistances[j] = io.getInt();
                total += storesDistances[j];
            }
            double avg = (double) total / stores;
            int parking = (int) Math.round(avg);
            int distanceToNext = 0;
            int totalDistance = 0;
            int currentPos = parking;
            int find = Integer.MAX_VALUE;

            for (int j = 0; j < stores; j++) {
                //finding next
                for (int k = 0; k < stores; k++) {
                    int distance = storesDistances[k] - parking;
                    if((distance) < find && !visited.contains(storesDistances[k])){
                        find = distance;
                        currentPos = storesDistances[k];
                        distanceToNext = parking - currentPos;
                    }
                }
                for (int k = 0; k < stores; k++) {
                    if(storesDistances[k] == currentPos){
                        totalDistance+=distanceToNext;
                        visited.add(storesDistances[k]);
                    }
                }
            }
            totalDistance += Math.abs(currentPos - parking);
            io.println(totalDistance);
        }
        io.close();
    }
}
