package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter Project: Mile to Kilometer and Kilometer to Mile Conversion");
        double miles = 10.0;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is " + kilometers + " kilometers");

        double kilometers2 = 16.0934;
        double miles2 = kilometersToMiles(kilometers2);
        System.out.println(kilometers2 + " kilometers is " + miles2 + " miles");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
