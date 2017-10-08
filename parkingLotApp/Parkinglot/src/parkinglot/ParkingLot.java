package parkinglot;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Daniel Beutler
 */
public class Parkinglot {

    HashMap<Integer, ParkingSpot> fullSpots;
    List<ParkingSpot> carSpots;
    List<ParkingSpot> handiSpots;
    List<ParkingSpot> truckSpots;
    List<ParkingSpot> motoSpots;
    private int carSpotNumber;
    private int handiSpotNumber;
    private int truckSpotNumber;
    private int motoSpotNumber;

    private Parkinglot() {
        carSpots = new LinkedList();
        handiSpots = new LinkedList();
        truckSpots = new LinkedList();
        motoSpots = new LinkedList();

        for (int i = 1; carSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "medium", false));
        }
        for (int i = 1; handiSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "medium", true));
        }
        for (int i = 1; truckSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "large", false));
        }
        for (int i = 1; motoSpotNumber >= i; i++) {
            carSpots.add(new ParkingSpot(i, "small", false) {});
        }
    }

    public List<ParkingSpot> getCarSpot() {
        return carSpots;
    }

    public List<ParkingSpot> getHandiSpots() {
        return handiSpots;
    }

    public List<ParkingSpot> getTruckSpots() {
        return truckSpots;
    }

    public List<ParkingSpot> getMotoSpots() {
        return motoSpots;
    }

}
