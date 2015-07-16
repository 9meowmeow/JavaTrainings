import java.util.Scanner;

public class Chislo
{
    public static void main(String[] args)
    {
        int n = 1;

        Scanner scanner = new Scanner(System.in);

        while(n != 0)
        {
            n = scanner.nextInt();

            if(n == 0)
            {
                break;
            }

            if(n % 3 == 0)
            {
                System.out.println("Число делится на 3");
            }
            else
            {
                System.out.println("Число не делится на 3");
            }
        }
    }
}
