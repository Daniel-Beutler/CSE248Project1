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

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;

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
// finds the next spot in the linked list and puts a car into it 

    public ParkingSpot findSpot() {
        ParkingSpot spotFinder;
        if (size == "small") {
            spotFinder = parkingLot.getMotoSpot().remove(0);
        }
        if (size == "medium" & isHandicaped == false) {
            spotFinder = parkingLot.getCarSpot().remove(0);
        }
        if (size == "medium" & isHandicaped == true) {
            spotFinder = parkingLot.getHandiSpot().remove(0);
        }
        if (size == "large" & isHandicaped == true) {
            spotFinder = parkingLot.getTruckSpot().remove(0);
        }
        else spotFinder=null;

        return spotFinder;

    }
// parks the car using put from the hash map and the park method

    public void park() {
        ParkingSpot Parker = findSpot();
        if (Parker != null) {
            parkingLot.fullSpots.put(this.licensePlate, Parker);
            Parker.park(this);
        }

    }
// replaces the vehicle in the linked list with a null

    public void pickUp() {
        ParkingSpot unParker = parkingLot.fullSpots.remove(this.licensePlate);
        unParker.pickUp();
        if (size == "small") {
            parkingLot.getMotoSpot().add(unParker);
        }
        if (size == "medium" & isHandicaped == false) {
            parkingLot.getCarSpot().add(unParker);
        }
        if (size == "medium" & isHandicaped == true) {
            parkingLot.getHandiSpot().add(unParker);
        }
        if (size == "large" & isHandicaped == true) {
            parkingLot.getTruckSpot().add(unParker);
        }
    }

}
