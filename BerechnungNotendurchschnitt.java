import java.util.*;

public class BerechnungNotendurchschnitt{
  
       double note1;
       double note2;
       double note3;
       double note4;
       double note5;
       double note6;
       double schüler;
       double durchschnitt;
       

     public void eingabe(){
  
      Scanner sc =new Scanner(System.in);
      
      System.out.println("\nNoteneingabe:");
      System.out.print("Bitte geben Sie die Anzahl der Note 1 ein: ");
      note1 = sc.nextDouble();
      System.out.print("Bitte geben Sie die Anzahl der Note 2 ein: ");
      note2 =sc.nextDouble();
      System.out.print("Bitte geben Sie die Anzahl der Note 3 ein: ");
      note3 = sc.nextDouble();
      System.out.print("Bitte geben Sie die Anzahl der Note 4 ein: ");
      note4 =sc.nextDouble();
      System.out.print("Bitte geben Sie die Anzahl der Note 5 ein: ");
      note5 =sc.nextDouble();
      System.out.print("Bitte geben Sie die Anzahl der Note 6 ein: ");
      note6 =sc.nextDouble();
      System.out.println("\n");  
      sc.close(); 
     }
  
  
  
     public void verarbeitung(){
     schüler = note1+note2+note3+note4+note5+note6;
     durchschnitt = note1*1+note2*2+note3*3+note4*4+note5*5+note6*6;
     durchschnitt = durchschnitt/schüler;
     
     }
  
     public void ausgabe(){
     System.out.println("Auswertung:");
     System.out.println("Insgesamt haben " +schüler+" Schüler an der Klassenarbeit teilgenommen.");
     System.out.println("\n");
     System.out.println("Note 1:"+"\t"+note1+"  Schüler");
     System.out.println("Note 2:"+"\t"+note2+"  Schüler");
     System.out.println("Note 3:"+"\t"+note3+"  Schüler");
     System.out.println("Note 4:"+"\t"+note4+"  Schüler");
     System.out.println("Note 5:"+"\t"+note5+"  Schüler");
     System.out.println("Note 6:"+"\t"+note6+"  Schüler");
     System.out.println("\n");
     System.out.println("Der Notendurchschnitt beträgt:"+durchschnitt);
     }
  
     public static void main(String[] args) {
     BerechnungNotendurchschnitt bNotendurchschnitt = new BerechnungNotendurchschnitt();
     System.out.print("\n**********************************************\n");
     System.out.print("\tBerechnung Notendurchschnitt");
     System.out.print("\n**********************************************\n");
    
     bNotendurchschnitt.eingabe();
     bNotendurchschnitt.verarbeitung();
     bNotendurchschnitt.ausgabe();
                 
     }
      
               
  }
