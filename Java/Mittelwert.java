import java.util.*;

import java.text.*;

public class Mittelwert
{
  static String janein = "j";
  int zahl = 1;
  double zahlen;
  double temp;
  double mittelwert;
  String zwischnespeicher = "\n";
  
  static Scanner sc = new Scanner(System.in);
  DecimalFormat formatter = new DecimalFormat("#.##");
  
  public void titel()
  {
    System.out.print("\n****************************************************");
    System.out.print("\n\t        Mittelwert-Berechnung\n");
    System.out.print("****************************************************\n");
  }
  
  
  public void eingabe()
  {
   
    while(janein.equals("j"))
    {
      System.out.print("Bitte geben Sie die "+ zahl +".Zahl ein: ");
      zahlen =sc.nextInt();
      zwischnespeicher += zahl + ". Zahl: " + zahlen + "\n";
      temp += zahlen;
      System.out.print("Möchten Sie eine weitere Zahl eingeben (j, n)? ");
      janein = sc.next();
      if (janein.equals("n")) {
        verarbeitung();
        ausgabe();
      } while (janein.equals("n"));
      
      zahl++;
    }
   
    
  }
  
  
  public void verarbeitung()
  {
    mittelwert = temp/zahl;
  }
  
  public void ausgabe()
  {
    
    System.out.print("Der Mittelwert von den Zahlen:");
    System.out.print(zwischnespeicher);
    
    System.out.print("beträgt: " + formatter.format(mittelwert));
  }
  
  public static void main(String[] args)
  {
    Mittelwert mw1 = new Mittelwert();
    
    
    mw1.titel(); 
    char wiederholung = 'j';

    do{
        mw1.eingabe();
        mw1.verarbeitung();
        mw1.ausgabe();

        System.out.print("Möchten sie eine neue Berechnung durchführen? (j/n) ? ");
        wiederholung = sc.next().charAt(0);
    }while(wiederholung == 'J' || wiederholung == 'j');
      
  }
  
  
  
  
  
  
}