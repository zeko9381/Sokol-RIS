package fri.ris.sokolris;

import java.util.*;

/** @pdOid 4b00d500-d03b-401a-a987-87eba0ddbfda */
public class Intervencija {
   /** @pdOid edf4251f-4f3f-41ba-ac17-b9ae15cff780 */
   private long casAktivacije;
   /** @pdOid f8beed55-9930-4dae-909d-cbf7230850dd */
   private ArrayList aktiviraniClani;
   /** @pdOid 119c26f3-2240-46b4-b7e4-79421caeadd0 */
   private int sifra;

   /** @pdOid 490cf866-1265-4289-947c-dc0459bef8ee */
   public Intervencija() {
      this.casAktivacije = System.currentTimeMillis();
      this.sifra = 1000 + new Random().nextInt(9999 - 1000 + 1);
      this.aktiviraniClani = new ArrayList<>();
   }

   /** @pdOid 9c0d2ebd-a5b3-48a2-9e02-8cbf8acbd4e2 */
   public void dodajClana(Clan clan) {
      aktiviraniClani.add(clan);
   }

   /** @pdOid 0e16ba09-c54a-418d-98c0-5116a69f8a0c */
   public int vrniSifro() {return this.sifra;}

}