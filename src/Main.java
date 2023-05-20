public class Main {
    public static void main(String[] args) {
        int priceticket;
        int pricemile;
        priceticket = 20_000;
        pricemile = 20;
        int mile = priceticket / pricemile;
        System.out.println("Начислено " + mile + " миль");
    }
}