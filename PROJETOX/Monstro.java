import java.util.Random;

public class Monstro {
    private int danoMonstro = 20;
    
    public int getDano(){
        Random a = new Random();
        int x = a.nextInt(30);
        return x;
    }
    
}
