public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */

    public static void main(String[] args) {
        int oriNum = 4359701;
        int numHours = oriNum / 3600 ;
        int num2 = oriNum % 3600;
        int numMinutes = num2 / 60 ;
        int numSeconds =  num2 % 60;

        System.out.println(numHours);
        System.out.println(numMinutes);
        System.out.println(numSeconds);



    }





}
