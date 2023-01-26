import java.util.Scanner;

public class Anno_bisestile
{
    public static void anno_bisestile()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digita l'anno");
        int anno = input.nextInt();
        if (anno%100 == 0 && anno%4 == 0 && anno%400 == 0)
        {
            System.out.println("L'anno secolare è bisestile");
        }
        else if (anno%100 == 0 && anno%4 == 0 && anno%400 != 0)
        {
            System.out.println("L'anno secolare non è bisestile");
        }
        else if (anno%100 != 0 && anno%4 == 0 && anno%400 != 0)
        {
            System.out.println("L'anno è bisestile");
        }
        else
        {
            System.out.println("L'anno non è bisestile");
        }
    }
    public static void menu()
    {
        System.out.println("Menù anno");
        System.out.println("1 - info anno");
        System.out.println("0 - Esci dal programma");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto al programma Anno Bisestile");
        int scelta = -1;
        do{
            menu();
            scelta = input.nextInt();
            switch (scelta)
            {
                case 1:
                {
                    anno_bisestile();
                    break;
                }
                case 0:
                {
                    System.out.println("Programma terminato");
                    break;
                }
                default:
                {
                    System.out.println("Opzione non disponibile");
                }
            }

        }while(scelta != 0);
    }
}
