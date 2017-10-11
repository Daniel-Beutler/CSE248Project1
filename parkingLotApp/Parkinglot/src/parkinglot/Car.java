package parkinglot;
/**@author Daniel Beutler
@version 1.0
* 
*/
public class Car extends Vehicle {
/**
 * Car class extends vehicle superclass 
 * sets size and floor letter for all cars
 * @param String size the size of the car
 * @param String licensePlate the cares unique plate number
 *
 */
    private final String licensePlate;
    private String size = "medium";
    String floor = "B";

    public Car(String licensePlate) {
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
        this.size = "medium";
    }

    @Override
    public String getSize() {
        return size;
    }

}
