package com.example.projektwkckfront;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class MyController {

    @FXML
    private Label welcomeText;
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private Pane paneWypozyczenia;


    @FXML
    private void wypozyczeniaButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyApplication.class.getResource("wypożyczenia.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Wypozyczenia");
        stage.setScene(scene);
        paneWypozyczenia = (Pane) root.lookup("#paneWypozyczenia");
        loadTable(paneWypozyczenia);

        stage.show();
    }

    @FXML
    private void powrotButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyApplication.class.getResource("menu.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("MyApp");
        stage.setScene(scene);
        stage.show();

    }
    private void loadTable(Pane pane){
        ObservableList<Wypozyczenia> table1 = FXCollections.observableArrayList(
                new Wypozyczenia(1, 2,30,1,1)
        );



        TableView<Wypozyczenia> tableView = new TableView();
        TableColumn<Wypozyczenia,Integer> firstNameColumn = new TableColumn("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory("id"));
        TableColumn<Wypozyczenia,Integer> secondNameColumn = new TableColumn("Second Name");
        secondNameColumn.setCellValueFactory(new PropertyValueFactory("dataWypozyczenia"));
        TableColumn<Wypozyczenia,Integer> thirdNameColumn = new TableColumn("Third Name");
        thirdNameColumn.setCellValueFactory(new PropertyValueFactory("termin"));
        TableColumn<Wypozyczenia,Integer> fourthNameColumn = new TableColumn("Fourth Name");
        fourthNameColumn.setCellValueFactory(new PropertyValueFactory("idKsiazka"));
        TableColumn<Wypozyczenia,Integer> fifthNameColumn = new TableColumn("Fifth Name");
        fifthNameColumn.setCellValueFactory(new PropertyValueFactory("idCzytelnik"));

        tableView.getColumns().addAll(firstNameColumn,secondNameColumn,thirdNameColumn,fourthNameColumn,fifthNameColumn);

        tableView.setItems(table1);

        pane.getChildren().add(tableView);
    }
}