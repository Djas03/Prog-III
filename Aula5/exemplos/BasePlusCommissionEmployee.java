public class BasePlusCommissionEmployee{
    private double baseSalary; // salário-base por semana

    public BasePlusCommissionEmployee(CommissionEmployee FirstName,CommissionEmployee LastName, CommissionEmployee SSNumber, CommissionEmployee grossSales, CommissionEmployee commissionRate, double baseSalary){
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override public String toString(){
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
