import java.util.InputMismatchException;
import java.util.Scanner;
public class e_handling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a whole number ");
            int x = scanner.nextInt();
            System.out.print("Enter a whole number ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println(x + " / " + y + " = " + z);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divide by zero! :(");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid stuff");
        }
        catch(Exception e){
            System.out.println("something's weird");
        }
        finally{
            System.out.println("This will print always!");
            scanner.close();
        }
    }
}