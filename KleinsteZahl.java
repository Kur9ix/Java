import java.util.*;


public class KleinsteZahl{
  
  int Zahl1;
  int Zahl2;
  int Zahl3;
  int KleinsteZahl;
  String Zahlname;

  public void eingabe(){
    
    Scanner sc1 = new Scanner(System.in);
    System.out.print("\n\tEingabe: \n");
    System.out.print("\tBitte geben Sie die 1. Zahl ein: ");
    Zahl1 =sc1.nextInt();
    System.out.print("\tBitte geben Sie die 2. Zahl ein: ");
    Zahl2 =sc1.nextInt();
    System.out.print("\tBitte geben Sie die 3. Zahl ein: ");
    Zahl3 =sc1.nextInt();
    sc1.close();

  }

  public void verarbeitung(){

    if (Zahl1 < Zahl2) {
        KleinsteZahl = Zahl1;
        Zahlname = "Zahl1";
    } else{
        KleinsteZahl = Zahl2;
        Zahlname = "Zahl2";
    }
    if (KleinsteZahl < Zahl3) {
        
    }else{
        KleinsteZahl = Zahl3;
        Zahlname = "Zahl3";
    }
    
  }
  
  public void ausgabe(){

        System.out.print("\n\tDie Kleinste Zahl von den Zahlen: " );
        System.out.print("\n\tZahl 1: " + Zahl1);
        System.out.print("\n\tZahl 2: " + Zahl2);
        System.out.print("\n\tZahl 3: " + Zahl3);
        System.out.print("\n\tist die "+ Zahlname+ ": " + KleinsteZahl +".");

  }
  
  public static void main(String[] args) {
    
    KleinsteZahl kz1 = new KleinsteZahl();

    System.out.print("\n\t***************************************");
    System.out.print("\n\t\tKleinste von drei Zahlen");
    System.out.print("\n\t***************************************");

    kz1.eingabe();
    kz1.verarbeitung();
    kz1.ausgabe();

  }
  
  
}
