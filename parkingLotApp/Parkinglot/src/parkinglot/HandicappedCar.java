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
/**
 * Car class extends vehicle superclass 
 * sets size and floor letter for all handicapped cars
 * @param String size the size of the handicapped cars
 * @param String licensePlate the handicapped cars unique plate number
 *@param String floor the floor that all handicapped cars go on
 */
    private String licensePlate;
    private String size = "medium";
    private final boolean isHandicapped = true;
    String floor = "A";
    ParkingLotControl parkingLot;

    HandicappedCar(String licensePlate) {
        this.licensePlate = licensePlate;
        parkingLot = ParkingLotControl.getInstance();
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
