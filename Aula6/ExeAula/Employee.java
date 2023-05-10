package Aula6.ExeAula;

public abstract class Employee {
    private final String firstName;
    private final String lastname;
    private final String socialSecurityNumber;

    //construtor
    public Employee(String firstname, String lastname, String socialSecurityNumber){
        this.firstName = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s %s%nsocial number: %s", getFirstName(), getLastname(), getSocialSecurityNumber());
    }

    // O metodo abstract deve ser sobrescrito pelas subclasses concretas
    public abstract double earnings(); // nenhuma implementação aqui

}
