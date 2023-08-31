
import java.io.File;
public class file {
    public static void main(String[] args) {
        File myFile = new File("/Users/aryaman_bahuguna/Documents/Job/JAVA/Java/MyfirstProgram/src/text_message.txt");

        if(myFile.exists()){
            System.out.println("This file exists! :O");
            System.out.println(myFile.getPath());
            System.out.println(myFile.getAbsolutePath());
            System.out.println(myFile.isFile());
            myFile.delete();
        }
        else{
            System.out.println("This file doesn't exits! :(");
        }
    }
}
