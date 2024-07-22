package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter Project: Mile to Kilometer and Kilometer to Mile Conversion");
        double miles = 10.0;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
