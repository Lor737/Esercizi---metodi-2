import java.util.Scanner;

public class EliminaVocali
{
    public static String elimina_vocali(String stringa)
    {
            String[] consonanti = {"b","c","d","f","g","h","l","m","n","p","q","r","s","t","v","w","x","y","z","?","!",","};
            String lettera = "";
            String stringa_finale = "";
            for (int i = 0; i < stringa.length(); i++)
            {
                lettera = stringa.substring(i, i + 1);
                for(int j=0;j< consonanti.length;j++)
                {
                    if (lettera.equals(consonanti[j]))
                    {
                        stringa_finale = stringa_finale + lettera;
                    }
                }
                if (lettera.equals(" "))
                {
                    stringa_finale = stringa_finale + lettera;
                }
            }
            System.out.println(stringa_finale);
            return stringa_finale;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi una frase o una frase");
        String stringa = input.nextLine();
        elimina_vocali(stringa);
    }
}
