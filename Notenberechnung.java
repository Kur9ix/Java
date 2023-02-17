import java.util.*;

public class Notenberechnung {
    
    int MaximalePunkte;
    int PunkteErreicht; 
    double Prozent;
    int Note;

    public void eingabe(){

        Scanner sc1 = new Scanner(System.in);

        System.out.print("\nEingabe: \n");
        System.out.print("-------------------------------------------------------\n");
        System.out.print("Wie viele Punkte konnten Sie maximal erreichen? ");
            MaximalePunkte =sc1.nextInt();
        System.out.print("Wie viele Punkte haben Sie erreicht? ");
            PunkteErreicht =sc1.nextInt();
            sc1.close();

    }

    public void verarbeitung(){

        Prozent = (PunkteErreicht * 100)/MaximalePunkte;

        if(Prozent <= 100){
            Note = 15;
        }
        if(Prozent <= 95){
            Note = 15;
        }
        if(Prozent <= 90){
            Note = 14;
        }
        if(Prozent <= 85){
            Note = 13;
        }
        if(Prozent <= 80){
            Note = 11;
        }
        if(Prozent <= 75){
            Note = 10;
        }
        if(Prozent <= 70){
            Note = 9;
        }
        if(Prozent <= 65 ){
            Note = 8;
        }
        if(Prozent <= 60){
            Note = 7;
        }
        if(Prozent <= 55){
            Note = 6;
        }
        if(Prozent <= 50){
            Note = 5;
        }
        if(Prozent <= 45){
            Note = 4;
        }
        if(Prozent <= 40){
            Note = 3;
        }
        if(Prozent <= 33){
            Note = 2;
        }
        if(Prozent <= 27){
            Note = 1;
        }
        if(Prozent <= 20){
            Note = 0;
        }

    }

    public void ausgabe(){

        System.out.print("\nAusgabe: ");
        System.out.print("\n-------------------------------------------------------\n");
        System.out.print("Sie haebn "+PunkteErreicht+" von "+MaximalePunkte+" erreicht!\n");
        System.out.print("\nDas entspricht "+Prozent+" Prozent und damit der Note: "+Note+" Punkte.\n");

    }

    public static void main(String[] args) {
        
        Notenberechnung nb1 = new Notenberechnung();
        
        System.out.print("\n*******************************************************\n");
        System.out.print("\t\t   Notenberechnung\n");
        System.out.print("*******************************************************\n");
        
        nb1.eingabe();
        nb1.verarbeitung();
        nb1.ausgabe();

    }

}
