public class fifteen_oop {
    public static void main(String[] args){
        // //a replacement to const in java
        // final double pi = 3.14159;
        // System.out.println(pi);


        Car myCar = new Car("Chevrolet", 2020, 157000);
        System.out.println(myCar.model);
        System.out.println(myCar.price);
        System.out.println(myCar.year);

        Car myCar2 = new Car();
        System.out.println(myCar2.model);
        System.out.println(myCar2.price);
        System.out.println(myCar2.year);
    }
}

