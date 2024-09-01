import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Ola "+nome);
    }
}
