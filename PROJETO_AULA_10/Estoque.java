import java.util.ArrayList;

public class Estoque {
    private ArrayList<PecaServico> listaPecas = new ArrayList<PecaServico>();
    public void inserePeca(PecaServico peca){
        listaPecas.add(peca);
    }
    public void listar(){
        for(int i=0 ; i < listaPecas.size(); i++){
           System.out.println("Peca:"+listaPecas.get(i).getNomePeca());
        }
    }
}
