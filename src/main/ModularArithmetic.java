package main;

public class ModularArithmetic {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int modulo = io.getInt();
        int operations = io.getInt();

        while(modulo != 0 && operations != 0){
            //System.out.println("modulo: " + modulo + "\noperations: " + operations);
            for (int i = 0; i < operations; i++) {
                int x = io.getInt();
                char op = io.getWord().trim().charAt(0);
                int y = io.getInt();
                //System.out.println("x: " + x + "\nop: " + op + "\ny: " + y);
                int result;
                switch(op){
                    case '+' : result = Math.floorMod(x + y, modulo);
                        break;
                    case '-' : result = Math.floorMod(x - y, modulo);
                        break;
                    case '*' : result = Math.floorMod(x * y, modulo);
                        break;
                    case '/' :
                        if(y==0) result = -1;
                        else{
                            double divRes = (x * Math.pow(y, -1));
                            if(divRes < 1){
                                divRes-=modulo;
                            }
                            result =  Math.floorMod((int)divRes, modulo);
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + op);
                }
                System.out.println(result);
            }
            modulo = io.getInt();
            operations = io.getInt();
        }
    }
}
