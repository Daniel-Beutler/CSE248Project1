package parkinglot;
public class Car extends Vehicle {

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

    @Override
    public boolean isHandicaped() {
        return false;
    }

}