package fri.ris.sokolris;

import javafx.beans.property.SimpleStringProperty;

/** @pdOid 82ec14aa-4e88-4b0b-b170-c89fd52451a3 */
public class Clan {
   /** @pdOid b0ffc136-6a0e-437f-9cdd-e51241d54f09 */
   private final SimpleStringProperty ime;
   /** @pdOid debbcc56-c39d-4753-8c77-45a4d36c0f7f */
   private final SimpleStringProperty priimek;
   /** @pdOid ceea4c40-592f-4adc-a0a4-af863ad95f22 */
   private final SimpleStringProperty cin;
   /** @pdOid 85989417-569f-4eac-849c-3fd6fd9c9349 */
   private final SimpleStringProperty specializacija;
   /** @pdOid f3250509-6aaf-47c9-957a-3bb5e6d0830c */
   private SimpleStringProperty status;

   /** @pdOid 8a823018-2bb0-4dc3-989f-030ac638e334 */
   public Clan(String ime, String priimek, String cin, String specializacija) {
      this.ime = new SimpleStringProperty(ime);
      this.priimek = new SimpleStringProperty(priimek);
      this.cin = new SimpleStringProperty(cin);
      this.specializacija = new SimpleStringProperty(specializacija);
      this.status = new SimpleStringProperty("Na voljo");
   }

   public String getIme() {
      return ime.get();
   }

   public SimpleStringProperty imeProperty() {
      return ime;
   }

   public String getPriimek() {
      return priimek.get();
   }

   public SimpleStringProperty priimekProperty() {
      return priimek;
   }

   public String getCin() {
      return cin.get();
   }

   public SimpleStringProperty cinProperty() {
      return cin;
   }

   public String getSpecializacija() {
      return specializacija.get();
   }

   public SimpleStringProperty specializacijaProperty() {
      return specializacija;
   }

   public String getStatus() {
      return status.get();
   }

   public SimpleStringProperty statusProperty() {
      return status;
   }
   
   /** @pdOid 018172de-ab3d-4981-b3bd-a3e86f1cd54a */
   public String vrniCin() {
      return getCin();
   }
   
   /** @pdOid 95a4b8a0-a8bf-4f3d-a1fe-883226365ba9 */
   public String vrniStanje() {
      return getStatus();
   }
   
   /** @pdOid 610cda3b-4ace-4c7a-a18c-f385145076e8 */
   public String vrniSpec() {
      return specializacija.get();
   }
   
   /** @pdOid f559708a-b620-4db1-b7dd-dbfbbb6104ac */
   public void nastaviStanje(String tmp) {
      this.status = new SimpleStringProperty(tmp);
   }

}