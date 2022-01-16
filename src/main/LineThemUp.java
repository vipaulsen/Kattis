package main;

public class LineThemUp {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int numberOfPeople = io.getInt();
        String previousName = "";
        String currentName;
        boolean desc = false;
        boolean asc = false;
        String result = "";
        for (int i = 0; i < numberOfPeople; i++) {
            if(i == 0){
                previousName = io.getWord();
                continue;
            }
            currentName = io.getWord();
            if(i == 1){
                if(previousName.compareTo(currentName) > 0){
                    desc = true;
                    result = "DECREASING";
                }else{
                    asc = true;
                    result = "INCREASING";
                }
                previousName = currentName;
                continue;
            }
            if((previousName.compareTo(currentName) > 0 && asc) || (previousName.compareTo(currentName) < 0 && desc)) {
                result = "NEITHER";
                break;
            }
            previousName = currentName;
        }
        System.out.println(result);
        io.close();
    }
}
