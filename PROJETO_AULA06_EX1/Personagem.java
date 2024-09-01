public class Personagem {
    protected String nomePersonagem = "Joao 1";
    protected int pontosVida = 100;

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
    }
    public void lutar(Monstro monstro){
        
        pontosVida = pontosVida - monstro.getDano();
    }
}
