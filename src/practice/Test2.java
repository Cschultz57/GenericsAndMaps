
package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Carson Schultz
 */
public class Test2 {
    public static void main(String[] args) {      
  
    Map<String,String> record1 = new HashMap<>();
    record1.put("name", "Sally Jones");
    record1.put("ssn","111-11-1111");
    
    Map<String,String> record2 = new HashMap<>();
    record2.put("name", "Bob Jones");
    record2.put("ssn","222-22-2222");
    
    List<Map<String,String>> employees = new ArrayList<>();
    employees.add(record1);
    employees.add(record2);
}
  }
