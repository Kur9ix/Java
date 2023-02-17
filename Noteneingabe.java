import java.util.*;

public class Noteneingabe {
    
    int anzahlschüler;
    int note;
    int[] noten;
    double durchschnitt;
    
    
    

    Scanner sc = new Scanner(System.in);

    public void eingabe(){
        System.out.print("Wie viele Schueler haben an der Klassenarbeit teilgenommen: ");
        anzahlschüler = sc.nextInt();
        anzahlschüler = anzahlschüler+1;
        noten = new int[anzahlschüler];
        
        for(int i = 1; i < anzahlschüler;i++){
           
            System.out.print("Notenpunkte des " +i+ ". Schülers eingeben: ");
            note = sc.nextInt();
            noten[i] = note;
            durchschnitt += note; 
        }
        
    }
    public void notendurchschnitt(){
    
        durchschnitt /= anzahlschüler-1;
        
    }
    public void notenspiegel(){
        
        System.out.print("\nAusgabe Notenliste Schüler:\n");

        for(int i = 1; i < anzahlschüler; i++){
            System.out.print("\n" + i + ".Schüler " + noten[i] + " Punkte");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        Arrays.sort(noten);
        
        int punkte = 15;
        int notenpunkt = 0;
        System.out.print("\n ");
        System.out.print("\nAusgabe Notenspiegel:");
        for(int i = anzahlschüler - 1; punkte > 0;)
        {   
            
            if(noten[i] == punkte){
                notenpunkt++;
                i--;
                
            }else{
                System.out.print("\n"+ punkte + " Punkte: " + notenpunkt +" Schüler");
                punkte--;
                notenpunkt = 0;
            }
        }
        
    }

    public void ausgabe(){
      
        System.out.print("\n"+durchschnitt);
    }


    public static void main(String[] args){

        Noteneingabe noteneingabe = new Noteneingabe();
        System.out.print("**************************************************************");
        System.out.print("\n\t\t\tNoteneingabe");
        System.out.print("\n**************************************************************\n");
        noteneingabe.eingabe();
        noteneingabe.notendurchschnitt();
        noteneingabe.notenspiegel();
        noteneingabe.ausgabe();
    }
}
