import java.util.Scanner;

public class TempratureConverter {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Temprature Converter.\n");
		
		//open scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		//user input and output
		while(!choice.equalsIgnoreCase("n")) {
			System.out.println("Enter degrees in Fahrenheit:  ");
			double temp = sc.nextDouble();
			double convertedTemp = (temp-32)*5/7; 
			System.out.println("Degrees in Celsius:  "+(double)convertedTemp);
		}

	}

}
