

public class Principal {

    public static void main(String[] args) {
              PecaServico p1 = new PecaServico("Carburador",500);
        PecaServico p2 = new PecaServico("Cambio",5000);
        String nomeP1 = p1.getNomePeca();
        System.out.println("Nome Peca"+nomeP1);
        Estoque e = new Estoque();
        e.inserePeca(p1);  
        e.inserePeca(p2);   
        e.listar();   
    }
}