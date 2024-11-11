public class Pessoa {
    private String nomePessoa;    
    public Pessoa(String nome) {
        this.nomePessoa = nome;
    }
    public String sqlINSERT(){
        return ("INSERT INTO TABLE PESSOA(NOME) VALUES ('"+ nomePessoa +"')");
    }    
}
