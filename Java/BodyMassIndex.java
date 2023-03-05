import java.util.*;
import java.text.*;

public class BodyMassIndex{

    int Gewicht;
    double Körpergröße;
    double BMI;
    String Gewichtsangabe;

    DecimalFormat formatter = new DecimalFormat("#.##");


    public void eingabe(){
        Scanner sc1 = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Bitte gebn Sie ihr Gewicht (in Kh) ein: ");
        Gewicht =sc1.nextInt();
        System.out.print("Bitte geben Sie ihre Körpergröße (in m) ein: ");
        Körpergröße =sc1.nextDouble();
        
        sc1.close();
    }

    public void verarbeitung(){
        BMI = Gewicht/(Körpergröße*Körpergröße);
        if(BMI <= 1000){
            Gewichtsangabe = "Stakres Übergewicht";
        }
        if(BMI <= 30){
            Gewichtsangabe = "Übergewicht";
        }
        if(BMI <= 25){
            Gewichtsangabe = "Normalgewicht";
        }
        if(BMI <= 19){
            Gewichtsangabe = "Untergewicht";
        }
    }

    public void ausgabe(){
        System.out.println(" ");
        System.out.print("Ihr Body-Mass-Index (BMI) beträgt: "+formatter.format(BMI));
        System.out.print("\nSie haben "+Gewichtsangabe +"!");
    }   

    public static void main(String[] args) {
        BodyMassIndex BMS1 = new BodyMassIndex();

        System.out.print("\n*****************************************************\n");
        System.out.print("\t\t   Body-Mass-Index");
        System.out.print("\n*****************************************************\n");

        BMS1.eingabe();
        BMS1.verarbeitung();
        BMS1.ausgabe();

    }

}