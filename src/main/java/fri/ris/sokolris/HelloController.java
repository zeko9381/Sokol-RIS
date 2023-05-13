package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    private ObservableList<Clan> clani = FXCollections.observableArrayList(
            new Clan("Janez", "Novak", "Gasilec", "Orodjar"),
            new Clan("Jože", "Gorišek", "Gasilski častnik", "")
    );

    // Definicija vsega za TableView
    @FXML
    private TableView tabela;
    @FXML
    private TableColumn tabelaIme;
    @FXML
    private TableColumn tabelaPriimek;
    @FXML
    private TableColumn tabelaCin;
    @FXML
    private TableColumn tabelaSpec;
    @FXML
    private TableColumn tabelaStanje;


    @FXML
    public void initialize() {
        tabelaIme.setCellValueFactory(
                new PropertyValueFactory<Clan,String>("ime")
        );
        tabelaPriimek.setCellValueFactory(
                new PropertyValueFactory<Clan, String>("priimek")
        );
        tabelaCin.setCellValueFactory(
                new PropertyValueFactory<Clan, String>("cin")
        );
        tabelaSpec.setCellValueFactory(
                new PropertyValueFactory<Clan, String>("specializacija")
        );
        tabelaStanje.setCellValueFactory(
                new PropertyValueFactory<Clan, String>("status")
        );

        tabela.setItems(clani);

        tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}