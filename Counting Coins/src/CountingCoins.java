import sun.misc.PostVMInitHook;

public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */
    public static void main(String[] args) {
        double rawChange = 0.66 * 1000999;

        //CASTING IS FORCING THE COMP TO ACCEPT A CERTAIN DATA TYPE

        int change = (int)(rawChange * 100);

        int numQuarters = change / 25;
        change = change % 25;

        int numDime = change / 10;
        change = change % 10;

        int numNickel = change / 5;
        int numPennies = change % 5;

        System.out.println("The number of coins to get $" + rawChange);
        System.out.println(" Quarters : " + numQuarters);
        System.out.println(" Dimes : " + numDime);
        System.out.println(" Nickels : " + numNickel);
        System.out.println("Pennies : " + numPennies);





    }



}
