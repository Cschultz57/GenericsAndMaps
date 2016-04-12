
package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Carson Schultz
 */
public class BikeApp {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Schwinn", "9999");
        Bike bike2 = new Bike("Trek", "1234");
        
        //use this to test your equals method
//        if(bike1.equals(bike2)){
//            System.out.println("Equal");
//        }else{
//            System.out.println("not equal");
//        }

    Set<Bike> bikes = new TreeSet<>();
    bikes.add(bike1);
    bikes.add(bike2);
    
     System.out.println("The size of the Sorted Set is: " + bikes.size());
        System.out.println("sorted by serialNumber: ");
        for(Bike b : bikes) {
            System.out.println(b);
        }
        
        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        Collections.sort(bikeList, new BikeByManufacturer());
        
        System.out.println("Sorted by manufacturer: ");
        for(Bike b: bikeList){
            System.out.println(b);
        }
        
        Bike[] bikeArray = { bike1, bike2};
        
        Arrays.sort(bikeArray);
        
        System.out.println("Array of bikes sorted by default... :");
        System.out.println("The size of the array is: " + bikeArray.length);
        for(Bike b : bikeArray) {
            System.out.println(b);
        }
    }
}
