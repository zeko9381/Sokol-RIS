package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class BazaClanov_SIM {
    public ObservableList<Clan> fixedClani = FXCollections.observableArrayList(
            new Clan("Tina", "Vidmar", "Gasilec", ""),
            new Clan("Tina", "Zalar", "Višji gasilec", ""),
            new Clan("Žiga", "Horvat", "Gasilec 1. stopnje", "Strojnik"),
            new Clan("Janez", "Kos", "Gasilski častnik", "Tehnični reševalec"),
            new Clan("Janez", "Krajnc", "Nižji gasilski častnik", "Orodjar"),
            new Clan("Luka", "Zupančič", "Gasilec", "Vodja čolna"),
            new Clan("Matej", "Novak", "Gasilec", ""),
            new Clan("Mojca", "Kos", "Gasilec 2. stopnje", ""),
            new Clan("Tina", "Vidmar", "Gasilec", "Uporabnik radijskih postaj"),
            new Clan("Matej", "Jenko", "Višji gasilski častnik", ""),
            new Clan("Maja", "Horvat", "Nižji gasilski častnik 2. stopnje", ""),
            new Clan("Mojca", "Novak", "Gasilski častnik 2. stopnje", "Gašenje notrajnih požarov - modul A"),
            new Clan("Matej", "Jenko", "Gasilec", "Reševalec na vodi"),
            new Clan("Maja", "Zupančič", "Gasilec 2. stopnje", "Reševalec ob nesrečah z nevarnimi snovmi"),
            new Clan("Eva", "Zalar", "Gasilec", ""),
            new Clan("Tadej", "Vidmar", "Gasilec", "Tehnični reševalec"),
            new Clan("Tina", "Krajnc", "Gasilec 1. stopnje", "Uporabnik dihalnega aparata"),
            new Clan("Mojca", "Vidmar", "Gasilec", "Strojnik avtolestve"),
            new Clan("Eva", "Novak", "Gasilec", "Orodjar"),
            new Clan("Luka", "Jenko", "Gasilec", "Orodjar"),
            new Clan("Mojca", "Božič", "Visoki gasilski častnik organizacijske smeri", "Orodjar"),
            new Clan("Eva", "Horvat", "Višji gasilski častnik", "Gašenje notranjih požarov - modul B"),
            new Clan("Mojca", "Božič", "Visoki gasilski častnik", "Orodjar"),
            new Clan("Luka", "Kovačič", "Gasilec", "Skrbnik dihalnih zaščitnih naprav"),
            new Clan("Janez", "Jenko", "Gasilec 1. stopnje", "Orodjar"),
            new Clan("Eva", "Božič", "Višji gasilec", "Strojnik"),
            new Clan("Žiga", "Vidmar", "Višji gasilec 2. stopnje", ""),
            new Clan("Tina", "Kos", "Gasilec", ""),
            new Clan("Matej", "Zalar", "Nižji gasilski častnik", "")
            );



    public ObservableList<Clan> getClani() {
        return fixedClani;
    }

}
