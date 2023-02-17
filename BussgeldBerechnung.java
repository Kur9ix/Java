import java.util.*;
import java.text.*;

public class BussgeldBerechnung {
    
    double Höchstgeschwindigkeit;
    double Geschwindigkeit;
    double GeschwindigkeitÜberschrit;
    String Ort;
    String OrtName;
    String Monat;
    String Strafpunkte;
    int Busgeld;
    int Strafpunkt;
    int Fahrverbot;
   
    DecimalFormat formatter = new DecimalFormat("#.#");

    public void eingabe(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nEingabe: \n");
        System.out.print("*************************************************************\n");
        System.out.print("Wo haben Sie die Geschwindigkeitübertretung begangen?\n");
        System.out.print("1: innerhalb geschlossener Ortschaften,\n");
        System.out.print("2: ausserhalb geschlossener Ortschaften\n");
        System.out.print("Bitte geben Sie die entsprechende Kennziffer ein: ");
        Ort = sc1.next();
        System.out.print("Wie hoch ist die erlaubte Höchstgeschwindigkeit (in km/h)\nauf dieser Steasse? ");
        Höchstgeschwindigkeit =sc1.nextInt();
        System.out.print("Wie schnell sind Sie gefahren (in km/h)? ");
        Geschwindigkeit =sc1.nextInt();

        sc1.close();
    }

    public void verarbeitung(){
        
        
        
        if (Geschwindigkeit < 100) {
            Geschwindigkeit = Geschwindigkeit - 3;
        } else if (Geschwindigkeit > 100) {
           Geschwindigkeit = Geschwindigkeit - (Geschwindigkeit / 100 *3);
        }

        GeschwindigkeitÜberschrit = Geschwindigkeit - Höchstgeschwindigkeit;

        switch (Ort){
          case "1":
          OrtName = "innerorts";
          if (GeschwindigkeitÜberschrit > 70) {
            Busgeld = 800;  Strafpunkt = 2; Fahrverbot = 3;
          } else  if(GeschwindigkeitÜberschrit >= 60){
            Busgeld = 700; Strafpunkt = 2; Fahrverbot = 3;
          } else if(GeschwindigkeitÜberschrit >= 50){
            Busgeld = 600; Strafpunkt = 2; Fahrverbot = 2;
          } else if(GeschwindigkeitÜberschrit >= 40){
            Busgeld = 400; Strafpunkt = 2; Fahrverbot = 2;
          } else if(GeschwindigkeitÜberschrit >= 30){
            Busgeld = 260; Strafpunkt = 2; Fahrverbot = 1;
          } else if(GeschwindigkeitÜberschrit >= 25){
            Busgeld = 180; Strafpunkt = 1; 
          } else if(GeschwindigkeitÜberschrit >= 20){
            Busgeld = 115; Strafpunkt = 1; 
          } else if(GeschwindigkeitÜberschrit >= 15){
            Busgeld = 70; Strafpunkt = 1;
          } else if(GeschwindigkeitÜberschrit >= 10){
            Busgeld = 50; 
          } else if(GeschwindigkeitÜberschrit < 10){
            Busgeld = 30;
          }
          
          break;
          case "2":
          OrtName = "ausserorts";
          if(GeschwindigkeitÜberschrit > 70){
            Busgeld = 700; Strafpunkt = 2; Fahrverbot = 3; 
          } else if(GeschwindigkeitÜberschrit >= 60){
            Busgeld = 600; Strafpunkt = 2; Fahrverbot = 2;
          } else if(GeschwindigkeitÜberschrit >= 50){
            Busgeld = 480; Strafpunkt = 2; Fahrverbot = 1;
          } else if(GeschwindigkeitÜberschrit >= 40){
            Busgeld = 320; Strafpunkt = 2; Fahrverbot = 1;
          } else if(GeschwindigkeitÜberschrit >= 30){
            Busgeld = 200; Strafpunkt = 2; Fahrverbot = 1;
          } else if(GeschwindigkeitÜberschrit >= 25){
            Busgeld = 150; Strafpunkt = 1;
          } else if(GeschwindigkeitÜberschrit >= 20){
            Busgeld = 100; Strafpunkt = 1;
          } else if(GeschwindigkeitÜberschrit >= 15){
            Busgeld = 60;
          } else if(GeschwindigkeitÜberschrit >= 10){
            Busgeld = 40;
          } else if(GeschwindigkeitÜberschrit < 10){
            Busgeld = 20;
          }
          
          break;
          default:
          System.out.print("Keine richtige Angabe");
          System.exit(1000);
        }

        if(Fahrverbot == 1){
            Monat = "Monat";
        }else{
            Monat = "Monate";
        }
        if(Strafpunkt == 1){
            Strafpunkte = "Strafpunkt";
        }else{
            Strafpunkte = "Strafpunkte";
        }
      
    }

    public void ausgabe(){
        System.out.print("\nAusgabe: \n");
        System.out.print("*************************************************************\n");
        System.out.print("Sie haben sich nicht an die Vorschriften gehalten und\nsind "+OrtName+" "+ formatter.format(GeschwindigkeitÜberschrit) +" km/h zu schnell gefahren.\n");
        System.out.print("\nSie müssen "+ Busgeld +" Euro bezahlen, bekommen "+ Strafpunkt +" Strafpunkte \nund "+ Fahrverbot +" " + Monat + " Fahrverbot.\n\n");
    }


    public static void main(String[] args) {
        
        BussgeldBerechnung bb1 = new BussgeldBerechnung();

        System.out.print("\n*************************************************************\n");
        System.out.print("\t\t    Busgeld-Berechnung\n");
        System.out.print("*************************************************************\n");

        bb1.eingabe();
        bb1.verarbeitung();
        bb1.ausgabe();
    }
}
