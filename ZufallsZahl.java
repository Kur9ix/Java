import java.util.*;

public class ZufallsZahl {
    
    int zahl_eingabe;
    int versuchen;
    int versuche;
    boolean schleife = true;
    String abstand;
 

    
    
    static Scanner sc1 = new Scanner(System.in);
    
    public void titel(){
        System.out.print("\n********************************************************");
        System.out.print("\n\t\tZufallszahl errtaen");
        System.out.print("\n********************************************************");
    }

    public void eingabe(){
        versuchen = 0;
        versuche = 5;
        schleife = true;
        
        Random rn = new Random();
        int random_zahl = rn.nextInt(10) + 1;

        do{
            
            
            if(versuche == 0){
                System.out.print("Sie haben verloren!");
                schleife = false;
                
            }
            if(versuche != 0){
                versuchen ++;
                System.out.print("\nBitte geben Sie eine Zahl zwischen 1 und 10 an: ");
                zahl_eingabe = sc1.nextInt();
                if(zahl_eingabe == random_zahl){
                    schleife = false;
                    ausgabe();
                    return;
                    
                }
                if(zahl_eingabe >= 11){
                    System.out.print("\nFalsche Eingabe! Wiederholen sie die eingabe\n");
                }
                else{
                    
                    if(zahl_eingabe < random_zahl){
                        abstand = "\nDie Zahl ist zu niedrig.";
                    }
                    else if(zahl_eingabe > random_zahl){
                        abstand = "\nDie Zahl ist zu hoch!";
                    }
                    versuche --;
                    System.out.print(abstand +" Sie haben noch "+ versuche + " Versuche.\n");
                    
                }
               
            }
        }while (schleife == true );
    }
    public void ausgabe(){
        System.out.print("\nSie haben nach " + versuchen + " Versuchen  Gewonnen!");
    }

    public static void main(String[] args) {
        ZufallsZahl zz = new ZufallsZahl();
        
        char repeat = 'j';
        
        while (repeat == 'j' || repeat == 'J') { 
          zz.titel();
          zz.eingabe();
          
          System.out.print("\nMöchten Sie eine neue Berechnung druchführen (J/N) ?");
          repeat = sc1.next().charAt(0);
          System.out.print("\n");
          
        } 
    }
}
