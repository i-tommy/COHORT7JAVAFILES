import java.util.Scanner;

	public class ConverTemp{
	
	public static void main(String... args){
	
	Scanner Input = new Scanner(System.in);

	double farenheit;
	double celcius;

	System.out.print ("Enter temp in celcius ");
	celcius = Input.nextDouble();
	
	farenheit = 9.0/5.0 * celcius + 32;
	System.out.printf(" %.1f celcius is %.2f farenheit", celcius, farenheit);
}

}