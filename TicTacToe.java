import java.util.*;

public class TicTacToe{

    static boolean spiel = true;

    char[][] spielFeld = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static char spielerzeichen = 'o';
    String auswertung;
    int spieler  = 2;

    public void starteSpiel()
    {
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld[i].length; j++) {
                spielFeld[i][j] = '*';
            }
        }
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld.length; j++) {
               System.out.print(spielFeld[j][i] + " ");
            }
            System.out.println(" ");
        }
    } 

    public void setzeSpielstein()
    {
        int x;
        int y;
        if(spielerzeichen == 'x'){
            spielerzeichen = 'o';
            spieler++;
        }else{
            spielerzeichen = 'x';
            spieler--;
        }
        
            
        System.out.print("Spieler "+ spieler + " <-"+ spielerzeichen +">: \n");
        System.out.print("Eingabe Koordinate x <0-2>: ");
        x = sc.nextInt();
        System.out.print("Eingabe Koordinate y <0-2>: ");
        y = sc.nextInt();
        spielFeld[x][y] = spielerzeichen;
             
           
        
    } 
    public void ausgabeSpielfeld()
    {
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld.length; j++) {
               System.out.print(spielFeld[j][i] + " ");
            }
            System.out.println(" ");
        }
    } 
    public void auswertungTreffer(){
        
        for (int i = 0; i < spielFeld.length; i++) {
            if(spielFeld[i][0] == spielerzeichen && spielFeld[i][1] == spielerzeichen && spielFeld[i][2] == spielerzeichen){
                auswertung = "Spieler" + spieler + "gewinnt";
                spiel = false;
            }
            if(spielFeld[0][i] == spielerzeichen && spielFeld[1][i] == spielerzeichen && spielFeld[2][i] == spielerzeichen){
                spiel = false;
            }
            if(spielFeld[0][0] == spielerzeichen && spielFeld[1][1] == spielerzeichen && spielFeld[2][2] == spielerzeichen){
                spiel = false;
            }
            if(spielFeld[2][0] == spielerzeichen && spielFeld[1][1] == spielerzeichen && spielFeld[0][2] == spielerzeichen){
                spiel = false;
            }
        }
        
        
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld.length; j++) {
                if(spielFeld[j][i] != '*'){

                }
            }
        }
        
    }
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.starteSpiel();
        do{
            ticTacToe.setzeSpielstein();
            ticTacToe.auswertungTreffer();
            ticTacToe.ausgabeSpielfeld();
        }while(spiel == true);
        System.out.print("Spieler " + spielerzeichen + " gewinnt");
    
    }
}