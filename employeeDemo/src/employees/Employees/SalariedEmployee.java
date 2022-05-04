package employees.Employees;
public class SalariedEmployee extends Employee{
    private double saleSalary;//销售额提成

    public SalariedEmployee(String name,double saleSalary) {
        super(name);
        this.saleSalary = saleSalary;
    }

    @Override
    public double allSalary() {
        return this.saleSalary;
    }
}
