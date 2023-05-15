package fri.ris.sokolris;

import java.util.*;

/** @pdOid 4b00d500-d03b-401a-a987-87eba0ddbfda */
public class Intervencija {
   /** @pdOid edf4251f-4f3f-41ba-ac17-b9ae15cff780 */
   private final long casAktivacije;
   /** @pdOid f8beed55-9930-4dae-909d-cbf7230850dd */
   private final ArrayList aktiviraniClani;
   private final int sifra;

   public Intervencija() {
      this.casAktivacije = System.currentTimeMillis();
      this.sifra = 1000 + new Random().nextInt(9999 - 1000 + 1);
      this.aktiviraniClani = new ArrayList<>();
   }
   /** @pdOid 9c0d2ebd-a5b3-48a2-9e02-8cbf8acbd4e2 */
   public void dodajClana(Clan clan) {
      aktiviraniClani.add(clan);
   }

   public int getSifra() {return this.sifra;}

}