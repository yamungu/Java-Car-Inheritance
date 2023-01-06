public class Sedan extends Car {

    int length;

    public Sedan(int length, int spd, double rgPrice, String color) {
        super(spd, rgPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(this.length > 20) {
            return super.getSalePrice() * 0.05;
        } else {
            return super.getSalePrice() * 0.1;
        }
    }
}