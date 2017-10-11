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
public class ParkingSpot {
/**
 * Sets up parkingSpots, gives them a size and the ability to be parked on */
    public int lotNumber;
    private String size;
    private Vehicle myParker;
    private int parkedTime;
  
    public ParkingSpot()
    {
        
    }
    public ParkingSpot(int parkedTime, String Size) {
        this.parkedTime = parkedTime;
    }

    public void setlotNumber(int lotNumber) {
        lotNumber = this.lotNumber;
    }

    public void setParkedTime(int parkedTime) {
        this.parkedTime = parkedTime;
    }

    public int getParkedTime() {
        return parkedTime;
    }

//** method that allows vehicle to park
    public void occupy(Vehicle v) {
        this.myParker = v;
        size = v.getSize();
    }

   

}
