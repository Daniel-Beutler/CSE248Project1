package parkinglot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Daniel Beutler
 */
public class ParkingLotControl {

    /**
     * Class that controls the parking lot Uses a hashmap and 4 linked lists as
     * its data structure
     *
     */
    private static ParkingLotControl lot = null;
    Map<String, ParkingSpot> fullSpots;
    private final List<ParkingSpot> carSpots;
    private final List<ParkingSpot> handiSpots;
    private final List<ParkingSpot> truckSpots;
    private final List<ParkingSpot> motoSpots;
    private int carSpotNumber = 10;
    private int handiSpotNumber = 10;
    private int truckSpotNumber = 10;
    private int motoSpotNumber = 10;

    ParkingLotControl() {
        carSpots = new LinkedList<>();
        handiSpots = new LinkedList<>();
        truckSpots = new LinkedList<>();
        motoSpots = new LinkedList<>();
        fullSpots = new HashMap<>();
//** sets up 10 parking spots of each type
        for (int i = 1; carSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "medium"));
        }
        for (int i = 1; handiSpotNumber >= i; i++) {
            handiSpots.add(new ParkingSpot(i, "medium"));
        }
        for (int i = 1; truckSpotNumber >= i; i++) {
            truckSpots.add(new ParkingSpot(i, "large"));
        }
        for (int i = 1; motoSpotNumber >= i; i++) {
            motoSpots.add(new ParkingSpot(i, "small"));
        }
    }

    public List<ParkingSpot> getCarSpot() {
        return carSpots;
    }

    public List<ParkingSpot> getHandiSpot() {
        return handiSpots;
    }

    public List<ParkingSpot> getTruckSpot() {
        return truckSpots;
    }

    public List<ParkingSpot> getMotoSpot() {
        return motoSpots;
    }

    public void setCarSpotNumber(int carSpotNumber) {
        this.carSpotNumber = carSpotNumber;
    }

    public void setHandiSpotNumber(int handiSpotNumber) {
        this.handiSpotNumber = handiSpotNumber;
    }

    public void setTruckSpotNumber(int truckSpotNumber) {
        this.truckSpotNumber = truckSpotNumber;
    }

    public void setMotoSpotNumber(int motoSpotNumber) {
        this.motoSpotNumber = motoSpotNumber;
    }

    public int getHandiSpotNumber() {
        return handiSpotNumber;
    }
// makes sure the ParkingLotControl isn't null
    public static ParkingLotControl getInstance() {
        if (lot == null) {
            lot = new ParkingLotControl();
        }
        return lot;
    }

}
