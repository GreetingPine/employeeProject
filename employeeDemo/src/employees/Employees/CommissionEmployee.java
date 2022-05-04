package employees.Employees;

public class CommissionEmployee  extends Employee{
    public CommissionEmployee(String name,double baseSalary){
        super(name,baseSalary);
    }

    @Override
    public double allSalary() {
        return super.getBaseSalary();
    }
}
