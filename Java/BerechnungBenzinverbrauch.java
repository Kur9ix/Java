import java.util.*;
import java.text.*;

public class BerechnungBenzinverbrauch {
   
    int kilometerstand;
    int lastKilometerstand;
    int tank;
    double kilometer;
    double durchschnitt;

    DecimalFormat formatter = new DecimalFormat("#.##");

    public void eingabe(){
        
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.print("\n\tEingabe:\n");
            System.out.print("\tBitte geben Sie den Kilometerstand beim letzten Tanken ein: ");
            kilometerstand =sc1.nextInt();
            System.out.print("\tBitte geben Sie den aktuellen Kilometerstand ein: ");
            lastKilometerstand =sc1.nextInt();
            System.out.print("\tBitte geben Sie die Menge der getankten Liter Benzin ein: ");
            tank =sc1.nextInt();
        }
    
    }

    public void verarbeitung(){

        kilometer = lastKilometerstand-kilometerstand;
        durchschnitt = tank/kilometer*100;
    
    }

    public void ausgabe(){

        System.out.print("\n\tAuswetung: ");
        System.out.print("\n\tDer durschnittliche Benzinverbrauch beträgt " + formatter.format(durchschnitt)+" Liter\n\tpro gefahrene 100 Kilometer, wenn Sie " +kilometer+ " Kilometer gefahren\n\tsind und " +tank+ " Liter getankt haben.\n");
    
    }

    public static void main(String[]args){

        BerechnungBenzinverbrauch berechnungBenzinverbrauch = new BerechnungBenzinverbrauch();
        System.out.print("\n\t****************************************************************\n");
        System.out.print("\t\t\t Berechnung Benzinverbrauch");
        System.out.print("\n\t****************************************************************\n");

        berechnungBenzinverbrauch.eingabe();
        berechnungBenzinverbrauch.verarbeitung();
        berechnungBenzinverbrauch.ausgabe();
        
    }




}
