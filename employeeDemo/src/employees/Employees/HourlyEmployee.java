package employees.Employees;

public class HourlyEmployee extends Employee{
    private double hourSalary;//时薪
    private double hours;//工作小时数

    public HourlyEmployee(String name,double hourSalary, double hours) {
        super(name);
        this.hourSalary = hourSalary;
        this.hours = hours;
    }

    @Override
    public double allSalary() {
        if(this.hours > 40){
            return this.hourSalary*40 + (this.hours - 40)*this.hourSalary*1.5;
        }
        return this.hourSalary*this.hours;
    }
}
