import java.util.Scanner;
public class PrintUserName 
{
    public static void main(String[] args) 
    {
        //Create Scanner 
        Scanner scanner = new Scanner(System.in);

        //For Output
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        //Printing the User import name
        System.out.println("Hello," +name+ "!");

        scanner.close();
    }
}
