public class Tostadeira extends Maquina {

    public double calculaPreco(int tipo){
        if(tipo == 1){
            return (1000);
        }else{
            return(2000);
        }
    }    
}
