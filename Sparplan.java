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
        System.out.print("\t*************************************************\n");
        System.out.print("\t\t\t Sparplan\n");
        System.out.print("\t*************************************************\n");
    }

    public void eingabe()
    {
        System.out.print("\tBitte geben Sie ihr Kapital ein: ");
        kapital = sc.nextDouble();
        System.out.print("\tBitte geben Sie den Zinssatz ein: ");
        zinssatz = sc.nextDouble();
        System.out.print("\tBitte geben SIe die Anlagedauer (in Jahren) ein: ");
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
        System.out.print("\n\tStartkapital : "+ kapital +" Euro");
        System.out.print("\n\tZinssatz: "+ zinssatz + "%");
        System.out.print("\n\tAnlagerdauer: "+ anlagedauer +" Jahre");
        System.out.print("\n\tZinsen: "+ dc1.format(zinsen) + " Euro");
        System.out.print("\n\tEndkapital: " + dc1.format(endkapital) + " Euro");
        System.out.print("\n\n\tMöchten Sie eine neue Berechnung druchführen (j/n)");
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
