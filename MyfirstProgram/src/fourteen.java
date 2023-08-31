public class fourteen{
    public static void main(String[] args){
        // //wherever the '%d is placed, the number will be printed there'
        // System.out.printf("%d This is a format string", 123);

        // //a bigger example
        int myInt = 10;
        double myDouble = 10000;
        char myChar = '@';
        boolean myBoolean = true;
        String myString = "Aryaman";

        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);
        // System.out.printf("%c", myChar);
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%s", myString);

        // total 10 string characters, left out will be space ' '
        // System.out.printf("Hello %10s", myString);
        // System.out.printf("Hello %-10s", myString); //left align

        //decimal precision
        //System.out.printf("You have: %.1f", myDouble);

        //add '+' to the front of the number
        // System.out.printf("You Have %+f", myDouble);

        // ',' at the thousands place
        System.out.printf("You Have %,f", myDouble);

    }
}