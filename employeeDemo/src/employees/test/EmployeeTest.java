package employees.test;
import employees.Employees.*;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employeeA = new CommissionEmployee("Bile",2500.00);
        employees.add(employeeA);
        employees.add(new BasePlusCommissionEmployee("Alis",1000.00,employeeA));
        employees.add(new SalariedEmployee("milk",4300.00));
        employees.add(new HourlyEmployee("lisa",18,60));

        System.out.println("----------      本周工资单      ----------");
        System.out.println("按照工资进行排序");
        Collections.sort(employees);
        for(Employee e : employees){
            System.out.println(e.getInfo());
        }

        System.out.println("按照姓名进行排序");
        //Lambda表达式写法实现：
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Employee e : employees){
            System.out.println(e.getInfo());
        }
    }
}

