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
/**
 * Car class extends vehicle superclass 
 * sets size and floor letter for all trucks
 * @param String size the size of the trucks
 * @param String licensePlate the trucks unique plate number
 *@param String floor the floor that all trucks  go on
 */
    private String licensePlate;
    private String size = "large";
    private final boolean isHandicapped = false;
    String floor = "D";
    ParkingLotControl parkingLot;

    Truck(String licensePlate) {
        this.licensePlate = licensePlate;
        parkingLot = ParkingLotControl.getInstance();
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

    @Override
    public String getSize() {
        return size;
    }

}
