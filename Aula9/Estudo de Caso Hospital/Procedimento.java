import java.util.Date;
import java.util.concurrent.atomic.DoubleAdder;

public class Procedimento {
    private Paciente paciente;
    private Medico medico;
    private Date data;
    private double valor;
    private int tempoDuracao;

    //Contrutor 
    public Procedimento(Paciente paciente,Medico medico,Date data,double valor,int tempoDuracao){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.valor = valor;
        this.tempoDuracao = tempoDuracao;
    }

    //Get e set
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Date getData() {
        return data;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
    public int getTempoDuracao() {
        return tempoDuracao;
    }


    //Metodos
    public void marcar(Medico medico, Paciente paciente, Date data){}
    public void cancelar(Procedimento procedimento){}
    public Procedimento[] pesquisarPorMedico(Medico medico){}
    public double calcularTotal(){}
    

}
