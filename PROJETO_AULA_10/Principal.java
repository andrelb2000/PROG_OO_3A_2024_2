

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello 3A");
        PecaServico p1 = new PecaServico("Carburador",500);
        String nomeP1 = p1.getNomePeca();
        System.out.println("Nome Peca"+nomeP1);        
    }
}