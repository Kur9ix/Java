import java.util.*;

public class Lottospiel
{
    int[] eingabeZahlen = new int[6];
    int[] randomZahlen = new int[6];

    static Scanner sc = new Scanner(System.in);

    Random random = new Random();
    int richtigeZahlen;
    int kontostand;

    public void eingabe()
    {
        System.out.print("Wie viel Geld möchten sie auf ihr Virtueles Konto einzahlen? ");
        kontostand += sc.nextInt();
        int zahl;
        if(kontostand > 1.5){
            kontostand  -= 1.5;
        for (int i = 0; i < 6; i++) {
            System.out.print( "\nEingabe " + (i+1) + ". Zahl: ");
            zahl = sc.nextInt();
            while(zahl > 49 || zahl < 1){
                System.out.print("Bitte geben sie eien Zahl zwischen 1 und 49!");
                System.out.print( "\nEingabe " + (i+1) + ". Zahl: ");
                zahl = sc.nextInt();
            }
            for(int j = 0; j != (i+1); j++){
               
                if(eingabeZahlen[j] == zahl)
                {
                    System.out.print("Sie haben eine doppelte Zahl eingegeben!");
                    System.out.print( "\nEingabe " + (i+1) + ". Zahl: ");
                    zahl = sc.nextInt();
                }
                
                
            }
            eingabeZahlen[i] = zahl;
        }
        }
        else{
            System.out.print("Sie haben nicht mehr genug Geld auf dem Konto");
        } 
    }
    public void sortierung()
    {
        Arrays.sort(eingabeZahlen);
        for(int i = 0; i < 6; i++)
        {
            System.out.print((i+1) + ". getippte Zahl: "+ eingabeZahlen[i] + "\n");
        }
    }
    public void zufallszahlen()
    {   
        System.out.print("\n");
        System.out.print("gezogene Zahlen\n");
        for (int i = 0; i < eingabeZahlen.length; i++) {
           randomZahlen[i] = random.nextInt(49)+1;
            
        }
        Arrays.sort(randomZahlen);
        for (int i = 0; i < eingabeZahlen.length; i++) {
            System.out.print( (i+1) + ". gezogene Zahl: " + randomZahlen[i] + "\n");
        }
    }
    public void ermittlungZahlen()
    {
        for(int i = 0; i < eingabeZahlen.length; i++) {
            for (int j = 0; j < eingabeZahlen.length; j++) {
                if(eingabeZahlen[i] == randomZahlen[j]){
                    richtigeZahlen++;
                }
            }
        }
    }
    public void ausgabe()
    {
        
        System.out.print("Sie haben " + richtigeZahlen + " richtige Zahlen.\n");
        switch (richtigeZahlen) {
            case 1:
                kontostand += 0;
                System.out.print("Sie haben" + 0 + " gewonnen");
            break;
            case 2: 
                kontostand += 3;
                System.out.print("Sie haben" + 3 + " gewonnen");
            break;
            case 3:
                kontostand += 10; 
                System.out.print("Sie haben" + 10 + " gewonnen");   
            break;
            case 4:
                kontostand += 500;
                System.out.print("Sie haben" + 500 + " gewonnen");
            break;
            case 5:
                kontostand += 10000;
                System.out.print("Sie haben" + 10000 + " gewonnen");
            break;
            case 6:
                kontostand += 1000000;
                System.out.print("Sie haben" + 1000000 + " gewonnen");
            break;
        
            default:
                break;
        }
       
    }

    public static void main(String[] args) {
        Lottospiel lottospiel = new Lottospiel();

        char wiederholung = 'j';

        do{
            lottospiel.eingabe();
            lottospiel.sortierung();
            lottospiel.zufallszahlen();
            lottospiel.ermittlungZahlen();
            lottospiel.ausgabe();

            System.out.print("Möchten sie noch einmal spielen? (J/N) ? ");
            wiederholung = sc.next().charAt(0);
        }while(wiederholung == 'J' || wiederholung == 'j');
    }
}