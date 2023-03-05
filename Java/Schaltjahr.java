import java.util.*;

public class Schaltjahr 
{
    
int jahr;
String ergebnis;


public void eingabe()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("\tBitte geben SIe die Jahreszahl ein: ");
    jahr = sc.nextInt();

    sc.close();
}

public void verarbeitung()
{

    }

    public void ausgabe()
    {
        System.out.println(ergebnis);
    }
    public static void main(String[] args) {
        Schaltjahr sj1 = new Schaltjahr();
    
        sj1.eingabe();
        sj1.verarbeitung();
        sj1.ausgabe();

    

    }
 

}
