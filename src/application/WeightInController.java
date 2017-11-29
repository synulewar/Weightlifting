package application;

import competition.model.Contender;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class WeightInController implements Initializable {

    private final ObservableList<Contender> data =
            FXCollections.observableArrayList(
                    new Contender("Krzysztof", "Synowiec", 1991, 85.2, "PL", "Gornik", 115, 135)
            );


    @FXML
    private MenuItem save;

    @FXML
    private void onSaveWeight() {
        for (Contender c: data) {
            System.out.println(c.toString());
        }
    }

    @FXML
    private TableView weightTable;

    @FXML
    private void onAdd() {
        data.add(new Contender());
    }

    @FXML
    private void onDelete() {

        int selectedIndex = weightTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            weightTable.getItems().remove(selectedIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ostrzeżenie!");
            alert.setHeaderText("Nie wybrano zawodnika");
            alert.setContentText("Wybierz zawodnika do usunięcia!");
            alert.showAndWait();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        weightTable.setEditable(true);

        //Add col to table
        TableColumn<Contender, String> firstNameCol = new TableColumn<>("Imię");
        TableColumn<Contender, String> lastNameCol = new TableColumn<>("Nazwisko");
        TableColumn<Contender, Integer> bornYearCol = new TableColumn<>("Rocznik");
        TableColumn<Contender, Double> weightCol = new TableColumn<>("Waga");
        TableColumn<Contender, String> nationalityCol = new TableColumn<>("Kraj");
        TableColumn<Contender, String> clubCol = new TableColumn<>("Klub");
        TableColumn<Contender, Integer> snatchCol = new TableColumn<>("Rwanie");
        TableColumn<Contender, Integer> cleanJerkCol = new TableColumn<>("Podrzut");

        // Join column with data
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));
        bornYearCol.setCellValueFactory(
                new PropertyValueFactory<>("bornYear"));
        weightCol.setCellValueFactory(
                new PropertyValueFactory<>("weight"));
        nationalityCol.setCellValueFactory(
                new PropertyValueFactory<>("nationality"));
        clubCol.setCellValueFactory(
                new PropertyValueFactory<>("club"));
        snatchCol.setCellValueFactory(
                new PropertyValueFactory<>("entrySnatch"));
        cleanJerkCol.setCellValueFactory(
                new PropertyValueFactory<>("entryCleanJerk"));

        // Make data editable

        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setOnEditCommit(
                (CellEditEvent<Contender, String> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setFirstName(t.getNewValue());
                });

        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setOnEditCommit(
                (CellEditEvent<Contender, String> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setLastName(t.getNewValue());
                });

        bornYearCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        bornYearCol.setOnEditCommit(
                (CellEditEvent<Contender, Integer> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setBornYear(t.getNewValue());
                });

        weightCol.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
        weightCol.setOnEditCommit(
                (CellEditEvent<Contender, Double> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setWeight(t.getNewValue());
                });


        nationalityCol.setCellFactory(TextFieldTableCell.forTableColumn());
        nationalityCol.setOnEditCommit(
                (CellEditEvent<Contender, String> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setNationality(t.getNewValue());
                });

        clubCol.setCellFactory(TextFieldTableCell.forTableColumn());
        clubCol.setOnEditCommit(
                (CellEditEvent<Contender, String> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setClub(t.getNewValue());
                });

        snatchCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        snatchCol.setOnEditCommit(
                (CellEditEvent<Contender, Integer> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setEntrySnatch(t.getNewValue());
                });

        cleanJerkCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        cleanJerkCol.setOnEditCommit(
                (CellEditEvent<Contender, Integer> t) -> {
                    ( t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                    ).setEntryCleanJerk(t.getNewValue());
                });

        weightTable.setItems(data);

        weightTable.getColumns().addAll(firstNameCol, lastNameCol, bornYearCol, weightCol, nationalityCol,
                clubCol, snatchCol, cleanJerkCol);

    }
}
