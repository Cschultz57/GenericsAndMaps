/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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

        Map<String, Employee> employees = new HashMap<>();
        //.put needs a key and the value as inputs
        employees.put(e1.getSsn(), e1);
        employees.put(e2.getSsn(), e2);
        employees.put(e3.getSsn(), e3);
        employees.put(e4.getSsn(), e4);

        //run a loop through a map using a key
        System.out.println("Looping over the keys: (HashMap) ");
        Set<String> keys = employees.keySet();
        for (String key : keys) {
            Employee e = employees.get(key);
            System.out.println(e);
        }
        System.out.println("Retrieving a chosen employee: ");
        Employee retrieved = employees.get("222-22-2222");
        System.out.println(retrieved);

        Map<Integer, Employee> employees2 = new TreeMap<>();
        //.put needs a key and the value as inputs
        //added an INT key in class example
        employees2.put(9, e1);
        employees2.put(11, e2);
        employees2.put(8, e3);
        employees2.put(1, e4);

        System.out.println("Looping through values: (TreeMap) ");
        Collection<Employee> values = employees2.values();
        for (Employee e : values) {
            System.out.println(e);
        }
        Set<Employee> set = new TreeSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println("Looping through the TreeSet");
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
