package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.*;

/** @pdOid 73a051ab-fe74-4e00-a911-11c4be2e0c64 */
public class ZmPoveljnikAktivirajClane {

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
   public static ObservableList clani = new BazaClanov_SIM().getClani();


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


      TableColumn cin = (TableColumn) tabela.getColumns().get(2);
      TableColumn spec = (TableColumn) tabela.getColumns().get(3);
      TableColumn status = (TableColumn) tabela.getColumns().get(4);
      cin.setVisible(false);
      spec.setVisible(false);
      status.setVisible(true);

      tabela.setItems(clani);

      tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
   }

   /** @pdRoleInfo migr=no name=KAktivirajClane assc=association5 mult=1..1 */
   public KAktivirajClane KAktivirajClane = new KAktivirajClane();

   /** @pdOid a1425f07-b7dd-447f-a053-e262af458ed4 */
   public void aktivirajClana() {
      TextInputDialog dialog = new TextInputDialog();
      dialog.setTitle("Sokol");
      dialog.setHeaderText("Začni intervencijo");
      dialog.setContentText("Oznaka:");

      Optional<String> result = dialog.showAndWait();

      if (result.isPresent()) {
         String name = result.get();
         ObservableList<Clan> izbraniClani = tabela.getSelectionModel().getSelectedItems();

         for (int i = 0; i < izbraniClani.size(); i++) {
            Clan tmp = izbraniClani.get(i);

            if(!tmp.vrniStanje().equals("Na voljo"))
               continue;

            if(name.equals(""))
               KAktivirajClane.aktivirajClana(izbraniClani.get(i));
            else
               KAktivirajClane.aktivirajClana(izbraniClani.get(i), name);

         }

         ObservableList<Clan> aktiviraniClani = FXCollections.observableArrayList(tabela.getItems());
         tabela.getItems().clear();
         tabela.setItems(aktiviraniClani);

      }
   }
   
   /** @pdOid 12a9300f-41fd-477d-af94-fb7422b10ebd */
   public void aktivirajVseClane() {
      ObservableList<Clan> izbraniClani = tabela.getItems();
      KAktivirajClane.aktivirajVseClane(izbraniClani);
      ObservableList<Clan> vsiClani = FXCollections.observableArrayList(tabela.getItems());
      tabela.getItems().clear();
      tabela.setItems(vsiClani);
   }
   
   /** @pdOid 26077db6-b119-4784-a186-8f00ed21476c */
   public void prikaziSeznamClanov() {
      TableColumn cin = (TableColumn) tabela.getColumns().get(2);
      TableColumn spec = (TableColumn) tabela.getColumns().get(3);
      TableColumn status = (TableColumn) tabela.getColumns().get(4);
      cin.setVisible(false);
      spec.setVisible(false);
      status.setVisible(true);

      if (cin.isVisible()) {
         btnCin.setText("Skrij čine članov");
      } else {
         btnCin.setText("Prikaži čine članov");
      }

      if (spec.isVisible()) {
         btnSpec.setText("Skrij specijalizacije članov");
      } else {
         btnSpec.setText("Prikaži specijalizacije članov");
      }

   }
   
   /** @pdOid 44d1c2a0-4217-4f03-873a-152db3ee1e77 */
   public void prikaziSpecClana() {
      TableColumn spec = (TableColumn) tabela.getColumns().get(3);
      spec.setVisible(!spec.isVisible());
      if (spec.isVisible()) {
         btnSpec.setText("Skrij specijalizacije članov");
      } else {
         btnSpec.setText("Prikaži specijalizacije članov");
      }
   }
   
   /** @pdOid 52b8fcf7-a18e-4347-93e5-16ed23cce085 */
   public void prikaziCinClana() {
      TableColumn cin = (TableColumn) tabela.getColumns().get(2);
      cin.setVisible(!cin.isVisible());
      if (cin.isVisible()) {
         btnCin.setText("Skrij čine članov");
      } else {
         btnCin.setText("Prikaži čine članov");
      }
   }
   
   /** @pdOid 804422a6-c310-4baa-a218-7ed09e39583d */
   public void prekliciIntervencijo() {
      // TODO: implement
   }
   
   /** @pdOid c3d0d40b-b94a-44b8-a958-b6e44d70f67b */
   public void prijava() {
      // TODO: implement
   }

   public void exitApp() {
      System.exit(0);
   }

   public void about() {
      Dialog<ButtonType> dialog = new Dialog<>();
      dialog.setTitle("O programu");

      Label message = new Label("Sokol\n\nVerzija: 1.1\nAvtorja: Jan Zajc in Blaž Celin");
      message.setFont(Font.font(20));
      VBox content = new VBox(message);
      dialog.getDialogPane().setContent(content);

      ButtonType okButton = new ButtonType("Zapri", ButtonBar.ButtonData.OK_DONE);
      dialog.getDialogPane().getButtonTypes().add(okButton);

      dialog.showAndWait();
   }
}