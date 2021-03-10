package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pot {

    public int pot(File f) throws FileNotFoundException {
        Scanner scan = new Scanner(f);
        int numberAmount = scan.nextInt();
        if(numberAmount > 10 || numberAmount < 1){
            throw new Error();
        }
        int sum = 0;
        int number = 0;
        for(int i = 1; i <= numberAmount; i++){
            number = scan.nextInt();
            sum += Math.pow(number/10, number%10);
        }

        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException {
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
