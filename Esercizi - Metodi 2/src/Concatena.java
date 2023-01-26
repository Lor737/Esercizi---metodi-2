import java.util.Scanner;

public class Concatena
{
    public static String concatena(String[] stringa)
    {
        String stringa_concatenata = "";
        for(int i=0;i< stringa.length-1;i++)
        {
             stringa_concatenata = stringa_concatenata + stringa[i] + "*";
        }
        stringa_concatenata = stringa_concatenata + stringa[stringa.length-1];
        return stringa_concatenata;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] stringa_array = new String[3];
        String stringa_concatenata="";
        for(int i=0;i<3;i++)
        {
            System.out.println("Inserisci una stringa");
            stringa_array[i] = input.nextLine();
        }
        stringa_concatenata = concatena(stringa_array);
        System.out.println(stringa_concatenata);
    }
}
