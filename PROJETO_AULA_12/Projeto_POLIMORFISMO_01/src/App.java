import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testes de Polimorfismo");

        Maquina m1 = new Trator();
        Maquina m2 = new Tostadeira();

        ArrayList<Maquina> lista = new ArrayList<Maquina>();
        lista.add(m1);
        lista.add(m2);

        Iterator<Maquina> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Maquina m = iterator.next();
            System.out.println("Preco item (tipo 1)= " +
                                m.calculaPreco(1));
            System.out.println("Preco item (tipo 2)= " +
                                m.calculaPreco(2)); 
            
        }



        try {
            for(int i=0 ; i < lista.size()+1; i++){
                System.out.println("Preco item ("+i+") (tipo 1)= " +
                                    lista.get(i).calculaPreco(1));
                System.out.println("Preco item ("+i+") (tipo 2)= " +
                                    lista.get(i).calculaPreco(2));
            } 
        } catch (Exception e) {
            System.out.println("Erro: e = "+ e);
        }









    }
}
