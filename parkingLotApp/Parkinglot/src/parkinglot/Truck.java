/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

/**
 *
 * @author Dan
 */
public class Truck extends Vehicle {

    private String licensePlate;
    private String size;
    private final boolean isHandicapped = false;

    Truck(String licensePlate) {
        this.licensePlate = licensePlate;

    }

    @Override
    public void setLicensePlate(String licensePlate) {
        licensePlate = this.licensePlate;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public void setSize(String size) {
        this.size = "large";
    }

    ;  
    @Override
    public String getSize() {
        return size;
    }

}
