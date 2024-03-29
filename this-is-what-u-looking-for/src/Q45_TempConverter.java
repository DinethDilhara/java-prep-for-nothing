public class Q45_TempConverter {

/*
    45. Write a Java program to convert temperature from Celsius to Fahrenheit using a method.
*/

    public static void main(String[] args) {

        double fahrenheit = convertCelsiusToFahrenheit(36);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        // Formula: (Celsius * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }
}

