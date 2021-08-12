public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {
        double speed = 55.0 ;
        double minutes = 45.0;
        double distance = speed * minutes;

        String outputMessage = " Traveling at a speed of " + speed + " Mph for " + minutes + " minutes";

        System.out.println( outputMessage );
        System.out.println(" Your distance is : " + distance);





    }
}
