package main;

public class HomeWork {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        String s = io.getWord();
        int nrOfProblems = 0;
        int startOfNext = 0;
        int endOfNext = s.indexOf(';');
        String stringToHandle;
        
        while(endOfNext != -1){
            stringToHandle = s.substring(startOfNext, endOfNext);
            nrOfProblems += evaluate(stringToHandle);
            startOfNext = endOfNext + 1;
            endOfNext = s.indexOf(';', startOfNext);
        }

        stringToHandle = s.substring(startOfNext);
        nrOfProblems += evaluate(stringToHandle);
        io.println(nrOfProblems);
        io.close();
    }

    private static int evaluate(String s) {
        int dashPos = s.indexOf('-');
        if(dashPos != -1){
            int first = Integer.parseInt(s.substring(0, dashPos));
            int second = Integer.parseInt(s.substring(dashPos+1));
            return (second - first) + 1;
        }
        return 1;
    }
}
