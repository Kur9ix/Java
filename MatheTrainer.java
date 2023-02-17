import java.util.*;

public class MatheTrainer
{

    int[] zahlen;
    int rechenart;
    int eingabeErgebnis;
    int ergebnis;

    Random random = new Random();

    static Scanner sc = new Scanner(System.in);
    public void eingabe()
    {   
        int anzahl;
        System.out.print("Welche Grundrechenart wollen sie trainieren? \n");
        System.out.print("(1: Addition, 2: Multiplikation): ");
        rechenart = sc.nextInt();
        System.out.print("Mit wie vielen Zahlen möchten sie Rechnen? ");
        anzahl = sc.nextInt();
        zahlen = new int[anzahl];
    }   
    public void ziehungZufallsZahlenBerechneLoesung()
    {
        if(rechenart == 1){
            System.out.print("Addiren sie die folgenden Zahlen: \n" );
        }
        else{
            System.out.print("Multiplizieren sie die folgenden Zahlen: \n");
        }
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(100) + 1;
            System.out.print("\nZahl " + (i+1) + ": " + zahlen[i]);
          
        }
        System.out.print("\n ");
        System.out.print("\nEingabe Ergebnis: ");
        eingabeErgebnis = sc.nextInt();
    }
    public void ausgabe(){
        String rechnezeichen;
        System.out.print("\nAuswertung: ");
        if(eingabeErgebnis == ergebnis){
            System.out.print("\nGratulatuin sie haben richtig gerechnet");
        }else{
            System.out.print("\nSie haben sich verrechnet!\n");
            if(rechenart == 1){
                rechnezeichen = " + ";
                for (int i = 0; i < zahlen.length; i++) {
                    if(i == (zahlen.length -1)){
                        rechnezeichen = " = ";
                    }
                    System.out.print(zahlen[i] + rechnezeichen );
                    ergebnis += zahlen[i];
                   
                }
            }
            if(rechenart == 2){
                rechnezeichen = " * ";
                ergebnis = 1;
                for (int i = 0; i < zahlen.length; i++) {
                    if(i == (zahlen.length -1)){
                        rechnezeichen = " = ";
                    }
                    System.out.print(zahlen[i] + rechnezeichen );
                    ergebnis *= zahlen[i];
                }
            }
            System.out.print(ergebnis + " und nicht " + eingabeErgebnis + "!");
        }
    }

    public static void main(String[] args) {
        MatheTrainer  matheTrainer = new MatheTrainer();

        matheTrainer.eingabe();
        matheTrainer.ziehungZufallsZahlenBerechneLoesung();
        matheTrainer.ausgabe();
    }
}