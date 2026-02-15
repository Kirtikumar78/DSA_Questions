public class TemperatureConverter {
    public static void convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
    public static void main(String[] args) {
        convertTemperature(25);
    }
}
