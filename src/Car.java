public class Car {
    private String brand;
    private int miles;
    private int price;

    Car(){
        this.brand = "empty";
        this.miles = -1;
        this.price = -1;

    }
    Car(String brand, int miles, int price){
        this.brand = brand;
        this.miles = miles;
        this.price = price;
    }
    Car(Car c1){
        this.brand = c1.brand;
        this.miles = c1.miles;
        this.price = c1.price;

    }
    public void printMe(){
        System.out.println(this.brand + " " + this.miles + " " + this.price);
    }
    public void setBrand(String brand){
        this.brand = brand;

    }
}
