import java.util.Scanner;
import java.util.ArrayList;
public class Benutzerschnittstelle
{
    private Leinwand dieseLeinwand;
    private Scanner scanner;
    ArrayList<Raum> raumListe;
    /**
     * Constructor for objects of class Benutzerschnittstelle
     */
    public Benutzerschnittstelle()
    {
        dieseLeinwand = Leinwand.gibLeinwand();
        scanner = new Scanner(System.in);
        raumListe = new ArrayList<Raum>();
        Raum anfangsRaum = new Raum();
        raumListe.add(anfangsRaum);
        starten();
    }

    public void starten()
    {
        boolean fertig = false;
        while (!fertig)
        {
            String userInput = scanner.nextLine();
            if (userInput.toLowerCase().equals("ade"))
            {
                fertig = true;
            }
        }
    }

    public static void main(String[] args)
    {
        Benutzerschnittstelle diesesSpiel = new Benutzerschnittstelle();

    }
}
