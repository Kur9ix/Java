import java.util.*;



public class ExponentialFunktion
{
    int potenz;
    long exponenten;
    double ergebnis;

    Scanner scanner = new Scanner(System.in);

    public void title()
    {
        System.out.print("\n**************************************************");
        System.out.print("n\t\t Exponential-Funktion");
        System.out.print("\n**************************************************");
    }


    public void eingabe()
    {

        System.out.print("\nGeben Sie eine Zahl ein, die Sie potenzieren moechten: ");
        potenz = scanner.nextInt();
        System.out.print("\nBitte geben SIe den Exponenten ein: ");
        exponenten = scanner.nextLong();

    }

    public void verarbeitung()
    {
        for(int i = 0; i < exponenten; i++)
        {
            
            System.out.print(ergebnis);
        }
    }

    public void ausgabe(){


    }

    public static void main(String[] args) {
        ExponentialFunktion exponentialFunktion = new ExponentialFunktion();

        exponentialFunktion.title();
        exponentialFunktion.eingabe();
        exponentialFunktion.verarbeitung();
        exponentialFunktion.ausgabe();
    }
}