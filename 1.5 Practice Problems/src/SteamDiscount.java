public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double priceOriginal = 60.00;
        int _discount = .20;
        final DISCOUNT = _discount*100;
        double discountPrice = priceOriginal * discount;
        double priceAfter = priceOriginal - discountPrice;

        System.out.println(priceOriginal);
        System.out.println(discount);
        System.out.println(discountPrice);
        System.out.println(priceAfter);
    }
}
