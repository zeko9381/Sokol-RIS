package fri.ris.sokolris;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class BazaClanov_SIM {
    public ObservableList<Clan> fixedClani = FXCollections.observableArrayList(
            new Clan("Tina", "Vidmar", "Gasilec", "Policist"),
            new Clan("Tina", "Zalar", "Gasilski inženir", "Voznik"),
            new Clan("Žiga", "Horvat", "Gasilski tehnik", "Voznik"),
            new Clan("Janez", "Kos", "Gasilski častnik", "Tehnični specialist"),
            new Clan("Janez", "Krajnc", "Gasilski inženir", "Orodjar"),
            new Clan("Luka", "Zupančič", "Gasilski tehnik", "Voznik"),
            new Clan("Matej", "Novak", "Gasilski častnik", "Tehnični specialist"),
            new Clan("Mojca", "Kos", "Gasilski tehnik", "Policist"),
            new Clan("Tina", "Vidmar", "Gasilski inštruktor", "Tehnični specialist"),
            new Clan("Matej", "Jenko", "Gasilski tehnik", "Policist"),
            new Clan("Maja", "Horvat", "Gasilski inštruktor", "Policist"),
            new Clan("Mojca", "Novak", "Gasilski inštruktor", "Voznik"),
            new Clan("Matej", "Jenko", "Gasilski tehnik", "Reševalec"),
            new Clan("Maja", "Zupančič", "Gasilski tehnik", "Voznik"),
            new Clan("Eva", "Zalar", "Gasilski tehnik", "Reševalec"),
            new Clan("Eva", "Zalar", "Gasilski častnik", "Policist"),
            new Clan("Tadej", "Vidmar", "Gasilski inženir", "Reševalec"),
            new Clan("Tina", "Krajnc", "Gasilski tehnik", "Tehnični specialist"),
            new Clan("Mojca", "Vidmar", "Gasilski inženir", "Tehnični specialist"),
            new Clan("Eva", "Novak", "Gasilec", "Voznik"),
            new Clan("Luka", "Jenko", "Gasilec", "Orodjar"),
            new Clan("Mojca", "Božič", "Gasilski tehnik", "Orodjar"),
            new Clan("Eva", "Horvat", "Gasilski častnik", "Voznik"),
            new Clan("Mojca", "Božič", "Gasilski inštruktor", "Orodjar"),
            new Clan("Luka", "Kovačič", "Gasilski inštruktor", "Tehnični specialist"),
            new Clan("Janez", "Jenko", "Gasilski častnik", "Orodjar"),
            new Clan("Eva", "Božič", "Gasilski tehnik", "Voznik"),
            new Clan("Žiga", "Vidmar", "Gasilski častnik", "Policist"),
            new Clan("Tina", "Kos", "Gasilski inštruktor", "Policist"),
            new Clan("Matej", "Zalar", "Gasilski inženir", "Policist")

            );



    public ObservableList<Clan> getClani() {
        return fixedClani;
    }

}
