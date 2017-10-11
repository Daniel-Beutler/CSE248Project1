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
public class ParkingSpot {

    public int lotNumber;
    public int time;
    private boolean openSpot;
    private String size;
    private Vehicle myParker;
    private boolean isHandi = false;

    public ParkingSpot(int lotNumber, String Size, boolean isHandi) {
        this.lotNumber = lotNumber;
        this.size = size;
        this.openSpot = true;

    }

    public void setlotNumber(int lotNumber) {
        lotNumber = this.lotNumber;
    }

    public int getlotNumber() {
        return lotNumber;
    }

    public void park(Vehicle v) {
        this.myParker = v;
        this.openSpot = false;

    }

    public void pickUp() {
        this.myParker = null;
        this.openSpot = true;
    }
}
