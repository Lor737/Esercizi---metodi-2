import java.util.Scanner;

public class TuttiUguali
{
    public static boolean confrontaNumUguali(int[] array)
    {
        int[] array2 = new int[array.length];//7 7 2
        int primo = 0;
        for (int i=1,j=0;i<array.length && j<array.length;i++,j++)
        {
            array2[j] = array[i];
            array2[array.length-1] = array[0];
        }
        int uguale = 0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i] == array2[i])
            {
                uguale +=1;
            }
        }
        if(uguale == array.length)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numero_array = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Inserisci un numero");
            numero_array[i] = input.nextInt();
        }
        boolean confronto = confrontaNumUguali(numero_array);
        if(confronto == true)
        {
            System.out.println("Tutti uguali");
        }
        if(confronto == false)
        {
            System.out.println("Almeno uno è diverso");
        }

    }
}
