public class Pessoa {
    private String nomePessoa;  
    private String cpfPesssoa;
    private int idadePessoa;
    private double salarioPessoa;
    public Pessoa(){};
    public Pessoa(String nome,String cpf, int idade, double salario) {
        this.nomePessoa = nome;
        this.cpfPesssoa = cpf;
        this.idadePessoa = idade;
        this.salarioPessoa = salario;
    }
    public String sqlINSERT(){
        return ("INSERT INTO PESSOA(NOME,CPF,IDADE, SALARIO) "+ 
                      " VALUES ('" + nomePessoa  +"'," +
                               "'" + cpfPesssoa  +"'," +
                                   + idadePessoa +","  +
                                   + salarioPessoa +")"  );
    }    
    public String sqlUPDATE(){
        return ("UPDATE PESSOA SET NOME = '"   + nomePessoa   +"'," +
                                  "IDADE = "   + idadePessoa  +","  +
                                  "SALARIO = " + salarioPessoa      +
                 " WHERE CPF = '"+ cpfPesssoa  +"'" );
    }
    public String sqlDELETE(){
        return ("DELETE FROM PESSOA "+  
                "WHERE CPF = '"+ cpfPesssoa  +"'");
    }
    public String sqlQUERYALL(){
        return ("SELECT CPF,NOME,IDADE,SALARIO FROM PESSOA ");
    }
    public String sqlQUERYCPF(){
        return ("SELECT CPF,NOME,IDADE,SALARIO FROM PESSOA WHERE CPF = '"+ cpfPesssoa +"'");
    }
    public String toString() {
        return "NOME:" + nomePessoa + " - CPF: " + cpfPesssoa + " - " + 
                idadePessoa + " anos. Sal. R$ " + salarioPessoa;
    }
}
