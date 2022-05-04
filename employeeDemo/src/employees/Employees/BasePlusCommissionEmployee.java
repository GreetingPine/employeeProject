package employees.Employees;

public class BasePlusCommissionEmployee extends Employee{
    private double pushMoney;//销售提成
    private Employee employee;

    public BasePlusCommissionEmployee(String name,double pushMoney,Employee employee) {
        super(name);
        this.pushMoney = pushMoney;
        this.employee = employee;
    }

    @Override
    public double allSalary() {
        return employee.getBaseSalary()+this.pushMoney;
    }
}
