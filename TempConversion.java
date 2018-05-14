public class TempConversion
{
	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(40)+" degrees fahrenheit");
		System.out.println(fahrenheitToCelsius(104)+" degrees celsius");
		System.out.println("");
		System.out.println(celsiusToFahrenheit(39)+" degrees fahrenheit");
		System.out.println(fahrenheitToCelsius(102.2)+" degrees celsius");
		System.out.println("");
		System.out.println(celsiusToFahrenheit(32)+" degrees fahrenheit");
		System.out.println(fahrenheitToCelsius(89.6)+" degrees celsius");
		
	}
	public static double celsiusToFahrenheit(double celsius)
	{
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	public static double  fahrenheitToCelsius(double fahrenheit)
	{
		double celsius = (5.0 / 9) * (fahrenheit- 32);
		return celsius;
	}
}