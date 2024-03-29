package fri.ris.sokolris;

import javafx.collections.ObservableList;

/**
 * @pdOid 89d19efa-a3bf-48fc-864c-05ef4693a09e
 */
public class KAktivirajClane {
    /** @pdRoleInfo migr=no name=SvObvescevalniSistemDrustva assc=association1 mult=0..1 */
    public SvObvescevalniSistemDrustva svObvescevalniSistemDrustva = new SvObvescevalniSistemDrustva();

    /** @pdRoleInfo migr=no name=Intervencija assc=association7 mult=0..1 */
    public Intervencija intervencija = new Intervencija();

    /**
     * @pdOid 9e83e1b3-ac90-4d85-89d2-2dc25c94ab5d
     */
    public ObservableList<Clan> vrniSeznamProstihClanov() {
        ObservableList<Clan> prostiClani = new BazaClanov_SIM().getClani();
        int size = prostiClani.size();

        // Odstrani člane, ki niso na voljo
        for (int i = 0; i < size; i++) {
            if (!prostiClani.get(i).vrniStanje().equals("Na voljo"))
                prostiClani.remove(i);
        }

        return prostiClani;
    }

    /**
     * @pdOid e0daa1b2-0a7b-4261-9d0e-cb5e02849438
     */
    public void aktivirajClana(Clan clan) {
        clan.nastaviStanje("Aktiviran (" + intervencija.vrniSifro() + ")");
        intervencija.dodajClana(clan);
        svObvescevalniSistemDrustva.posljiObvestilo(clan);
    }


    /**
     * @pdOid 158e715b-da28-42b5-ae0d-7b371e6006fd
     */
    public void aktivirajVseClane(ObservableList clani) {
        for (int i = 0; i < clani.size(); i++) {
            Clan tmp = (Clan) clani.get(i);
            tmp.nastaviStanje("Aktiviran (" + intervencija.vrniSifro() + ")");
            intervencija.dodajClana(tmp);
            svObvescevalniSistemDrustva.posljiObvestilo(tmp);
        }
    }

    /**
     * @pdOid 52327d8c-56ea-43b6-ad9d-648b98bd15f4
     */
    public String vrniSpecClana(Clan clan) {
        return clan.vrniSpec();
    }

    /**
     * @pdOid fec3e8cf-d29e-4131-bbdf-c0e89565a022
     */
    public String vrniCinClana(Clan clan) {
        return clan.vrniCin();
    }

    /**
     * @pdOid dea62df8-2a00-4924-a849-040df5dea10a
     */
    public boolean preveriPravice(Clan clan) {
        return clan.getCin().equals("Poveljnik");
    }

}