public class Car {

    int speed;
    double regularPrice;
    String color;
    
    public Car(int spd, double rgPrice, String color) {
        this.speed = spd;
        this.regularPrice = rgPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return this.regularPrice;
    }
}