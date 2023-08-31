public class seventeen_static {
    public static void main(String[] args) {
        //use of static type
        Car car1 = new Car("chevy", 2020, 14000);
        Car car2 = new Car("levy", 2020, 14000);
        Car car3 = new Car("pevy", 2020, 14000);

        System.out.println(Car.num);
        Car.displayNum();
    }
}
