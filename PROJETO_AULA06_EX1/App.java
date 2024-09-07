public class App {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Aragorn",200);
        Personagem p2 = new Personagem("Luke Skywaker");
        Mago       m1 = new Mago("Gandalf");
        Monstro m = new Monstro("Godzila",20);

        GrupoAventura g = new GrupoAventura("Turma 3A");
        g.inserePersonagem(p1);
        g.inserePersonagem(p2);
        g.inserePersonagem(m1);       
        p1.lutar(m);
        p2.lutar(m);
        m1.lutar(m);
        g.listarPersonagens();
    }
}