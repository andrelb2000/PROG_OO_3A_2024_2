public class Personagem {
    private String nomePersonagem = "Joao 1";
    private int pontosVida = 100;
    public void setNome(String nome){
        nomePersonagem = nome;
    }
    public void imprimePersonagem(){
        System.out.println("Nome:"+nomePersonagem +
                           " Pontos: "+pontosVida );
    }
    public void lutar(Monstro monstro){
        pontosVida = pontosVida - monstro.getDano();
    }
}
