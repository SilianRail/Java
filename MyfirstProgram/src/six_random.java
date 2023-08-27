import java.util.Random;
public class six_random {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        System.out.println(y);
        System.out.println(x);
    }
}
