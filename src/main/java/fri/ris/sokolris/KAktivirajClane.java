package fri.ris.sokolris;

import java.util.*;

/** @pdOid 89d19efa-a3bf-48fc-864c-05ef4693a09e */
public class KAktivirajClane {
   /** @pdRoleInfo migr=no name=SvObvescevalniSistemDrustva assc=association1 mult=0..1 */
   public SvObvescevalniSistemDrustva svObvescevalniSistemDrustva;
   
   /** @pdOid 9e83e1b3-ac90-4d85-89d2-2dc25c94ab5d */
   public ArrayList vrniSeznamProstihClanov() {
      // TODO: implement
      return null;
   }
   
   /** @param id
    * @pdOid e0daa1b2-0a7b-4261-9d0e-cb5e02849438 */
   public void aktivirajClana(Clan clan) {
      clan.nastaviStanje("Aktiviran");
   }
   
   /** @pdOid 158e715b-da28-42b5-ae0d-7b371e6006fd */
   public void aktivirajVseClane() {
      for (int i = 0; i < BazaClanov_SIM.clani.size(); i++) {
         aktivirajClana(BazaClanov_SIM.clani.get(i));
      }
   }
   
   /** @pdOid 51cd1d24-34f7-4261-b037-cb91021a5a41 */
   public String vrniStanjeClana(Clan clan) {
      return clan.vrniStanje();
   }
   
   /** @pdOid 52327d8c-56ea-43b6-ad9d-648b98bd15f4 */
   public String vrniSpecClana(Clan clan) {
      return clan.vrniSpec();
   }
   
   /** @pdOid fec3e8cf-d29e-4131-bbdf-c0e89565a022 */
   public String vrniCinClana(Clan clan) {
      return clan.vrniCin();
   }
   
   /** @pdOid cac07b91-b373-4c5d-b37e-f4f2ae5ea248 */
   public void prekliciIntervencijo() {
      // TODO: implement
   }
   
   /** @pdOid dea62df8-2a00-4924-a849-040df5dea10a */
   public boolean preveriPravice() {
      // TODO: implement
      return false;
   }

}