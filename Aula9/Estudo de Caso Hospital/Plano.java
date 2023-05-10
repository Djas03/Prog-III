public class Plano {
    private String Nome;
    private double Mensalidade;

    public Plano(String nome, double mensalidade){
        this.Nome = nome;
        this.Mensalidade = mensalidade;
    }


    public void setNome(String nome) {
        Nome = nome;
    }
    public String getNome() {
        return Nome;
    }

    public void setMensalidade(double mensalidade) {
        Mensalidade = mensalidade;
    }
    public double getMensalidade() {
        return Mensalidade;
    }


    
}
