package main;

public class Patuljci {
    public static void main(String[] args) {
        int[] dwarves = new int[9];
        Kattio io = new Kattio();
        int sum = 0;

        // Init array
        for (int i = 0; i < 9; i++) {
            int dwarfNr = io.getInt();
            dwarves[i] = dwarfNr;
            sum += dwarfNr;
        }

        int sumToFind = sum - 100;
        int firstFalseDwarf = -1;
        int secondFalseDwarf = -1;

        //Finding the false dwarves
        for (int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++){
                if((dwarves[i] + dwarves[j]) == sumToFind){
                    firstFalseDwarf = dwarves[i];
                    secondFalseDwarf = dwarves[j];
                }
            }
        }

        //Printing out the legit dwarves
        for (int dwarf: dwarves) {
            if(legitDwarf(dwarf, firstFalseDwarf, secondFalseDwarf)){
                System.out.println(dwarf);
            }
        }

        io.close();
    }

    private static boolean legitDwarf(int dwarf, int firstFalseDwarf, int secondFalseDwarf) {
        return !(dwarf == firstFalseDwarf || dwarf == secondFalseDwarf);
    }
}
