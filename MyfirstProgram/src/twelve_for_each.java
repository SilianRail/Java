import java.util.ArrayList;
public class twelve_for_each {
    public static void main(String[] args){
        //for each loop
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cheetah");
        animals.add("panda");
        animals.add("monkey");

        for(String i : animals){
            System.out.println(i);
        }

        // String[] animals = {"cat", "dog", "rat", "bird"};
        // for(String i : animals){
        //     System.out.println(i);
        // }
    }
}
