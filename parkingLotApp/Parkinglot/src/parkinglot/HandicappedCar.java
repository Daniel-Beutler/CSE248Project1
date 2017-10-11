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
public class HandicappedCar extends Vehicle {

    private String licensePlate;
    private String size;
    private final boolean isHandicapped = true;

    HandicappedCar(String licensePlate) {
        this.licensePlate = licensePlate;

    }

    public void setLicensePlate(String licensePlate) {
        licensePlate = this.licensePlate;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public void setSize(String size) {
        this.size = "medium";
    }

    ;  
    @Override
    public String getSize() {
        return size;
    }

}
