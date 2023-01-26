import java.util.Scanner;

public class ArrayInteriTrueFalse
{
    public static boolean array(int[] A, int n)
    {
        for (int i=0;i<A.length;i++)
        {
            if (A[i] == n)
            {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti numeri interi vuoi creare");
        int tot_numero = input.nextInt();
        int[] numero = new int[tot_numero];
        for (int i=0;i<tot_numero;i++)
        {
            System.out.println("Inserisci il numero " + i);
            numero[i] = input.nextInt();
        }
        int numero_da_cercare = 0;
        System.out.println("Inserisci il numero da cercare nell'array appena creata");
        numero_da_cercare = input.nextInt();
        array(numero,numero_da_cercare);
    }
}
