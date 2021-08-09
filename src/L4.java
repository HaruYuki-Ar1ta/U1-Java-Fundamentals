
public class L4 {

    public static void main(String[] args) {

        int value = 5 ;

        //Declare a variable stating the data type and identifier

        double total;
        String message = "Hi";
        final double GRAVITY = -9.8;

        //Assign a value

        total = 6;

        System.out.println(message + ", the value is "+ total);
        //Reuse do not need to declare

        total = 10;
        message = "Bye";
        //GRAVITY = -10; --Tiss is bad

        System.out.println(message + ", the value is "+ total);
    }
}
