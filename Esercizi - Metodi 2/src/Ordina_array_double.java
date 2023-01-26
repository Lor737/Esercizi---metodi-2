import java.util.Scanner;
public class Ordina_array_double
{
    public static double[] ordina_array(double[] A) //3 1 5 2 4 3 1
    {
        double minimo;
        int indice;
        int indice_occorrenza = 0;
        int occorrenza_finale = 0;
        int occorrenza = 0;
        int fine = 0;

        double[] array_ordinata = new double[A.length];
        double[] array_copia = new double[A.length];
        for (int i=0;i<A.length;i++)
        {
            array_copia[i] = A[i];
        }

        do{
            minimo = A[0];
            indice = 0;
            for(int i=0;i<A.length;i++)
            {
                if (A[i] < minimo)
                {
                    minimo = A[i];
                }
            }
            indice_occorrenza += occorrenza; //sommo ad ogni ciclo le occorrenze
            occorrenza = contaOccorrenze(array_copia,minimo); //calcolo l'occorrenza del minimo nell'array originale
            if (occorrenza>1)
            {
                for(int i=0;i<occorrenza;i++)
                {
                    array_ordinata[i+indice_occorrenza] = minimo;
                }
            }
            else if (occorrenza == 1)
            {
                array_ordinata[indice_occorrenza] = minimo;
            }
            for(int i=0;i<A.length;i++)
            {
                if (A[i] != minimo)
                {
                    indice = i;
                }
            }
            for(int i=0;i<A.length;i++)
            {
                if (A[i] == minimo)
                {
                    A[i] = A[indice];
                }
            }
            //quando tutti gli elementi sono tutti uguali, allora finisce il ciclo do - while
            occorrenza_finale = contaOccorrenze(A,minimo);
            if (occorrenza_finale == A.length)
            {
                fine = 1;
            }
        }while(fine != 1);
        return array_ordinata;
    }
    public static int contaOccorrenze(double[] array, double numero)
    {
        int occorenze = 0;
        for(int i =0;i< array.length; i++)
        {
            if (array[i] == numero)
            {
                occorenze += 1;
            }
        }
        return occorenze;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        int tot_numero = input.nextInt();
        double[] numero = new double[tot_numero];
        for (int i=0;i<tot_numero;i++)
        {
            System.out.println("Inserisci il numero " + i);
            numero[i] = input.nextDouble();
        }
        double[] array_ordinata = ordina_array(numero);
        for (int i= 0;i<tot_numero;i++)
        {
            System.out.println("array in: " + i + " : "+ array_ordinata[i]);
        }
    }
}