
package practice;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Carson Schultz
 */
public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
        Employee e3 = new Employee(3, "Stark", "Ned", "333-33-3333");
        
        List<Employee> wctcEmployees = new ArrayList<>();
        wctcEmployees.add(e1);
        wctcEmployees.add(e2);
        wctcEmployees.add(e3);
        
        Employee e4 = new Employee(4, "Sanders", "Bernie", "444-44-4444");
        Employee e6 = new Employee(6, "Clinton", "Hillary", "666-66-6666");
        Employee e5 = new Employee(5, "Cruz", "Ted", "555-55-5555");
        
        List<Employee> politicians = new ArrayList<>();
        politicians.add(e4);
        politicians.add(e5);
        politicians.add(e6);
        
        //missing code here from class in video on blackboard
        
        //the diamonds make it so that you can only store strings and employees and also auto cast
        //the objects as employees for output
        Map <String, Employee> employees = new HashMap<>(); 
        //.put needs a key and the value as inputs
        employees.put("111-11-1111", e1);
        employees.put("222-22-2222", e2);
        employees.put("333-33-3333", e3);
        
        Employee employee = employees.get("111-11-1111");
        System.out.println(employee.getSsn());
        
        Employee oldBff = employees.put("bff", e3);
        Employee employee1 = employees.get("bff");
        System.out.println(employee1.getSsn());
    }
}
