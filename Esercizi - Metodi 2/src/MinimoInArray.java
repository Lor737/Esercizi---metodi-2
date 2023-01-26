import java.util.Scanner;

public class MinimoInArray
{
    public static void minimo_array(int[] A)
    {
        int minimo = A[0];
        for (int i= 0;i<A.length;i++) //5 6 1 9 4
        {
            if (A[i] < minimo)
            {
                minimo = A[i];
            }
        }
        System.out.println("Il minimo è: " + minimo);
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
        minimo_array(numero);
    }
}
/*
        5 6 1 9 4
        minimo = 5
        5 < 6? si
        minimo = 5
        6 < 1? no
        minimo = 5
        1 < 9? si
        minimo = 1
        9 < 4? no
        minimo = 1
*/