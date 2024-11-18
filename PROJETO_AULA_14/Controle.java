import java.util.ArrayList;

public class Controle {
    private Console console = null;
    private Banco banco = null;
    public Controle(){
        console = new Console();
        banco   = new Banco();
    }
    public void executar(){
        int resposta = 0;
        Pessoa p;
        ArrayList<Pessoa> lista = new ArrayList<>();
        while (resposta != 6) {
            resposta = console.menu();
            switch (resposta) {
                case 1:
                    p = console.obterPessoa();
                    banco.inserePessoaBanco(p);                    
                    break;
                case 2:
                    p  = console.obterPessoaCPF();
                    banco.deletePessoaBanco(p);                    
                    break;
                case 3:
                    p  = console.obterPessoa();
                    banco.updatePessoaBanco(p);                    
                    break;      
                case 4:
                    p  = console.obterPessoaCPF();
                    lista.clear();
                    banco.queryPessoaBanco(p, lista);   
                    console.mostraPessoas(lista);                 
                    break;
                case 5:
                    lista.clear();
                    banco.queryPessoasBanco(lista);
                    console.mostraPessoas(lista);                    
                    break;
                case 6:
                    console.despedida();
                    break;                   
                default:
                    break;
            }            
        }
    }
}
