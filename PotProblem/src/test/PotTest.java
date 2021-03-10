package test;

import main.Pot;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PotTest {
    @Test
    void testOne() throws FileNotFoundException {
        Pot p = new Pot();

        File f = new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.1.in");
        Scanner scanner = new Scanner(new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.1.ans"));

        assertEquals(scanner.nextInt(),p.pot(f));
    }
    @Test
    void testTwo() throws FileNotFoundException {
        Pot p = new Pot();

        File f = new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.2.in");
        Scanner scanner = new Scanner(new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.2.ans"));

        assertEquals(scanner.nextInt(),p.pot(f));
    }
    @Test
    void testThree() throws FileNotFoundException {
        Pot p = new Pot();

        File f = new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.3.in");
        Scanner scanner = new Scanner(new File("C:\\Users\\Pål\\Documents\\Kattis\\PotProblem\\src\\test\\pot.3.ans"));

        assertEquals(scanner.nextInt(),p.pot(f));
    }
}