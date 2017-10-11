package parkinglot;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class parkingLot extends Application implements EventHandler<ActionEvent> {
//**Creats buttons

    private final Button buttonAdd = new Button("Park   ");
    private final Button buttonPickUp = new Button("Pick Up");
    private final Button buttonDisplay = new Button("Display");
    private final Button buttonPay = new Button("pay");
    private final Button returnButton = new Button("return");

    private Stage window;
    private Scene sceneMain, pickUpScene, displayScene;
// creates 1 of each type of vehicle
    private Motorcycle moto1;
    private Truck truck1;
    private Car car1;
    private HandicappedCar handi1;
// check boxes for ui
    private CheckBox motoBox;
    private CheckBox carBox;
    private CheckBox truckBox;
    private CheckBox handiBox;
// text feilds for timesetting
    private TextField textMain;
    private TextField dayField;
    private TextField monthField;
    private TextField hourField;
    private TextField yearField;
// labels for time setting
    private Label dayLabel;
    private Label monthLabel;
    private Label hourLabel;
    private Label yearLabel;

    public void start(Stage primaryStage) {
        window = primaryStage;
        ParkingLotControl.getInstance();
//sets the buttons to do an action on click
        buttonAdd.setOnAction(this);
        buttonPickUp.setOnAction(this);
        buttonDisplay.setOnAction(this);
        buttonPay.setOnAction(this);

        window.setTitle("Parking Lot");
        mainScreen();
        window.setScene(sceneMain);
        window.show();

        car1 = new Car("Car_SXY342");
        ParkingSpot mySpot;
        mySpot = new ParkingSpot(2122, "small");
        car1.parkingLot.fullSpots.put(car1.getLicensePlate(), mySpot);
    }

    @Override
    public void handle(ActionEvent event) {
        /**
         * allows the action handler to listen for spefic button presses
         */
        if (event.getSource() == buttonAdd) {

            mainScreenControl();
        }
        if (event.getSource() == buttonDisplay) {
            displayScreen();
            window.setScene(displayScene);
        }
        if (event.getSource() == buttonPickUp) {
            pickUpScreen();
            window.setScene(pickUpScene);
        }
        if (event.getSource() == buttonPay) {
            window.setScene(sceneMain);

        }
        if (event.getSource() == returnButton) {

        }
    }

    public void mainScreenControl() {
        /**
         * Brain of the main screen checks for multiple check box selections
         * sets up the UI puts vehicles in there properf place
         */
        if (motoBox.isSelected() == true & handiBox.isSelected() == true || motoBox.isSelected() == true & truckBox.isSelected() == true || handiBox.isSelected() == true & truckBox.isSelected() == true || motoBox.isSelected() == true & carBox.isSelected() || carBox.isSelected() == true & truckBox.isSelected() == true || carBox.isSelected() == true & handiBox.isSelected() == true || handiBox.isSelected() == true & truckBox.isSelected() == true) {
            textMain.setText("Select 1");
        } else if (motoBox.isSelected() == true) {
            if (payment() != 0) {
                moto1 = new Motorcycle(textMain.getText());
                ParkingSpot mySpot;
                mySpot = new ParkingSpot(payment(), moto1.getSize());
                moto1.parkingLot.fullSpots.put("Moto_" + moto1.getLicensePlate(), mySpot);
                textMain.setText("Motorcycle Parked!");
            } else {
                yearField.setText("total time can't be zero");
                dayField.setText("total time can't be zero");
                monthField.setText("total time can't be zero");
                hourField.setText("total time can't be zero");
                System.out.println("Time can't be zero");
            }
        } else if (carBox.isSelected() == true) {
            if (payment() != 0) {
                car1 = new Car(textMain.getText());
                ParkingSpot mySpot;
                mySpot = new ParkingSpot(payment(), car1.getSize());
                car1.parkingLot.fullSpots.put("Car_" + car1.getLicensePlate(), mySpot);
                textMain.setText("Car Parked!");

            } else {
                yearField.setText("total time can't be zero");
                dayField.setText("total time can't be zero");
                monthField.setText("total time can't be zero");
                hourField.setText("total time can't be zero");
                System.out.println("Time can't be zero");
            }
        } else if (truckBox.isSelected() == true) {
            if (payment() != 0) {
                truck1 = new Truck(textMain.getText());
                ParkingSpot mySpot;
                mySpot = new ParkingSpot(payment(), truck1.getSize());
                truck1.parkingLot.fullSpots.put("Truck_" + truck1.getLicensePlate(), mySpot);
                textMain.setText("Truck Parked!");

            } else {
                yearField.setText("total time can't be zero");
                dayField.setText("total time can't be zero");
                monthField.setText("total time can't be zero");
                hourField.setText("total time can't be zero");
                System.out.println("Time can't be zero");
            }
        } else if (handiBox.isSelected() == true) {
            if (payment() != 0) {

                handi1 = new HandicappedCar(textMain.getText());
                ParkingSpot mySpot;
                mySpot = new ParkingSpot(payment(), handi1.getSize());
                handi1.parkingLot.fullSpots.put("Handicapped_" + handi1.getLicensePlate(), mySpot);
                textMain.setText("Handicapped Car Parked!");
            } else {
                yearField.setText("total time can't be zero");
                dayField.setText("total time can't be zero");
                monthField.setText("total time can't be zero");
                hourField.setText("total time can't be zero");
                System.out.println("Time can't be zero");
            }
        }
    }

    /*
*sets up the payment screen, holds payment ratios and 
     */
    public void pickUpScreen() {
        GridPane grid4 = new GridPane();
        double paymentOwed = 0;
        if (car1.parkingLot.fullSpots.containsKey("Car_" + textMain.getText()) == true) {
            ParkingSpot paySpot = car1.parkingLot.fullSpots.get("Car_" + textMain.getText());
            paymentOwed = paySpot.getParkedTime();
        } else if (car1.parkingLot.fullSpots.containsKey("Moto_" + textMain.getText()) == true) {
            ParkingSpot paySpot = moto1.parkingLot.fullSpots.get("Moto_" + textMain.getText());
            paymentOwed = paySpot.getParkedTime() * .8;
            truck1.parkingLot.fullSpots.remove("Moto_" + textMain.getText());

        } else if (car1.parkingLot.fullSpots.containsKey("Truck_" + textMain.getText()) == true) {
            ParkingSpot paySpot = truck1.parkingLot.fullSpots.get("Truck_" + textMain.getText());
            paymentOwed = paySpot.getParkedTime() * 1.2;
            truck1.parkingLot.fullSpots.remove("Truck_" + textMain.getText());

        } else if (car1.parkingLot.fullSpots.containsKey("Handicapped_" + textMain.getText()) == true) {
            ParkingSpot paySpot = handi1.parkingLot.fullSpots.get("Handicapped_" + textMain.getText());
            handi1.parkingLot.fullSpots.remove("Handicapped_" + textMain.getText());
            paymentOwed = paySpot.getParkedTime() * .8;
        } else {
            window.setScene(sceneMain);

        }

        Label payLabel = new Label("payment owed:" + paymentOwed);
        TextField payText = new TextField("Enter Payment Into");
        grid4.add(buttonPay, 0, 2, 0, 5);
        grid4.add(payLabel, 0, 0);
        grid4.add(payText, 0, 1);
        pickUpScene = new Scene(grid4, 120, 125);

    }

    public void displayScreen() {
        GridPane grid3 = new GridPane();
        Label carLabel = new Label(car1.parkingLot.fullSpots.keySet() + "");

        grid3.add(carLabel, 0, 0);

        displayScene = new Scene(grid3, 250, 250);

    }
// computes the amount of time the car has been parked. There is a built in discount for staying months and years instead of days and hours.

    public int payment() {
        int hour = 1, day = 0, month = 0, year = 0;
        try {
            hour = Integer.parseInt(hourField.getText());
            day = Integer.parseInt(dayField.getText());
            month = Integer.parseInt(monthField.getText());
            year = Integer.parseInt(yearField.getText());
        } catch (NumberFormatException e) {
            yearField.setText("All fields must be numbers");
            dayField.setText("All fields must be numbers");
            monthField.setText("All fields must be numbers");
            hourField.setText("All fields must be numbers");
        }
        return hour + (day * 24) + (month * 138) + (year * 4380);

    }

    public void mainScreen() {
        // java fx for the main screen
        GridPane grid2 = new GridPane();
        grid2.add(buttonAdd, 0, 1, 1, 1);
        grid2.add(buttonPickUp, 2, 1, 1, 1);
        grid2.add(buttonDisplay, 3, 1);
        Label mainLabel = new Label();

        truckBox = new CheckBox("Truck");

        motoBox = new CheckBox("Motorcycle ");
        carBox = new CheckBox("Car   ");
        handiBox = new CheckBox("Handicapped car");

        hourField = new TextField("1");
        hourLabel = new Label("Enter amount of hours:");

        dayField = new TextField("0");
        dayLabel = new Label("Enter amount of days:");
        monthField = new TextField("0");
        monthLabel = new Label("Enter amount of months:");

        yearField = new TextField("0");
        yearLabel = new Label("Enter amount of Years");
        grid2.add(carBox, 0, 2);
        grid2.add(handiBox, 1, 2);
        grid2.add(motoBox, 2, 2);
        grid2.add(truckBox, 3, 2);

        grid2.add(dayLabel, 0, 4, 2, 1);
        grid2.add(hourLabel, 0, 3, 2, 1);
        grid2.add(monthLabel, 0, 5, 2, 1);
        grid2.add(yearLabel, 0, 6, 2, 1);
        grid2.add(dayField, 2, 4, 4, 1);
        grid2.add(hourField, 2, 3, 4, 1);
        grid2.add(monthField, 2, 5, 4, 1);
        grid2.add(yearField, 2, 6, 4, 1);

        textMain = new TextField("Enter License Plate");
        grid2.add(textMain, 1, 1);
        grid2.add(mainLabel, 0, 4, 4, 4);
        sceneMain = new Scene(grid2, 360, 150);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
