
package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Carson Schultz
 */
public class Bike implements Comparable{
    private String manufacturer;
    private String serialNum;

    public Bike(String manufacturer, String serialNum) {
        this.manufacturer = manufacturer;
        this.serialNum = serialNum;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.serialNum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bike other = (Bike) obj;
        if (!Objects.equals(this.serialNum, other.serialNum)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Object other) {
        
        Bike o = (Bike)other;
        
        return new CompareToBuilder()
               .append(this.serialNum, o.serialNum)
               .toComparison();
    }
    @Override
    public String toString() {
        return "Bike{" + "SerialNum=" + serialNum + ", Manufacturer=" + manufacturer+'}';
    }
    
    
}
