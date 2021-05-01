package main;

public class ModularArithmetic {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        int modulo = io.getInt();
        int operations = io.getInt();

        while(modulo != 0 && operations != 0){
            for (int i = 0; i < operations; i++) {
                int x = io.getInt();
                char op = io.getWord().trim().charAt(0);
                int y = io.getInt();
                int result;
                switch(op){
                    case '+' : result = Math.floorMod(x + y, modulo);
                        break;
                    case '-' : result = Math.floorMod(x - y, modulo);
                        break;
                    case '*' : result = Math.floorMod(x * y, modulo);
                        break;
                    case '/' :
                        if(gcd(y, modulo) != 1){
                            result = -1;
                        }else{
                            result = Math.floorMod(x*mod_inv(y, modulo), modulo);
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

    private static int gcd(int y, int modulo) {
        if (y == 0){
            return modulo;
        }
        return gcd(modulo%y, y);
    }

    private static int mod_inv(int y, int modulo) {
        int yy = modulo, temp, q;
        int x0 = 0, x1 = 1;
        if (modulo==1) return 1;
        while (y > 1) {
            q = y/modulo;
            temp = modulo;
            modulo = y % modulo;
            y = temp;
            temp = x0;
            x0 =  x1 - q * x0;
            x1 = temp;
        }
        if(x1 < 0) x1 += yy;
        return x1;
    }
}
