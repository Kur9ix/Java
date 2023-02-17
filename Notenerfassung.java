import java.util.*;

public class Notenerfassung{

    static Scanner sc = new Scanner(System.in);

    String fächer[] = {"Deutsch", "Englisch" , "Geschichte"};
    String notenTypen[] = {"1. Klausur" , "2. Klausur", "schriftliche Note", "mündliche Noten", "Zeugnisnote"};
    int noten[] [] = new int[3] [3];
    int finalnote[] [] = new int[2] [3];
    String schülername;

    public void eingabe()
    {
        System.out.print("Schülername : ");
        schülername = sc.next();

        for (int i = 0; i < fächer.length; i++) {
            System.out.print("Fach: " + fächer[i]);
            for (int j = 0; j < fächer.length; j++) {
               System.out.print("Note: " + notenTypen[0]);
              
            }
        }
        
    }
    public void verarbeitung()
    {
        
    }
    public void ausgabe(){

    }
    public static void main(String[] args) 
    {
        Notenerfassung notenerfassung = new Notenerfassung();

        char wiederholung = 'j';

        do{
            notenerfassung.eingabe();
            notenerfassung.verarbeitung();
            notenerfassung.ausgabe();
            System.out.print("Möchten Sie das Programm wiederholen? (J/N) : ");
            wiederholung = sc.next().charAt(0);

        }while(wiederholung == 'J' || wiederholung == 'j');
    }
}