import java.util.*;
import java.text.*;

public class Körpergröße {
    
    double Oberschenkel;
    int Alter;
    int Geschlechte;
    String Geschlecht;
    double Größe;
    double s;
    double KörpergrößeAbzug;

    DecimalFormat formatter = new DecimalFormat("#.##");

    public void eingabe(){

        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nWie lang sind Ihre Oberschenkel (in m)? ");
        Oberschenkel =sc1.nextDouble();
        System.out.print("Wie alt sind Sie? ");
        Alter = sc1.nextInt();
        System.out.print("Sind sie männlich (1) oder weiblich (2)? ");
        Geschlechte =sc1.nextInt();
        sc1.close();

    }

    public void verarbeitung(){

        if(Alter < 30){
            s = Alter-30;
            KörpergrößeAbzug = s*0.0006;
        }

        if(Geschlechte == 1){
            Geschlecht = ("Männlich");
        }else{
            Geschlecht = ("Weiblich");
        }

        if(Geschlecht == "Männlich" ){
            Größe = Oberschenkel*2.238+ 0.69089-KörpergrößeAbzug;
        }else{
            Größe = Oberschenkel*2+ 0.61417-KörpergrößeAbzug;
        }


    }

    public void ausgabe(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Auswertung:");
        System.out.print("\nSie sind "+ Alter + " alt, " +Geschlecht + " und haben \neine Oberschenkellänge von " + Oberschenkel+".");
        System.out.println(" ");
        System.out.print("\nWahrscheinlich sind Sie "+formatter.format(Größe)+" m groß");
    }

    public static void main(String[] args) {
        Körpergröße kg1 = new Körpergröße();

        System.out.print("\n*********************************************************\n");
        System.out.print("\t\tBerechnung Körpergröße ");
        System.out.print("\n*********************************************************\n");
       
        kg1.eingabe();
        kg1.verarbeitung();
        kg1.ausgabe();

    }

}
