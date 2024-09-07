

public class Mago extends Personagem {
    private LivroFeiticos livro = new LivroFeiticos();

    public Mago(String nome){
        super(nome);
        pontosVida += 100;
    }
    public void imprimePersonagem(){
        System.out.println("Digno MAGO:"+nomePersonagem +
        " Tem vida de "+ pontosVida );
        for(int i=0; i < listaMonstros.size(); i++){
            System.out.println("Lutou com: "+
            listaMonstros.get(i).getNome());
        } 
    }
    public void lutar(Monstro monstro) {
        listaMonstros.add(monstro); 
        livro.lancaFeitico();
        pontosVida = pontosVida - monstro.getDano()/10;
    }
    
    
}
