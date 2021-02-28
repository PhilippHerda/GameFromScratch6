import java.util.ArrayList;
public class Raum
{
 private ArrayList<Figur> inhalte;
 public Raum()
 {
     inhalte = new ArrayList<Figur>();
     Quadrat wand = new Quadrat();
     wand.sichtbarMachen();
 }   
}