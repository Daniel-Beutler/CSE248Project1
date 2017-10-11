package parkinglot;

public class Car extends Vehicle {

    private String licensePlate;
    private String size;
    private final boolean isHandicapped = false;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;

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

    ;  
    @Override
    public String getSize() {
        return size;
    }

}
