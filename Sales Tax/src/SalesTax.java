public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */
    public static void main(String[] args) {

        //declare and initialize variables
        double price = 9.99 ;
        int quantity = 6 ;
        double _tax = 7;
        final double  TAX = _tax/100.0;

        //calculations
        double subTotal = quantity * price;
        double taxTotal = subTotal * TAX;
        double total = subTotal + taxTotal;

        System.out.println("you bought " + quantity + " shirts for " + price + " per shirt.");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + taxTotal);
        System.out.println("Total " + total);

        //DISCOUNTS AND INCREASES

        //FORMULA: AMOUNT * (1 +/- PERCENTAGE) = TOTAL



    }
}
