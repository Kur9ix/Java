import java.util.*;
import java.text.*;

public class AbzahlungsDarlehen {
    

    //Still need work
    int kreditbetrag;
    int zinssatz;
    int kredit_laufzeit;

    int zinsen;
    int tilgung;
    int annuitaet;

    int jahr = 0;
    int temp_tilgung;
    int temp_zinsen;
    int temp_annuitaet;
    int anfangskapital;
    int restkapital;
    
    
    DecimalFormat formatter = new DecimalFormat("#,###.00");

    static Scanner sc = new Scanner(System.in);

    public void title()
    {
        System.out.print("**********************************************************************\n");
        System.out.print("\t\t\tAbzahlungsdarlehen\n");
        System.out.print("**********************************************************************\n");
    }

    public void eingabe()
    {

        

        System.out.print("Bitte geben Sie den Kreditbetrag ein: ");
        kreditbetrag = sc.nextInt();
        System.out.print("Bitte geben SIe den Zinssatz ein: ");
        zinssatz = sc.nextInt();
        System.out.print("Bitte geben Sie die Kreditlaufzeit (in Jahren ) ein: ");
        kredit_laufzeit = sc.nextInt();

    }

    public void verarbeitung()
    {

        System.out.print("\nKreditbetrag: " + formatter.format(kreditbetrag));
        System.out.print("\nZinssatz: " + zinssatz + " %");
        System.out.print("\nLaufzeit: "+ kredit_laufzeit);
        System.out.println(" ");
        System.out.print("\nJahr\t\tAnfangskapital\tZinsen\tTilgung\tAnnuitaet\tRestkapital");

        anfangskapital = kreditbetrag;

        temp_tilgung = anfangskapital/kredit_laufzeit;

        for (int i = 0; i < kredit_laufzeit; i++)
        {   
            jahr++;
            temp_zinsen = (anfangskapital / 100) * zinssatz;
            temp_annuitaet = temp_tilgung + temp_zinsen;
            restkapital = anfangskapital - temp_tilgung;
            System.out.print("\n  " + jahr); System.out.print(" \t\t"+formatter.format(anfangskapital)); System.out.print("\t" + formatter.format(temp_zinsen)); System.out.print("\t" + formatter.format(temp_tilgung)); System.out.print("\t" + formatter.format(temp_annuitaet)); System.out.print("\t" + formatter.format(restkapital));
           
            anfangskapital = anfangskapital - temp_tilgung;
            tilgung = temp_tilgung*kredit_laufzeit;
            annuitaet += temp_annuitaet;
        }
    }

    public void ausgabe()
    {   
        System.out.println(" ");
        System.out.print("\nSumme Zinsen: " + zinsen);
        System.out.print("\nSumme Tilgung: " + tilgung);
        System.out.print("\nSumme Annuitaet: " + annuitaet);

    }

    public static void main(String[] args){

        

        AbzahlungsDarlehen abzahlungsdarlehen = new AbzahlungsDarlehen();

        char repeat = 'J';

            abzahlungsdarlehen.title();

        while(repeat == 'J' || repeat == 'j'){  
            abzahlungsdarlehen.eingabe();
            abzahlungsdarlehen.verarbeitung();
            abzahlungsdarlehen.ausgabe();
        
            System.out.print("\nMöchten Sie eine neue Berechungung durchführen? (J/N) ?");
            repeat = sc.next().charAt(0);

        }

      
        
    }
}
