public class Car {
    String model;
    int year;
    double price;
    //static variable
    static int num;

    Car(String m, int y, double p){
        model = m;
        year = y;
        price = p;
        num++;
    }
    Car(){
        model = "N/A";
        year = 0000;
        price = 0;
    }
    public String toString(){
        String myString = model + "\n" + price + "\n" + year;
        return myString;
    }

    //static method
    static void displayNum(){
        System.out.println("There exist " + num+ " cars");
    }
}
