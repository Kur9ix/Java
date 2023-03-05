import java.util.*;

public class Quartalumsätze{
        
    int[] [] filialen;
    int[] quartalsumme = new int[4];
    int[] summe;
    static Scanner sc = new Scanner(System.in);
    int filialenAnzahl;

    public void eingabe()
    {
        System.out.print("Bitte geben Sie die Anzahl der Filialen ein: ");
        filialenAnzahl = sc.nextInt();
       
        filialen = new int[filialenAnzahl] [4];
        summe = new int[filialenAnzahl+1];
       
        for (int i = 0; i < filialenAnzahl; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Umstaz für Filiale " + (i+1) + " (Quartal " + (j+1) + "):");
                filialen[i][j] = sc.nextInt();
            }
        }
    }

    public void verarbeitung(){
        
       
        for (int i = 0; i != 4; i++) {
            quartalsumme[i] = 0;
            for (int j = 0; j < filialenAnzahl; j++) {
                quartalsumme[i] += filialen[j][i];
                
            }
        }
        
    }

    public void ausgabe(){
        
        System.out.print("\n ");
        System.out.print("\n ");
        System.out.print("\n ");
        System.out.print("\t   1. Quartal\t 2. Quartal\t 3. Quartal\t 4. Quartal\t Summer");
        System.out.print("\n\t ------------------------------------------------------------------------------");
        for (int i = 0; i != filialenAnzahl; i++) {
            for (int j = 0; j != 4; j++) {
                summe[i] += filialen[i][j];
                
            }
            
            System.out.println("\nFiliale " + (i+1) + " \t" + filialen[i][0] + " \t\t" + filialen[i][1]+ " \t\t" + filialen[i][2]+ " \t\t"+ filialen[i][3]+ " \t\t" + summe[i]);
        }
        System.out.print("\n\t ------------------------------------------------------------------------------");
        summe[filialenAnzahl] = quartalsumme[0] + quartalsumme[1] + quartalsumme[2] + quartalsumme[3];
        System.out.print("\nSumme  " +  "\t\t" +quartalsumme[0] + "\t\t" +quartalsumme[1] + "\t\t" +quartalsumme[2] +"\t\t" + quartalsumme[3] + "\t\t" + summe[filialenAnzahl]);
        System.out.print("\n\t ==============================================================================");
    }
    public static void main(String[] args) {
        Quartalumsätze quartalumsätze = new Quartalumsätze();
        char wiederholung = 'j';

        do{
            quartalumsätze.eingabe();
            quartalumsätze.verarbeitung();
            quartalumsätze.ausgabe();
            System.out.print("\nMöchten Sie die Eingaben wiederholen? (J/N) ? ");
            wiederholung = sc.next().charAt(0);
        }while(wiederholung == 'J' || wiederholung == 'J');
    }
}