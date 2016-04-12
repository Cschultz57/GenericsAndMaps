/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Carson Schultz
 */
public class EmployeeTest {
       public static void main(String[] args) {
        Employee e1 = new Employee(1, "Smith", "Bob", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "Sally", "222-22-2222");
        Employee e3 = new Employee(3, "Stark", "Ned", "222-22-2222");        
        Employee e4 = new Employee(4, "Snow", "John", "333-33-3333");
        
        Map <String, Employee> employees = new HashMap<>(); 
        //.put needs a key and the value as inputs
        employees.put("1", e1);
        employees.put("2", e2);
        employees.put("3", e3);
        employees.put("4", e4);
                //run a loop through a map using a key
        Set<String> keys = employees.keySet();
        for(String key : keys){
            Employee e = employees.get(key);
            System.out.println(e);
        }
        Map <String, Employee> employees2 = new TreeMap<>(); 
        //.put needs a key and the value as inputs
        employees2.put("1", e1);
        employees2.put("2", e2);
        employees2.put("3", e3);
        employees2.put("4", e4);
}
}
