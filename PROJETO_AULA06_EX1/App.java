public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Personagem p1 = new Personagem("Aragorn",200);
        Personagem p2 = new Personagem("Luke Skywaker");
        Mago       m1 = new Mago("Gandalf");
  
        Monstro m = new Monstro();
        p1.lutar(m);
        p2.lutar(m);
        m1.lutar(m);
        

        p1.imprimePersonagem();
        p2.imprimePersonagem(); 
        m1.imprimePersonagem();      
    }
}