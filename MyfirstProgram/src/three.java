import java.util.Scanner;
public class three {
    public static void main(String [] args){

        int var;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a no. ");
        var = scanner.nextInt();
        //casting integer to double
        double var_new= (double)var /3;
        System.out.println(var + "/ 3= " + var_new);
    }
}
