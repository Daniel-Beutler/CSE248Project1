package parkinglot;

/**
 *
 * @author Dan
 */
public abstract class Vehicle {

    private String size;
    public String licensePlate;
    private boolean parkingStatus;

    public Vehicle() {

    }

    public Vehicle(String licensePlate, String size) {
        this.licensePlate = licensePlate;
        this.size = size;

    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    ;  
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public boolean isHandicaped() {
        return false;
    }
    
    public ParkingSpot findSpot()
    {
        ParkingSpot spotFinder;
        if(size=="small")
        {
           spotFinder = ParkingSpot.getMotoSpot().remove(0); 
        }
    }
}
