import java.util.Date;

public abstract class Pessoa {
    //Atributes
    private String Nome;
    private Date datanascimento;
    private Endereco endereco;

    //consturtor
    public Pessoa(String nome, Date datanascimento, Endereco endereco){
        this.Nome = nome;
        this.datanascimento = datanascimento;
        this.endereco = endereco;  
    }

    //Set e get
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getNome() {
        return Nome;
    }
    
    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
    public Date getDatanascimento() {
        return datanascimento;
    }
    public void setEndereço(Endereco endereço) {
        this.endereco = endereço;
    }
    public Endereco getEndereço() {
        return endereco;
    }




}
