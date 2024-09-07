import java.util.ArrayList;

public class Personagem {
    protected String nomePersonagem = "Joao 1";
    protected int pontosVida = 100;
    protected ArrayList<Monstro> listaMonstros = 
              new ArrayList<Monstro>();

    public void setNome(String nome){
        nomePersonagem = nome;
    }
    public Personagem(String nomePersonagem, int pontosVida) {
        this.nomePersonagem = nomePersonagem;
        this.pontosVida = pontosVida;
    }
    public Personagem(String nomePersonagem) {
        this.nomePersonagem = "Bobao do " + nomePersonagem;
    }
    public void imprimePersonagem(){
        System.out.println("Nome:"+nomePersonagem +
                           " Pontos: "+pontosVida );
        for(int i=0; i < listaMonstros.size(); i++){
            System.out.println("Lutou com: "+
            listaMonstros.get(i).getNome());
        }        
    }
    public void lutar(Monstro monstro){
        listaMonstros.add(monstro);      
        pontosVida = pontosVida - monstro.getDano();
    }
}
