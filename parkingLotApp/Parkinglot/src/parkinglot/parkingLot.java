/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dan
 */
public class parkingLot extends Application {

    @Override
    public void start(Stage primaryStage) {
   Vehicle vehicle;
        GridPane grid = new GridPane();
        Label addVehicles = new Label("Enter the amount of parking spaces for:");
        grid.add(addVehicles, 0, 0);

        Label carSpots = new Label("Cars");
        grid.add(carSpots, 0, 1);
        TextField carTextField = new TextField();
        grid.add(carTextField, 1, 1);

        Label truckSpots = new Label("Trucks");
        grid.add(truckSpots, 0, 2);
        TextField truckTextField = new TextField();
        grid.add(truckTextField, 1, 2);
        Label motoSpots = new Label("Motorcycles");
        grid.add(motoSpots, 0, 3);
        TextField motoTextField = new TextField();
        grid.add(motoTextField, 1, 3);
        Label handiSpots = new Label("Handicapped Cars");
        grid.add(handiSpots, 0, 4);
        TextField handiTextField = new TextField();
        grid.add(handiTextField, 1, 4);
        Button button = new Button("Confirm");
        grid.add(button, 1, 5);
       // button.setOnAction(new EventHandler<ActionEvent>() {
          // public void handle(ActionEvent event) {
           //   vehicle.carSpots = truckTextField.getText();

           // }
        //});
        Scene scene = new Scene(grid, 375, 150);
        primaryStage.setTitle("Parking Lot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
