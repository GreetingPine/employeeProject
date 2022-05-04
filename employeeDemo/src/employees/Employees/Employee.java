package employees.Employees;

import java.util.Comparator;

public abstract class Employee implements Comparable<Employee> {
    private String name;//姓名
    private double baseSalary;//底薪

    public Employee(){}
    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return this.name;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }

    public abstract double allSalary();//计算总工资

    public String getInfo(){//打印信息
        return "姓名："+ this.name+"\t工资："+this.allSalary();
    }


    @Override
    public int compareTo(Employee o){
        if(o.allSalary() > this.allSalary()){
            return 1;
        }
        return -1;
    }
}
