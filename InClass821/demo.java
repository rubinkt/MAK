import java.util.Scanner;
public class demo 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        AbClass abs = null;

        while (abs == null) 
        {
            System.out.print("Enter 1 for Cats or 2 for Dogs: ");
            int animal = scan.nextInt();

            if (animal == 1)
            {
                abs = new Cats();
            }

            else if (animal == 2)
            {
                abs = new Dogs();
            }

            else
            {
                System.out.println("Try Again");
            }
        }

        abs.animalName();
        scan.close();
    }
}
