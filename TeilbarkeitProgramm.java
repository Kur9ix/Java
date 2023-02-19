import java.util.*;

public class TeilbarkeitProgramm{

    static Scanner sc = new Scanner(System.in);
    int zahl;
    int divisor;

    public boolean teilbarkeit(int zahl, int divisor){
        return zahl % divisor == 0; 
    }
    void eingabe(){
        System.out.print("Zahl: ");
        zahl = sc.nextInt();
        System.out.print("Teiler: ");
        divisor = sc.nextInt();
    }
    

    void ausgabe(){
        if(teilbarkeit(zahl, divisor) == true){
            System.out.print("Testergebnis:" +zahl + " ist durch " + divisor + " glatt teilbar.");
        }else{
            System.out.print(zahl + " ist durch "+ divisor + " nicht glatt teilbar.");
        }

    }

    public static void main(String[] args) {
        TeilbarkeitProgramm teilbarkeitProgramm = new TeilbarkeitProgramm();

        teilbarkeitProgramm.eingabe(); 
        teilbarkeitProgramm.ausgabe();
    }
}