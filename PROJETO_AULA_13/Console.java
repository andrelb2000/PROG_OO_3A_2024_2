import java.util.Scanner;

public class Console {
    private Scanner leitor = new Scanner(System.in);
    public Pessoa obterPessoa(){
        System.out.println("Por favor, sr usuario, digite o seu nome:");
        String nome = leitor.nextLine();
        Pessoa p = new Pessoa(nome);
        return(p);
    }
    public void despedida(){
        System.out.println("Muito obrigado, bom fim de semana");
    }
    public int menu(){
        System.out.println(" 1 - Inserir pessoa");
        System.out.println(" 2 - Sair");
        int resposta = leitor.nextInt();
        leitor.nextLine();
        return(resposta);
    }
}1