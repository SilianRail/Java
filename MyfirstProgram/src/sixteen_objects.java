public class sixteen_objects {
    public static void main(String[] args) {
        //overriding toString method
        // Car myCar = new Car();
        // System.out.println(myCar.toString());

        Car[] myNewCar = new Car[3];
        Car car1 = new Car("Corvette", 2030, 140000);
        Car car2 = new Car("Chevy", 2020, 10000);
        Car car3 = new Car("Cally", 2002, 1400);

        myNewCar[0] = car1;
        myNewCar[1] = car2;
        myNewCar[2] = car3;

        System.out.println(myNewCar[0].toString());
    }
}
