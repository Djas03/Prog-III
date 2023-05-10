import java.util.Date;

public class Medico extends Pessoa{
    //Atributos
    private int CRM;
    private Especialidade especialidade;
    private double valorHora;

    public Medico(int crm, Especialidade especialidade,double valorHora, String nome, Date datanascimento, Endereco endereco){
        super(nome, datanascimento, endereco);
        this.CRM = crm;
        this.especialidade = especialidade;
        this.valorHora = valorHora;
    }
    //Set e get
    public void setCRM(int cRM) {
        CRM = cRM;
    }
    public int getCRM() {
        return CRM;
    }
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getValorHora() {
        return valorHora;
    }

    //Metodes
    public void cadastrar(Medico medico){}
    public void alterar(Medico medico){}
    public void excluir(Medico medico){}
    public Medico consultar(int crm){}
    public Medico[] consultar(String nome){}


}
