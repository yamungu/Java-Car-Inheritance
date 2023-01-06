public class Ford extends Car {
    int year;
    int manufactureDiscount;

    public Ford(int year, int manufactureDiscount, int spd, double rgPrice, String color) {
        super(spd, rgPrice, color);

        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() - this.manufactureDiscount;
    }


}