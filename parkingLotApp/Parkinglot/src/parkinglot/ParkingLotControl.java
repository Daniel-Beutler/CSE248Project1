package parkinglot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Daniel Beutler
 */
public class ParkingLotControl {

    HashMap<String  , ParkingSpot> fullSpots;
    List<ParkingSpot> carSpots;
    List<ParkingSpot> handiSpots;
    List<ParkingSpot> truckSpots;
    List<ParkingSpot> motoSpots;
    private int carSpotNumber;
    protected int handiSpotNumber;
    private int truckSpotNumber;
    private int motoSpotNumber;

    private ParkingLotControl() {
        carSpots = new LinkedList();
        handiSpots = new LinkedList();
        truckSpots = new LinkedList();
        motoSpots = new LinkedList();
        fullSpots = new HashMap<>();

        for (int i = 1; carSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "medium", false));
        }
        for (int i = 1; handiSpotNumber >= i; i++) {
            handiSpots.add(new ParkingSpot(i, "medium", true));
        }
        for (int i = 1; truckSpotNumber >= i; i++) {
            truckSpots.add(new ParkingSpot(i, "large", false));
        }
        for (int i = 1; motoSpotNumber >= i; i++) {
            motoSpots.add(new ParkingSpot(i, "small", false) {
            });
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

}
