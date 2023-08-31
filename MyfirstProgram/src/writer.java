import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("/Users/aryaman_bahuguna/Documents/Job/JAVA/Java/MyfirstProgram/src/text_message.txt");
            myFile.write("Roses are Red\nViolets are Blue\nsomething something\nrock n' roll\n");
            myFile.append("written by Rayman");
            myFile.close();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
