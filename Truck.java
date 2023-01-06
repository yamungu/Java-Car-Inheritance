public class Truck extends Car {

    int weight;

    public Truck(int weight, int spd, double rgPrice, String color) {
        super(spd, rgPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return 0.1;
        } else {
            return 0.2;
        }
    }
    
}