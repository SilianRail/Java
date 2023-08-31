//note that fish impliments both prey and predeator
public class Fish implements Prey, Predeator{
    @Override
    public void flee(){
        System.out.println("This fish is hunting");
    }
    @Override
    public void hunt(){
        System.out.println("This fish is fleeing");
    }
}
