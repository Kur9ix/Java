import java.util.*;
import java.text.*;

public class Sparplan {
    
    String repeat;
    double kapital;
    double tempkapital;
    double zinssatz;
    int anlagedauer;
    double zinsen;
    double tempendkapital;
    double endkapital;
    double temp;

    List<Double> zahlList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    DecimalFormat dc1 = new DecimalFormat("#.##");

    public void titel()
    {
        System.out.print("*************************************************\n");
        System.out.print("\t\t Sparplan\n");
        System.out.print("*************************************************\n");
    }

    public void eingabe()
    {
        System.out.print("Bitte geben Sie ihr Kapital ein: ");
        kapital = sc.nextDouble();
        System.out.print("Bitte geben Sie den Zinssatz ein: ");
        zinssatz = sc.nextDouble();
        System.out.print("Bitte geben SIe die Anlagedauer (in Jahren) ein: ");
        anlagedauer = sc.nextInt();
    }

    public void verarbeitung()
    {   
        tempkapital = kapital;
        for(int i = 0; i < anlagedauer; i++ )
        {
            zinsen = tempkapital*zinssatz/100;
            tempkapital = tempkapital + zinsen;
            zahlList.add(zinsen);
           
            tempendkapital = tempendkapital + zahlList.get(i);
        }
        zinsen = tempendkapital;
        endkapital = tempendkapital + kapital;
       
        
    }

    public void ausgabe()
    {   
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("\nStartkapital : "+ kapital +" Euro");
        System.out.print("\nZinssatz: "+ zinssatz + "%");
        System.out.print("\nAnlagerdauer: "+ anlagedauer +" Jahre");
        System.out.print("\nZinsen: "+ dc1.format(zinsen) + " Euro");
        System.out.print("\nEndkapital: " + dc1.format(endkapital) + " Euro");
        System.out.print("\n\nMöchten Sie eine neue Berechnung druchführen (j/n)");
        repeat = sc.next();
        if(repeat.equals("J") || repeat.equals("j"))
        {
            eingabe();
            verarbeitung();
            ausgabe();
        }while(repeat.equals("J") || repeat.equals("j"));
    }

    public static void main(String[] args) 
    {
        Sparplan sp1 = new Sparplan();
        sp1.titel();
        sp1.eingabe();
        sp1.verarbeitung();
        sp1.ausgabe();
        sc.close();
    }
    
}
