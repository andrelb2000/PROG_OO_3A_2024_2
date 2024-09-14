public class PecaServico {
    private String nomePeca;
    private double precoPeca;
    public PecaServico(String nome,double preco){
        nomePeca = nome;
        precoPeca = preco;
    }
    public String getNomePeca(){
        return(this.nomePeca);
    }
    public double getPrecoPeca(){
        return(precoPeca);
    }
    public void setNomePeca(String nome){
        nomePeca = nome;
    }
    public void setPrecoPeca(double preco){
        precoPeca = preco;
    }


    
}
