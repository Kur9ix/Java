import java.util.*;

public class WortspielQuiz
{
    Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    String[] fragen = {"Sie wird kürzer, je länger man zieht", "Dieser Ring ist nicht rund", "Dieser Baum hat keien Blätter!", "Dieses Tal will jeder haben", "Ein Zahn, der nicht beißt", "Ein Stuhl ohne Beine"};
    String[] lösungen = {"Zigarre" , "Boxring" , "Purzelbaum" , "Kapital" , "Löwenzahn" , "Dachstuhl"};
    String frage;
    String lösung;
    String eingegebeneLösung;
    int antworten;
    int richtigeantworten;



    public void auswahlFragen()
    {
        int randomnum = random.nextInt(fragen.length);
        frage = fragen[randomnum];
        lösung = lösungen[randomnum];
    }

    public void eingabeAntwort()
    {
        int i = 1;
        System.out.print( i + ". Frage: " + frage+ "\n");
        System.out.print("Eingabe Lösung: ");
        eingegebeneLösung = sc.next();
        
    }

    public void auswertung()
    {
        System.out.print("\n");
        System.out.print("Auswertung: \n");
        if(eingegebeneLösung.equalsIgnoreCase(lösung)){
            System.out.print("Herzlichen Glüchwunsch, Ihre Antwort ist richtig!");
            richtigeantworten++;
        }else{
            System.out.print("Die Antwort war leider falsch!");
        }
        antworten++;
    }
    public void ausgabeGesamtauswertung()
    {
        System.out.print("\n");
        System.out.print("\nSie haben " + richtigeantworten + " von " + antworten + " Antworten richtig!");
    }

    public static void main(String[] args) {
        WortspielQuiz wortspielQuiz = new WortspielQuiz();

        char wiederholung = 'j';
        do{ 
            wortspielQuiz.auswahlFragen();
            wortspielQuiz.eingabeAntwort();
            wortspielQuiz.auswertung();
            System.out.print("\n");
            System.out.print("\nMöchten Sie noch einmal spielen? (J/N) ");
            wiederholung = sc.next().charAt(0);
            if(wiederholung == 'n' || wiederholung == 'N')
            {
                wortspielQuiz.ausgabeGesamtauswertung();
            }
        }while(wiederholung == 'j' || wiederholung == 'J');
       
    }
}