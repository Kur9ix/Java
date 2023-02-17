import java.util.*;

import java.text.*;

public class Mittelwert
{
  static String janein = "j";
  int zahl = 1;
  double zahlen;
  double temp;
  double mittelwert;
  String platzhalter;
  String zwischnespeicher;
  
  
  DecimalFormat formatter = new DecimalFormat("#.##");
  
  public void titel()
  {
    System.out.print("\n****************************************************");
    System.out.print("\n\t        Mittelwert-Berechnung\n");
    System.out.print("****************************************************\n");
  }
  
  
  public void eingabe()
  {
    Scanner sc1 = new Scanner(System.in);
    while(janein.equals("j"))
    {
      System.out.print("Bitte geben Sie die "+ zahl +".Zahl ein: ");
      zahlen =sc1.nextInt();
      //zwischnespeicher = zahlen +"," +zahlen ;
      //System.out.println(zwischnespeicher);
      temp += zahlen;
      System.out.print("Möchten Sie eine weitere Zahl eingeben (j, n)? ");
      janein = sc1.next();
      if (janein.equals("n")) {
        verarbeitung();
        ausgabe();
      } while (janein.equals("n"));
      
      zahl++;
    }
    sc1.close();
    
  }
  
  
  public void verarbeitung()
  {
    mittelwert = temp/zahl;
  }
  
  public void ausgabe()
  {
    
    System.out.print("\nDer Mittelwert von den Zahlen:\n");
    for (int i = 1; i < zahl + 1; i++)
    {
      System.out.print("\n"+i+". Zahl: "+ platzhalter);
    }
    System.out.print("\n\nbeträgt:" + formatter.format(mittelwert)+".\n");
    
  }
  
  public static void main(String[] args)
  {
    Mittelwert mw1 = new Mittelwert();
    char repeat = 'J';
    Scanner sc2 = new Scanner(System.in);
    do
    {
      mw1.titel();  System.out.print("Test");
      mw1.eingabe();   System.out.print("Test");
      mw1.verarbeitung();   System.out.print("Test");
      mw1.ausgabe();    System.out.print("Test");
      System.out.print("\nMöchten Sie eine neue Berechnung durchführen (J/N)? ");
      repeat =sc2.next().charAt(0);
    } while (repeat == 'J');   
    sc2.close();  
  }
  
  
  
  
  
  
}