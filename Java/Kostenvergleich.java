import java.util.*;  
import java.text.*;

public class Kostenvergleich {
  
  double fixum;
  int handlungsreisender;
  double handlungsreisenderumsatz;
  int handelsvertreter;
  double handelsvertreterumsatz;
  int umsatz = 20000;
  int tempumsatz;
  
  DecimalFormat fc1 = new DecimalFormat("###,###.##");
  
  static Scanner sc1 = new Scanner(System.in);
  
  public void titel()
  {
    System.out.print("\n\t***************************************************************************");
    System.out.print("\n\t\t   Kostenvergleich Handelsvertreter/ Handlungsreisender");
    System.out.print("\n\t***************************************************************************");
  }
  
  public void eingabe()
  {
    System.out.print("\n\tFixum des Reisenden eingeben: ");
    fixum = sc1.nextInt();
    System.out.print("\tProvisionssatz des Handlungsreisenden eingeben: ");
    handlungsreisender = sc1.nextInt();
    System.out.print("\tProvisionssatz des Handelsvertreters eingeben: ");
    handelsvertreter = sc1.nextInt();
  }
  
  
  
  public void ausgabe()
  {
    System.out.print("\n\t    Umsatz\t Kosten Handlungsreisender\t Kosten Handelsvertreter");
    System.out.print("\n\t   (in Euro)\t\t(in Euro) \t\t\t(in Euro)\n");
    System.out.print("\t***************************************************************************\n");
    umsatz = 20000;
    tempumsatz = 0;
    
    while (umsatz <= 500000) { 
      
      handlungsreisenderumsatz = fixum  + (umsatz / 100 * handlungsreisender);
      handelsvertreterumsatz = umsatz / 100 *  handelsvertreter;
      
      String reisender = "";
      String vertreter = "";
      
      if (handelsvertreterumsatz < handlungsreisenderumsatz) {
        reisender = "*****";
      }
      else if(handelsvertreterumsatz > handlungsreisenderumsatz)
      {
        vertreter = "*****";
      }
      if(handelsvertreterumsatz == handlungsreisenderumsatz) {
        tempumsatz = umsatz;
      } 
      
      System.out.println("\t "+ fc1.format(umsatz)+"EUR\t\t" + fc1.format(handlungsreisenderumsatz)+ "EUR"+reisender+"\t\t\t" + fc1.format(handelsvertreterumsatz)+"EUR"+vertreter);
      
      umsatz += 40000;        
    } 
    System.out.print("\n\tBei einem Umsatz von " + tempumsatz + " EUR verdienen beide Personen gleich viel");
    
  }
  
  public static void main(String[] args) {
    Kostenvergleich kv = new Kostenvergleich();
    
    char repeat = 'j';
    
    while (repeat == 'j' || repeat == 'J') { 
      kv.titel();
      kv.eingabe();
      kv.ausgabe();
      System.out.print("\n\n\tM�chten Sie eine neue Berechnung druchf�hren (j/n) ?");
      repeat = sc1.next().charAt(0);
      System.out.print("\n");
      
    } 
    
  }
  
  
}
