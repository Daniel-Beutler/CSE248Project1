/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Dan
 */
public class parkingLot extends Application implements EventHandler<ActionEvent> {

   private Button buttonConfirm = new Button("Confirm");
   private Button buttonAdd = new Button("Park   ");
   private Button buttonPickUp = new Button("Pick Up");
   private Button buttonDisplay = new Button("Display");
   private Stage window;
   private Scene sceneSetup, sceneMain;
  private  Car car;
private    ParkingLotControl parkingLotControl = new ParkingLotControl();

   private TextField handiTextField = new TextField("10");
   private TextField carTextField = new TextField("10");
   private TextField truckTextField = new TextField("10");
   private TextField motoTextField = new TextField("10");

   private CheckBox motoBox;
   private CheckBox carBox;
   private CheckBox truckBox;
   private CheckBox handiBox;
    private TextField textMain;
    private TextField timeBox;
    private TextField dayBox;
    private TextField monthBox;
    private TextField hourBox;
    private Node yearBox;

    public void start(Stage primaryStage) {
        window = primaryStage;
// java fx for the setup screen
        GridPane grid = new GridPane();
        Label addVehicles = new Label("Enter the amount of parking spaces for:");
        grid.add(addVehicles, 0, 0);

        Label carSpots = new Label("Cars");
        grid.add(carSpots, 0, 1);
        grid.add(carTextField, 1, 1);

        Label truckSpots = new Label("Trucks");
        grid.add(truckSpots, 0, 2);
        grid.add(truckTextField, 1, 2);

        Label motoSpots = new Label("Motorcycles");
        grid.add(motoSpots, 0, 3);
        grid.add(motoTextField, 1, 3);

        Label handiSpots = new Label("Handicapped Cars");
        grid.add(handiSpots, 0, 4);
        grid.add(handiTextField, 1, 4);

        grid.add(buttonConfirm, 1, 5);
        buttonConfirm.setOnAction(this);
        buttonAdd.setOnAction(this);
        buttonPickUp.setOnAction(this);
        buttonDisplay.setOnAction(this);
        Scene sceneSetup = new Scene(grid, 375, 150);
        window.setTitle("Parking Lot");
        window.setScene(sceneSetup);

        window.setTitle("Parking Lot");
        window.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == buttonConfirm) {
            parkingLotControl.setHandiSpotNumber(Integer.parseInt(handiTextField.getText()));
            parkingLotControl.setCarSpotNumber(Integer.parseInt(carTextField.getText()));
            parkingLotControl.setTruckSpotNumber(Integer.parseInt(truckTextField.getText()));
            parkingLotControl.setMotoSpotNumber(Integer.parseInt(motoTextField.getText()));
            mainScreen();
            window.setScene(sceneMain);
        }
        if (event.getSource() == buttonAdd) {
          mainScreenControl();
        }
    }

    public void mainScreenControl() {
        if (motoBox.isSelected() == true & handiBox.isSelected() == true ||motoBox.isSelected() == true &truckBox.isSelected() == true|| handiBox.isSelected() == true & truckBox.isSelected() == true || motoBox.isSelected() == true & carBox.isSelected() || carBox.isSelected() == true & truckBox.isSelected() == true || carBox.isSelected() == true & handiBox.isSelected() == true || handiBox.isSelected() == true & truckBox.isSelected() == true) {
            textMain.setText("Select 1");
        } else if (motoBox.isSelected() == true) {
            Motorcycle moto1 = new Motorcycle(textMain.getText());
            System.out.println(moto1.getLicensePlate());
            moto1.park();
            textMain.setText("Motorcycle Parked!");
        } else if (carBox.isSelected() == true) {
            Car car1 = new Car(textMain.getText());
            System.out.println(car1.getLicensePlate());
            car1.park();
            textMain.setText("CarParked!");
        } else if (truckBox.isSelected() == true) {
            Truck truck1 = new Truck(textMain.getText());
            System.out.println(truck1.getLicensePlate());
            truck1.park();
            textMain.setText("Truck Parked!");
        } else if (handiBox.isSelected() == true) {
            HandicappedCar handi1 = new HandicappedCar(textMain.getText());
            System.out.println(handi1.getLicensePlate());
            handi1.park();
            textMain.setText("Handicapped Car Parked!");
        }
    }

    public void mainScreen() {
        // java fx for the main screen
        GridPane grid2 = new GridPane();
        grid2.add(buttonAdd, 0,1,1,1);
        grid2.add(buttonPickUp, 2, 1,1,1);
         grid2.add(buttonDisplay,3,1);
        Label mainLabel = new Label();

        truckBox = new CheckBox("Truck");

        motoBox = new CheckBox("Motorcycle ");
        carBox = new CheckBox("Car   ");
        handiBox = new CheckBox("Handicapped car");
        dayBox = new TextField("Enter amount of days ");
        monthBox = new TextField("Enter Amount of Months");
        hourBox=new TextField("Enter amount of hours");
        yearBox=new TextField("Enter amount of Years");
        grid2.add(handiBox, 1, 2);
        grid2.add(motoBox, 2, 2);
        grid2.add(truckBox, 3, 2);
        grid2.add(carBox, 0, 2);
        grid2.add(dayBox,0,4,2,1);
        grid2.add(hourBox,0,3,2,1);
        grid2.add(monthBox,0,5,2,1);
        grid2.add(yearBox,0,6,2,1);
       
        textMain = new TextField("Enter License Plate");
        grid2.add(textMain, 1, 1);
        grid2.add(mainLabel, 0, 4, 4, 4);
        sceneMain = new Scene(grid2, 360, 150);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
