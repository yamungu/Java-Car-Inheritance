public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(22, 80, 4000.00, "blue");
        Ford ford_range = new Ford(2022, 1000, 200, 50000, "Black");

        System.out.println(sedan.getSalePrice());
        System.out.println(ford_range.getSalePrice());
    }
}