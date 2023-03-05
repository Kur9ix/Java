import java.util.*;
import java.text.*;

public class ZinsenBerechnen{
  
  double Geld;
  double Zinssatz;
  double Zinsen;
  int Laufzeit;
  
  DecimalFormat formatter = new DecimalFormat("#.##$");
  
  public void eingabe(){
    
    Scanner sc1 = new Scanner(System.in);
    System.out.print("\nEinagbe: \n");
    System.out.print("Bitte geben Sie ihren Geldbetrag ein: ");
    Geld =sc1.nextDouble();
    System.out.print("Bitte geben Sie den Zinssatz ein: ");
    Zinssatz =sc1.nextDouble();
    System.out.print("Bitte geben Sie die Laufzeit der Zinsen ein: ");
    Laufzeit =sc1.nextInt();
    sc1.close();
    
  }
  
  public void verarbeitung(){
    
    Zinsen = Geld*Zinssatz*Laufzeit/100;  
    
  }
  
  
  public void ausgabe(){
    
    System.out.print("\nAusgabe: ");
    System.out.print("\nNach der Laufzeit von "+Laufzeit+" Jahr|Jahren und einem Kapital "+Geld+"$ erhalten sie "+formatter.format(Zinsen)+" Zinsen.\n");
    
  }
  
  public static void main(String[] args){
    
    ZinsenBerechnen zb1;
    zb1 = new ZinsenBerechnen();
    
    System.out.print("*******************************************************\n");
    System.out.print("\t\t   Zins Berechnung\n");
    System.out.print("*******************************************************\n");
    
    zb1.eingabe();
    zb1.verarbeitung();
    zb1.ausgabe();
    
  }
  
  
}
