import java.util.*;
public class PlanetenQuiz {
    String[] planeten = {"Merkur","Venus","Erde","Mars","Jupiter", "Saturn", "Uranus", "Pluto"};
    String[] planeteneingabe;
    int planetenanzahl;
    int richtigeplaneten;
    
    static Scanner sc = new Scanner(System.in);
    public void Eingabe()
    {   
        boolean schleife = true;
        while(schleife){
            System.out.print("\nWie viele Planeten kennen Sie? ");
            planetenanzahl = sc.nextInt();

            if(planetenanzahl <= 8)
            {
            schleife = false;
            }
            else{
                System.out.print("Hinwies: Es gibt nur 8 Planeten!");
            }
            
        }  
        planetenanzahl++;
        planeteneingabe = new String[planetenanzahl];
        String eingabe;
        System.out.print("\nEingabe:\n");


        for(int i = 1; i < planetenanzahl; i++){

            System.out.print(i + ". Planet: ");
            eingabe = sc.next();
            
            planeteneingabe[i] = eingabe;
        }
        
    }
    public void Verarbeitung()
    {
        richtigeplaneten = 0;
       for(String x : planeten)
       {
            for(int i = 1; i < planetenanzahl; i++ ){
                if(x.equals(planeteneingabe[i])){
                    richtigeplaneten++;
                }   
            }
       }
    }
    public void Ausgabe()
    {   
        System.out.print("\nAusgabe:\n");
        planetenanzahl -= 1;
        System.out.print("Flogende " + planetenanzahl +" Planeten wurden eingegeben: \n");
        for(int i = 1; i < planetenanzahl + 1 ; i++)
        {
            System.out.print( i + ". Planet: " + planeteneingabe[i] + "\n");
        }
        System.out.print("\nVon den " + planetenanzahl + " eingegebenen Planeten sind " + richtigeplaneten + " richtig\n");
    }

    public static void main(String[] args) {
        PlanetenQuiz planetenQuiz = new PlanetenQuiz();

        char wiederholung = 'j';

        do{
            planetenQuiz.Eingabe();
            planetenQuiz.Verarbeitung();
            planetenQuiz.Ausgabe();
            System.out.print("\nMöchten Sie das Prohramm wiederholen? (J/N)");
            wiederholung = sc.next().charAt(0);

        }while(wiederholung == 'J' || wiederholung == 'j');
    }
}
