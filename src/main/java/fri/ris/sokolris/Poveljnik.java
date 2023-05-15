package fri.ris.sokolris;

/** @pdOid 6cdcdf73-2e99-407d-989d-46f17619a4c9 */
public class Poveljnik extends Clan {
   /** @pdOid 4ef26458-53a2-4dc6-bd0e-d34bfe730f5d */
   private String ime;
   /** @pdOid 9df2f669-ebd1-4866-8959-74c288c4c132 */
   private String priimek;
   /** @pdOid 562cfeff-f72b-47d1-ac49-3082139abfcf */
   private final String cin;
   /** @pdOid fccbded3-ea2f-4af4-922c-47e1f14b840f */
   private String specializacija;
   /** @pdOid db2e6504-c9d1-4e24-a4fa-0ca08dde321e */
   private String status;

   public Poveljnik(String ime, String priimek, String cin, String specializacija) {
      super(ime, priimek, cin, specializacija);
      this.cin = "Poveljnik";
   }
}