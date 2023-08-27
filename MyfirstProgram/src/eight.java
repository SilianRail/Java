import java.util.Scanner;
public class eight {
    public static void main(String[] args){

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Your Playing a Game!, press q or Q to quit");
        // String response = scanner.next();
        // //this part is only important
        // if(response.equals("q") || response.equals("Q")){
        //     System.out.println("You Quit the Game!");
        // }
        // else{
        //     System.out.println("Your still playing");
        // }
        // scanner.close();

        //do while loop?
        
        Scanner scanner = new Scanner(System.in);
        String name;
        do{
            System.out.print("Name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        //other loops discussed, not really that important
    }
}
