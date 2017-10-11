/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

/**
 *
 * @author Daniel Beutler
 */
public class Motorcycle extends Vehicle {
/**
 * Car class extends vehicle superclass 
 * sets size and floor letter for all bikes
 * @param String size the size of the bike
 * @param String licensePlate the bikes unique plate number
 *
 */
    
    
    
    private String licensePlate;
    private String size = "small";
    private final boolean isHandicapped = false;
    String floor = "C";
    ParkingLotControl parkingLot;

    Motorcycle(String licensePlate) {
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
        this.size = "small";
    }

    @Override
    public String getSize() {
        return size;
    }

}
