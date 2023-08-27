import javax.swing.JOptionPane;
public class four_gui {
    public static void main(String [] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        //showInputDialog would return us string method however, we want 
        //our age input to be an integer. so, to convert the string to integer,
        //we use the parseInt() method.
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
