import java.util.*;

public class Notenerfassung 
{
  String name;
  
  String faecher[]={"Deutsch", "Englisch", "Geschichte"};
String notenTypen[] = {"1. Klausur", "2. Klausur", "schriftl. Note", "mündliche Note", "Zeugnisnote"};
  int[][] noten = new int[3][5];
      
  
  
  static Scanner sc = new Scanner(System.in);     
  public void eingabe()
{
  int punkte = 0;
  System.out.print("Schülername : ");
  name = sc.nextLine();
  
  for (int i = 0; i < faecher.length; i++) 
  {
    System.out.print("\nFach: " + faecher[i] + "\n");
    for (int j = 0; j < notenTypen.length-1 ; j++) {
      if(j == 2)
      {
        j++;
      }
      do {
        System.out.print("Note: " + notenTypen[j] + ": ");
        punkte  = sc.nextInt();
      } while (punkte > 16 ); 
  
      noten[i][j] = punkte;
      
    }
    
  }
}
  public void verarbeitung()
{
  int note;
  for (int i = 0; i < faecher.length; i++) {
    note = noten[i][0]+noten[i][1];
    note = note / 2;
    noten[i][2]= note;
    note = 0;
  }
  for (int i = 0; i < faecher.length; i++) {
    note = noten[i][2]+noten[i][3];
    note = note / 2;
    noten[i][4] = note;
    note = 0;
  }
}
  public void ausgabe()
{
  System.out.print("\nNotenübersicht für " + name + "\n");
  System.out.println("\t\t " + faecher[0]+"\t" +  faecher[1]+ "\t" + faecher[2]);
  System.out.println("==========================================================");
  for (int i = 0; i < notenTypen.length ; i++) {
    System.out.print(notenTypen[i]);
    System.out.print("\t ");
    for (int j = 0; j < faecher.length; j++) {
      System.out.print(noten[j][i] + "\t\t ");
    }
    System.out.println("");   
    if(i == 1)
    {
      System.out.println("----------------------------------------------------------");
    }  
    if(i == 2)
    {                                                                                
      System.out.println("----------------------------------------------------------");
    } 
    if(i == 3)
    {
      System.out.println("----------------------------------------------------------");
    } 
    if(i == 4)
    {
      System.out.println("==========================================================");
    }    
    
  } 
}
  

public static void main(String[] args) {
  Notenerfassung notenerfassung = new Notenerfassung();
  
  char wiederholung = 'j';
  
  do {
    notenerfassung.eingabe();
    notenerfassung.verarbeitung();
    notenerfassung.ausgabe();
    
    System.out.print("Möchten Sie das Programm wiederholen? (J/N) :");
    wiederholung = sc.next().charAt(0);
  } while (wiederholung == 'j'|| wiederholung == 'J');  
}
}
