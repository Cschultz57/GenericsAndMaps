/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Objects;

/**
 *
 * @author Carson Schultz
 */
public class Licrorice {
    private String color;
    private String flavor;
    private String barCode;

    public Licrorice(String color, String flavor, String barCode) {
        this.color = color;
        this.flavor = flavor;
        this.barCode = barCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.barCode);
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
        final Licrorice other = (Licrorice) obj;
        if (!Objects.equals(this.barCode, other.barCode)) {
            return false;
        }
        return true;
    }
    
    
}
