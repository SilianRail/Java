import java.util.Scanner;
public class five {
    public static void main(String[] args){
       //making a program to find the hypotemuse
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("x= ");
        x = scanner.nextDouble();
        System.out.print("y= ");
        y = scanner.nextDouble();

        z = Math.sqrt(x*x + y*y);
        System.out.println("the hypotemuse is= " + z );

        scanner.close();
    }
}
