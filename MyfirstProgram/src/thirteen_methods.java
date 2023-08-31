import java.util.Scanner;
public class thirteen_methods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Name: ");
        String name = scanner.nextLine();
        hello(name);

        System.out.print("x= ");
        int x = scanner.nextInt();
        System.out.println("y= ");
        int y = scanner.nextInt();
        System.out.println(sum(x,y));
    }

    static void hello(String name){
        System.out.println("hello " + name);
        return;
    }

    static int sum(int a, int b){
        return (a+b);
    }
}
