import java.util.Random;

public class Monstro {
    private String nomeMonstro;
    private int danoMonstro = 20;
    public Monstro(String nome,int dano){
        nomeMonstro = nome;
        danoMonstro = dano;
    }
    public String getNome(){
        return nomeMonstro;
    }
    public int getDano(){
        Random a = new Random();
        int x = a.nextInt(danoMonstro);
        return x;
    }
    
}
