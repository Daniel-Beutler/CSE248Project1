package parkinglot;

/**
 *
 * @author Dan
 */
public abstract class Vehicle {

    private String size;
    private String licensePlate;
    private boolean parkingStatus;
    ParkingLotControl parkingLot;
    boolean isHandicaped;

    public Vehicle() {

    }

    public Vehicle(String licensePlate, int parkedTime) {
        this.licensePlate = licensePlate;
        parkingLot = ParkingLotControl.getInstance();
    }


// replaces the vehicle in the linked list with a null
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

}
