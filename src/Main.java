public class Main {
    public static void main(String[] args) {


        Car c1 = new Car();
        Car c2 = new Car("Honda", 50000, 20000);
        Car c3 = new Car(c2);


        c3.setBrand("Chevy");
        Car c4 = new Car(c3);

        c1.printMe();
        c2.printMe();
        c3.printMe();
        c4.printMe();
    }
}