import java.util.*;

public class TeilbarkeitProgramm{

    
    static Scanner sc = new Scanner(System.in);
    int zahl;
    int divisor;
    
    

    public int[] teilbarkeit(int zahl) {
        
        int[] divisors = new int[zahl];
        for (int i = 1; i < zahl; i++) {
            if (zahl % i == 0) {
                divisors[i] = i;
            }
        }
        return null;
        
    }
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
            System.out.print("");
            for (int i = 0; i < zahl; i++) {
                
            }
        }

    }

    public static void main(String[] args) {
        TeilbarkeitProgramm teilbarkeitProgramm = new TeilbarkeitProgramm();

        teilbarkeitProgramm.eingabe(); 
        teilbarkeitProgramm.ausgabe();
    }
}