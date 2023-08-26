import java.util.Scanner;
public class two {
    public static void main(String [] args){
        //swapping two variables
        int x =5, y = 7;
        System.out.println("x= " + x + ", y= " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x= " + x + ", y= " + y);

        //accepting user input in java
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("you're " + age + " years old");
        System.out.println("Your fav. food is " + food );
        
    }
}
