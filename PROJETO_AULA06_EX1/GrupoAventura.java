import java.util.ArrayList;

public class GrupoAventura {
    private String nomeGrupo = "";
    private ArrayList<Personagem> listaPersonagem = 
            new ArrayList<Personagem>();

    public GrupoAventura(String n){
        nomeGrupo = n;
    }
    public void inserePersonagem(Personagem personagem){
        listaPersonagem.add(personagem);
    }
    public void listarPersonagens(){
        System.out.println("Membros do grupo "+nomeGrupo);
        for(int i=0; i < listaPersonagem.size();i++){
            listaPersonagem.get(i).imprimePersonagem();
        }
    }


}
