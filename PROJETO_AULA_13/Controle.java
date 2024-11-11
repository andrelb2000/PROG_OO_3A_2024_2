public class Controle {
    private Console console = null;
    private Banco banco = null;
    public Controle(){
        console = new Console();
        banco   = new Banco();
    }
    public void executar(){
        int resposta = 0;
        while (resposta != 2) {
            resposta = console.menu();
            switch (resposta) {
                case 1:
                    Pessoa p  = console.obterPessoa();
                    banco.insereBanco(p);                    
                    break;
                case 2:
                    console.despedida();
                    break;                   
                default:
                    break;
            }            
        }
    }
}
