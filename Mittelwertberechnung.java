import java.util.*;

import java.text.*;

public class Mittelwertberechnung
{
  static String janein = "j";
  static Scanner sc1 = new Scanner(System.in);
  static String repeat;
  int zahl = 0;

  double zahlen;
  double temp;
  double mittelwert;
  String zwischnespeicher;
  List<Double> zahlList = new ArrayList<>();
  
  
  DecimalFormat formatter = new DecimalFormat("#.##");
  
  public void titel()
  {
    System.out.print("\n****************************************************");
    System.out.print("\n\t        Mittelwert-Berechnung\n");
    System.out.print("****************************************************\n");
  }
  
  
  public void eingabe()
  {
    while(janein.equals("j") || janein.equals("J"))
    {
      zahl++;
      System.out.print("Bitte geben Sie die "+ zahl +".Zahl ein: ");
      double zahlen =sc1.nextDouble();
      zahlList.add(zahlen);
      
      temp += zahlen;
      System.out.print("Möchten Sie eine weitere Zahl eingeben (j, n)? ");
      janein = sc1.next();
      if (janein.equals("n") || janein.equals("N")) {
        verarbeitung();
        ausgabe();
      } while (janein.equals("n") || janein.equals("N"));
      
      
    }
    
    
  }
  
  
  public void verarbeitung()
  {
    mittelwert = 0;
    mittelwert = temp/zahl;
  }
  
  public void ausgabe()
  {
    
    System.out.print("\nDer Mittelwert von den Zahlen:\n");
    for (int i = 0; i < zahl; i++ )
    {
      System.out.println(i + 1 + ". Zahl: " + zahlList.get(i));
    }
    System.out.print("\n\nbeträgt:" + formatter.format(mittelwert)+".\n");
    System.out.print("\nMöchten Sie eine neue Berechnung durchführen (J/N)? ");
    repeat =sc1.next();
    if (repeat.equals("J") || repeat.equals("j")) {
      zahl = 0;
      zahlList.clear();
      janein = "j";
      eingabe();
      verarbeitung();
      ausgabe();
    } while (repeat.equals("J") || repeat.equals("j"));
    
    
  }
  
  public static void main(String[] args)
  {
    Mittelwertberechnung mw1 = new Mittelwertberechnung();
    mw1.titel(); 
    mw1.eingabe();
    mw1.verarbeitung();
    mw1.ausgabe();
   
  }
  
}