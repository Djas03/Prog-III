import java.util.Date;

public class Paciente extends Pessoa {
    
    //Atributes
    private String CPF;
    private Plano plano;
    
    
    //construtor
    public Paciente(String cpf, Plano plano, String nome, Date datanascimento, Endereco endereco){
        super(nome, datanascimento, endereco);
        this.CPF = cpf;
        this.plano = plano;

    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getCPF() {
        return CPF;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    public Plano getPlano() {
        return plano;
    }

    //metodes
    public void cadastrarpaciente(Paciente paciente){}
    public void alterarpaciente(Paciente paciente){}
    public void excluir(Paciente paciente){}
    public Paciente consultar (String cpf){}
    public Paciente[] consultar(String nome, Date datanascimento ){}

}
