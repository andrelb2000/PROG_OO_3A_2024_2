import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Console {
    private Scanner leitor = new Scanner(System.in);
    public Pessoa obterPessoa(){
        System.out.println("Por favor, sr usuario, digite o seus dados da pessoa");
        System.out.print("NOME   : ");   String nome = leitor.nextLine();
        System.out.print("CPF    : ");   String cpf = leitor.nextLine();
        System.out.print("IDADE  : ");   int idade = leitor.nextInt();
        System.out.print("SALARIO: ");   double salario = leitor.nextDouble();
        Pessoa p = new Pessoa(nome,cpf,idade,salario);
        return(p);
    }
    public Pessoa obterPessoaCPF(){
        System.out.println("Por favor, sr usuario, digite o cpf da pessoa");
        String cpf = leitor.nextLine();
        Pessoa p = new Pessoa("",cpf,0,0);
        return(p);
    }
    public void mostraPessoas(ArrayList<Pessoa> lista){
        System.out.println("Lista de Pessoas:");
        Iterator<Pessoa> it = lista.iterator();
        while (it.hasNext()) {
            Pessoa p = it.next();
            System.out.println(p);            
        }
    }
    public void despedida(){
        System.out.println("Muito obrigado, bom fim de semana");
    }
    public int menu(){
        System.out.println("1 - Inserir pessoa");
        System.out.println("2 - Remover pessoa");
        System.out.println("3 - Alterar pessoa");
        System.out.println("4 - Obter pessoa");
        System.out.println("5 - ListarPessoas");
        System.out.println("6 - Sair");
        int resposta = leitor.nextInt();
        leitor.nextLine();
        return(resposta);
    }
}