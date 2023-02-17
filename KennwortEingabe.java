import java.util.*;






public class KennwortEingabe {
    
    String passwort = "FLS";
    String passworteingabe;
    int verschuche = 3;
    boolean schleife = true;

    Scanner sc1 = new Scanner(System.in);

    public void titel(){
        System.out.print("\n**************************************");
        System.out.print("\n\tKennworteinagbe");
        System.out.print("\n**************************************");

    }

    public void einagbe(){    
      while(schleife == true){
        
        System.out.print("\nBitte geben Sie ihr Kennwort ein: ");
        passworteingabe = sc1.nextLine();
        
        if(verschuche == 0){
            System.out.print("\nSie haben keine Versuche mehr!");
            schleife = false;
            System.exit(500);
        }

        
        if(passworteingabe.equals("FLS") && verschuche <= 3){
            schleife = false;
           
            
        }
        else{
          verschuche --;

          System.out.print("\nDas Kennwort ist leider falsch!");
          System.out.print("\nSie habe noch "+ verschuche +" von 3 Versuchen!\n");
        }
        
        
     }
     sc1.close();
    }


    public void ausgabe(){
        System.out.print("\nSie haben sich erflogreich angemldet!");
    }

    public static void main(String[] args) {
        
        KennwortEingabe kw = new KennwortEingabe();

        kw.titel();
        kw.einagbe();
        kw.ausgabe();
    }
    
}
