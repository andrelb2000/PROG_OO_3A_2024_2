public class App {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();
        Monstro m = new Monstro();
        p1.lutar(m);
        p2.lutar(m);
        p1.setNome("Aragorn");
        p2.setNome("Luke Skywalker");
        p1.imprimePersonagem();
        p2.imprimePersonagem();       
    }
}