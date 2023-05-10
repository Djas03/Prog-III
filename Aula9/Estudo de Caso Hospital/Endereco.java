public class Endereco {
    private String logradouro;
    private int numero;
    private int CEP;
    private String bairro;

    public Endereco(String logradouro, int numero, int CEP, String bairro){
        this.logradouro = logradouro;
        this.numero = numero;
        this.CEP = CEP;
        this.bairro = bairro;
    }

    //Set e get
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setCEP(int cEP) {
        CEP = cEP;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getCEP() {
        return CEP;
    }

    
}
