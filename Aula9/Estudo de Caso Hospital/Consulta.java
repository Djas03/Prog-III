import java.util.Date;

public class Consulta {
    //Atributes 
    private Paciente paciente;
    private Medico medico;
    private Date data;

    //Construtor
    public Consulta(Paciente paciente, Medico medico, Date data){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    } 

    //Set e get
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

    //Metodos
    public void Marcar(Medico medico, Paciente paciente, Date data){}
    public void Cancelar (Consulta consulta){}
    public Consulta[] pesquisarPorPaciente(Paciente paciente){}

}
