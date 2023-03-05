import java.util.*;
import java.text.*;


public class Übung {
    
    int gewicht;
    int höhe;
    int einschreiben;
    double porto;
    double standardb = 0.58;
    double kompaktb = 0.90;
    double maxib = 1.45;
    double einschreibungsgebühr = 2.05;
    String versendungsform;
    String zusatzEinschreiben;
    

    Scanner sc1 = new Scanner(System.in);

    public void eingabe()   //Eingabe der geforderten Informationen
    { 
        System.out.print("\nBitte geben Sie das Gewicht ein: ");
        gewicht =sc1.nextInt();
        System.out.print("\nBitte geben Sie die Höhe ein: ");
        höhe =sc1.nextInt();
        System.out.print("\nEinschreibungsgebühr (Ja 1|Nein 2) ");
        einschreiben =sc1.nextInt();
        
    }

    public void verarbeitung() // Verarbeitung von den eingegebenen Informationen 
    {
        if(gewicht <= 20 && höhe <= 5 ){ 
            porto = standardb;
            versendungsform = "Standardbrief";
        }
        else if(gewicht <=50 && höhe <= 10){
            porto = kompaktb;
            versendungsform = "Kompaktbrief";
        } else{
            porto = maxib;
            versendungsform = "Maxibrief";
        }


        if(einschreiben == 1){
            porto = porto + einschreibungsgebühr;
            zusatzEinschreiben = ("(inkl. Einschreibgebuehr von " + einschreibungsgebühr +" Euro)");

        }
    }

    public void ausgabe() // Ausgabe der verarbeiteten Informationen 
    { 
        DecimalFormat df = new DecimalFormat("0.00 Euro");
    
        System.out.println("\nDas Porto fuer den " + versendungsform + " betraegt: " + df.format(porto));
    
        if (einschreiben ==1){
         System.out.println(zusatzEinschreiben); 
        }
    }


    public static void main(String[] args) {
        Übung ub = new Übung();

        ub.eingabe();
        ub.verarbeitung();
        ub.ausgabe();
    }
}
