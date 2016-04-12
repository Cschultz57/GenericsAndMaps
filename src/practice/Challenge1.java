
package practice;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Carson Schultz
 */
public class Challenge1 {
    public static void main(String[] args) {
        
    
        Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
        Employee e3 = new Employee(3, "Stark", "Ned", "333-33-3333");
        Employee e4 = new Employee(2, "Jones", "Sally", "222-22-2222");
        
        Map<String, Employee> employees = new HashMap<>();
        employees.put("111-11-1111", e1);
        employees.put("222-22-2222", e2);
        employees.put("333-33-3333", e3);
        
//        //run a loop through a map using the values
//        Collection<Employee> values = employees.values();
//        for(Employee e : values){            
//            System.out.println(e);
//        }
        
//        //run a loop through a map using a key
//        Set<String> keys = employees.keySet();
//        for(String key : keys){
//            Employee e = employees.get(key);
//            System.out.println(e);
//        }
//        
}
}