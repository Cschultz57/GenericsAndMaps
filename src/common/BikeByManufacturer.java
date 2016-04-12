
package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Carson Schultz
 */
public class BikeByManufacturer implements Comparator<Bike> {

    @Override
    public int compare(Bike o1, Bike o2) {
        return new CompareToBuilder()
                .append(o1.getManufacturer(),o2.getManufacturer())
                .toComparison();
    }
    
}
