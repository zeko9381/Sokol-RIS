package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * @pdOid 73a051ab-fe74-4e00-a911-11c4be2e0c64
 */
public class ZmPoveljnikAktivirajClane {

    private static ObservableList clani;
    /**
     * @pdRoleInfo migr=no name=KAktivirajClane assc=association5 mult=1..1
     */
    public KAktivirajClane KAktivirajClane = new KAktivirajClane();

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
    private Button btnCin;
    @FXML
    private Button btnSpec;
    @FXML
    private Label naslov;
    private final Poveljnik poveljnik = new Poveljnik("Peter", "Kostrevc", "Poveljnik", "");

    @FXML
    public void initialize() {
        prijava();
        naslov.setText("Aktivacija članov za intervencijo " + KAktivirajClane.intervencija.getSifra());
    }

    /**
     * @pdOid a1425f07-b7dd-447f-a053-e262af458ed4
     */
    public void aktivirajClana() {
        ObservableList<Clan> izbraniClani = tabela.getSelectionModel().getSelectedItems();

        for (int i = 0; i < izbraniClani.size(); i++) {
            Clan tmp = izbraniClani.get(i);
            KAktivirajClane.aktivirajClana(tmp);
        }

        ObservableList<Clan> vsiClani = FXCollections.observableArrayList(tabela.getItems());
        tabela.getItems().clear();
        tabela.setItems(vsiClani);

    }


    /**
     * @pdOid 12a9300f-41fd-477d-af94-fb7422b10ebd
     */
    public void aktivirajVseClane() {
        ObservableList<Clan> izbraniClani = tabela.getItems();
        KAktivirajClane.aktivirajVseClane(izbraniClani);
        ObservableList<Clan> vsiClani = FXCollections.observableArrayList(tabela.getItems());
        tabela.getItems().clear();
        tabela.setItems(vsiClani);
    }

    /**
     * @pdOid 26077db6-b119-4784-a186-8f00ed21476c
     */
    public void prikaziSeznamClanov() {
        tabelaIme.setCellValueFactory(
                new PropertyValueFactory<Clan, String>("ime")
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
        tabela.setVisible(true);

        tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    /**
     * @pdOid 44d1c2a0-4217-4f03-873a-152db3ee1e77
     */
    public void prikaziSpecClana() {
        tabelaSpec.setVisible(!tabelaSpec.isVisible());
        if (tabelaSpec.isVisible()) {
            btnSpec.setText("Skrij specijalizacije članov");
        } else {
            btnSpec.setText("Prikaži specijalizacije članov");
        }
    }

    /**
     * @pdOid 52b8fcf7-a18e-4347-93e5-16ed23cce085
     */
    public void prikaziCinClana() {
        tabelaCin.setVisible(!tabelaCin.isVisible());
        if (tabelaCin.isVisible()) {
            btnCin.setText("Skrij čine članov");
        } else {
            btnCin.setText("Prikaži čine članov");
        }
    }

    /**
     * @pdOid c3d0d40b-b94a-44b8-a958-b6e44d70f67b
     */
    public void prijava() {
        if (KAktivirajClane.preveriPravice(poveljnik)) {
            clani = KAktivirajClane.vrniSeznamProstihClanov();
            prikaziSeznamClanov();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Napaka");
            alert.setHeaderText(null);
            alert.setContentText("Nimate pravic za dostop do te funkcije");
            alert.showAndWait();
            exitApp();
        }
    }

    public void exitApp() {
        System.exit(0);
    }

    public void about() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle("O programu");

        Label message = new Label("Sokol\n\nVerzija: 1.1\nAvtorja:\n - Jan Zajc (63210367)\n - Blaž Celin (63200069)");
        message.setFont(Font.font(16));
        VBox content = new VBox(message);
        dialog.getDialogPane().setContent(content);

        ButtonType okButton = new ButtonType("Zapri", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(okButton);

        dialog.showAndWait();
    }
}