import java.util.Scanner;

public class MassimoInArray
{
    public static void massimo_array(int[] A)
    {
        int massimo = A[0];
        for (int i= 0;i<A.length;i++)
        {
            if (A[i] > massimo)
            {
                massimo = A[i];
            }
        }
        System.out.println("Il massimo è: " + massimo);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        int tot_numero = input.nextInt();
        int[] numero = new int[tot_numero];
        for (int i=0;i<tot_numero;i++)
        {
            System.out.println("Inserisci il numero " + i);
            numero[i] = input.nextInt();
        }
        massimo_array(numero);
    }
}
