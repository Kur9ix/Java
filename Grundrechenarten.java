import java.util.*;

public class Grundrechenarten {
    
    int Zahl1;
    int Zahl2;
    int Addition;
    int Subtraktion;
    int Multiplikation;
    int Division;
    int Auswahl;
    int Ergebnis;
    String Auswahlen;
    

    public void eingabe(){
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("\nZahleneingabe: \n");
        System.out.print("------------------------------------------------\n");
        System.out.print("Bitte geben Sie die 1. Zahl ein: ");
        Zahl1 =sc1.nextInt();
        System.out.print("Bitte geben Sie die 2. Zahl ein: ");
        Zahl2 =sc1.nextInt();
        System.out.print("\nAuswahl: \n");
        System.out.print("------------------------------------------------\n");
        System.out.print("Welche Grundrechenart möchten Sie auswählen\n");
        System.out.print("1. Addition\n");
        System.out.print("2. Subtraktion\n");
        System.out.print("3. Multiplikation\n");
        System.out.print("4. Division\n");
        System.out.print("Eingabe Auswahl: ");
        Auswahl =sc1.nextInt();

        sc1.close();
    }
    public void verarbeitung(){
       if(Auswahl == 1){
        Ergebnis = Zahl1 + Zahl2;
        Auswahlen = " + ";
       } 
       if(Auswahl == 2){
        Ergebnis = Zahl1 - Zahl2;
        Auswahlen = " - ";
       }
       if(Auswahl == 3){
        Ergebnis = Zahl1 * Zahl2;
        Auswahlen = " * ";
       }
       if(Auswahl == 4){
        Ergebnis = Zahl1 / Zahl2;
        Auswahlen = " / ";
       }
    }

    public void ausgabe(){
        System.out.print("\nAusgabe Ergebnis:\n");
        System.out.print("------------------------------------------------\n");
        System.out.print(Zahl1 +""+ Auswahlen +""+ Zahl2 +" = "+ Ergebnis+"\n\n");
    }

    public static void main(String[] args) {
        
        Grundrechenarten gr1 = new Grundrechenarten();

        System.out.print("\n*************************************************\n");
        System.out.print("\t\t Grundrechenarten\n");
        System.out.print("*************************************************\n");

        gr1.eingabe();
        gr1.verarbeitung();
        gr1.ausgabe();
    }

}
