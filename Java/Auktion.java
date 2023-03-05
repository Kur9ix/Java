import java.text.DecimalFormat;
import java.util.*;

public class Auktion
{
    int[] gebote = new int[3];
    String[] namen = new String[3];

    int bieter;
    int maxwert = Integer.MIN_VALUE;
    int minwert = Integer.MAX_VALUE;
    int minName;
    int maxName;

    String object;

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("##.##");

    public void Eingabe()
    {
        String schleife = "j";
        System.out.print("Was für ein Object soll versteigert werden: ");
        object = sc.next();

        for(int i = 0; schleife.equalsIgnoreCase("j");i++)
        {
            System.out.print("\nName des "+ (i+1) +". Interessenten: ");
            namen[i] = sc.next();
            System.out.print("\nWie viel EUR bietet " + namen[i] + " für das " + object + ":");
            gebote[i] = sc.nextInt();
            bieter++;
            if(i != 2){
                System.out.print("Möchten Sie noch einen Interessenten eingeben (J/N) ");
                schleife = sc.next();
            }else{
                System.out.print("Hinweis: Es können keine\n");
                schleife = "N";
            }

            
        }
    }

    public void Verarbeitung()
    {
        
        for(int i = 0; i < bieter; i++){
            if(gebote[i] > maxwert) {
                maxwert = gebote[i];
                maxName = i;
            }
            if(gebote[i] < minwert){
                minwert = gebote[i];
                minName = i;
            }
            
        }
        
    }

    public void Ausgabe()
    {
        System.out.print( namen[maxName] + " hat mit " + df.format(maxwert) + "EUR das höchste Gebot getätigt.\n");
        System.out.print( namen[minName] + " hat mit " + df.format(minwert) + "EUR das niedrigste Gebot getätigt.\n");

        System.out.print("Herzlichen Glückwunsch " + namen[maxName] + " zum  Kauf des/der " + object + "!" );
    }

    public static void main(String[] args) {
        Auktion auktion = new Auktion();

        char wiederholung;

        do{
        auktion.Eingabe();
        auktion.Verarbeitung();
        auktion.Ausgabe();
        System.out.print("\nMöchten Sie die Eingabe wiederholen?(J/N)");
        wiederholung = sc.next().charAt(0);

        }while(wiederholung == 'J' || wiederholung == 'j');
    }
}