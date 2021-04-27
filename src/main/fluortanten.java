package main;

import java.util.ArrayList;

public class fluortanten {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int nrOfChildren = kattio.getInt();

        ArrayList<Integer> children = new ArrayList<>(nrOfChildren);
        int bjornPos = -1;
        int sumOfHappiness = Integer.MIN_VALUE;
        int thisSumOfHappiness;
        for(int i = 0; i < nrOfChildren; i++){
            int happiness = kattio.getInt();
            if(happiness == 0){
                bjornPos = i;
            }
            children.add(i, happiness);
        }

        for(int i = 0; i < nrOfChildren; i++) {
            thisSumOfHappiness = maxHappiness(children, bjornPos, i);
            if(thisSumOfHappiness > sumOfHappiness){
                sumOfHappiness = thisSumOfHappiness;
            }
        }
        kattio.print(sumOfHappiness);
        kattio.close();
    }

    private static int maxHappiness(ArrayList<Integer> children, int bjornPos, int current) {
        ArrayList<Integer> tmpArray = (ArrayList<Integer>) children.clone();
        int happySum = 0;
        tmpArray.remove(bjornPos);
        tmpArray.add(current,0);

        for(int i = 0; i < tmpArray.size(); i++){
            happySum += tmpArray.get(i) * (i + 1);
        }
        return happySum;
    }

}
