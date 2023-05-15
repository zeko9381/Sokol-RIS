package fri.ris.sokolris;

import java.util.*;

/** @pdOid 4b00d500-d03b-401a-a987-87eba0ddbfda */
public class Intervencija {
   /** @pdOid edf4251f-4f3f-41ba-ac17-b9ae15cff780 */
   private long casAktivacije;
   /** @pdOid f1152f42-79a0-4f5e-b2a8-88bd23eb06f2 */
   private String lokacija;
   /** @pdOid f8beed55-9930-4dae-909d-cbf7230850dd */
   private ArrayList aktiviraniClani;
   /** @pdOid e0c668cf-7b53-4dae-9b80-ac2120e57626 */
   private String tip;

   public Intervencija(String lokacija) {
      this.casAktivacije = System.currentTimeMillis();
      this.lokacija = lokacija;
      this.aktiviraniClani = new ArrayList<>();
   }
   /** @pdOid 9c0d2ebd-a5b3-48a2-9e02-8cbf8acbd4e2 */
   public void dodajClana(Clan clan) {
      aktiviraniClani.add(clan);
   }

}