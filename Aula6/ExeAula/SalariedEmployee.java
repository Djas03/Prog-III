package Aula6.ExeAula;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //construtor
    public SalariedEmployee(String firstname, String lastname, String socialSecurityNumber, double weeklySalary){
        super(firstname, lastname, socialSecurityNumber);

        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    //configura o salario
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    //retorna o salario
    
}
