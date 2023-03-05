import java.text.*;
import java.util.*;

public class Produktionsprogramm {
   
  double verkaufspreis; 
  int anzahl; 
  double fixkosten; 
  double kosten;
  double ertrag;
  double gewinn; 
  String programm; 
  String ausgabe;
  String stern; 
  double varKosten; 
  static Scanner sc = new Scanner(System.in);
  public void eingabe (){
    
    //Scanner sc3 = new Scanner(System.in);
    do {
      System.out.println("Bitte geben Sie den Verkaufspreis an."); 
      verkaufspreis = sc.nextDouble();
       if (verkaufspreis <50 ){
                System.out.println("Bei dem Preis bekommen die Rentiere kein Essen");
        }
        else if (verkaufspreis >100){
                 System.out.println("�bertreiben m�ssen wir es aber auch nicht");
        } // end of if-else
      

    } while (verkaufspreis <50 || verkaufspreis >100); // end of do-while
     
   
     System.out.println("\n Welches Produktionsprogramm wollen Sie w�hlen: ");
     System.out.println("Engel \t\t f�r Fixkosten = 22.000 � und variable Kosten = 48�");
     System.out.println("Wichtel \t f�r Fixkosten = 25.000 � und variable Kosten = 43� ");
     System.out.println("Rentier \t f�r Fixkosten = 17.000 � und variable Kosten = 55� \n");
     
     programm  = sc.next(); 
     
    
  
     
  
  }

  public void verarbeitung(){
   
    DecimalFormat df = new DecimalFormat("##,##0.00 EUR");  
    ausgabe = ""; 
    anzahl = 500;
     
    if (programm.equalsIgnoreCase("Engel") ){
      fixkosten = 22000.00; 
      
      varKosten = 48.00;
      
    }
    else if (programm.equals("Wichtel")){
      fixkosten = 25000.00; 
      
      varKosten = 43.00; 
    }
    else if (programm.equalsIgnoreCase("Rentier")) {
      fixkosten = 21700.00; 
      
    
      varKosten =55.00;
    } // end of if-else
   
      
  
 
    do{
          if (anzahl   >= 2000 ) {
            fixkosten  = fixkosten * 0.95; 
          }
    
        kosten = fixkosten + varKosten * anzahl; 
        ertrag = verkaufspreis * anzahl; 
        gewinn = ertrag - kosten; 
          if (gewinn <0){
            stern = "****"  ;
          }
          else {
            stern = "  " ;
          } // end of if-else
        ausgabe = ausgabe + anzahl + "\t" + df.format(kosten) + "\t" + df.format(ertrag) + "\t" + df.format(gewinn) + stern +  "\n"; 
          
          anzahl = anzahl + 500;
     } while (anzahl <=5000); 
     }  
       
     public void ausgabe(){
     System.out.println("Anlage: " + programm);
      System.out.println("\n\nAnzahl\t Kosten \t  Ertrag \t Gewinn " );

      System.out.println(ausgabe ); 
     }

  public static void main (String [] args) {
    Produktionsprogramm pp = new Produktionsprogramm();
    char wahl; 
    System.out.print("\n\n");
    System.out.println("\t*****************************************************");
    System.out.print("\t\t\tProduktionsprogramm\n");
    System.out.println("\t*****************************************************");
    
    do {
      
    
    pp.eingabe();
    pp.verarbeitung();
    pp.ausgabe();
    System.out.print("\n\tMoechten Sie eine neue Berechnung durchfuehren(J/N)? " );
    wahl = sc.next().charAt(0); 
    } while (wahl == 'j' || wahl == 'J'); // end of do-while
    
  }
  }