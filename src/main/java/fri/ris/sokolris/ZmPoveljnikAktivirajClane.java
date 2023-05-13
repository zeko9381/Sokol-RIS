package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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

      tabela.setItems(BazaClanov_SIM.clani);

      tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
   }

   /** @pdRoleInfo migr=no name=KAktivirajClane assc=association5 mult=1..1 */
   public KAktivirajClane kAktivirajClane;

   /** @pdOid a1425f07-b7dd-447f-a053-e262af458ed4 */
   public void aktivirajClana() {
      // TODO: implement
   }
   
   /** @pdOid 12a9300f-41fd-477d-af94-fb7422b10ebd */
   public void aktivirajVseClane() {
      // TODO: implement
   }
   
   /** @pdOid 26077db6-b119-4784-a186-8f00ed21476c */
   public void prikaziSeznamClanov() {
      // TODO: implement
   }
   
   /** @pdOid 44d1c2a0-4217-4f03-873a-152db3ee1e77 */
   public void prikaziSpecClana() {
      // TODO: implement
   }
   
   /** @pdOid 52b8fcf7-a18e-4347-93e5-16ed23cce085 */
   public void prikaziCinClana() {
      // TODO: implement
   }
   
   /** @pdOid 804422a6-c310-4baa-a218-7ed09e39583d */
   public void prekliciIntervencijo() {
      // TODO: implement
   }
   
   /** @pdOid c3d0d40b-b94a-44b8-a958-b6e44d70f67b */
   public void prijava() {
      // TODO: implement
   }

}