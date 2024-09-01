

public class Mago extends Personagem {

    public Mago(String nome){
        super(nome);
        pontosVida += 100;
    }
    public void imprimePersonagem(){
        System.out.println("Digno MAGO:"+nomePersonagem +
        " Tem vida de "+ pontosVida );
    }
    public void lutar(Monstro monstro) {
        pontosVida = pontosVida - monstro.getDano()/10;
    }
    
    
}
