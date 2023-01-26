import java.util.Scanner;

public class Ripeti
{
    public static void ripeti(String stringa, int numero)
    {
        for(int i=0;i<numero;i++)
        {
            System.out.println(stringa);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String stringa = input.nextLine();
        System.out.println("Inserisci un numero intero maggiore di zero");
        int numero = input.nextInt();
        do{
            System.out.println("ERRORE: numero negativo, reinserisci il numero");
            numero = input.nextInt();
        }while(numero < 0);
        ripeti(stringa, numero);
    }
}
