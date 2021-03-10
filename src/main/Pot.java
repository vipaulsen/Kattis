package main;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nrAmount = scan.nextInt();
        int sum = 0;
        int current = 0;
        for(int i = 1; i <= nrAmount; i++) {
            current = scan.nextInt();
            sum += Math.pow(current / 10, current % 10);
        }
        System.out.println(sum);
    }
}
