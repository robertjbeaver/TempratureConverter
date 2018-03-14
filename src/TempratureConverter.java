import java.util.Scanner;
import java.text.NumberFormat;

public class TempratureConverter {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Temprature Converter.\n");
		
		//open scanner and init NumberFormat
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		
		//user input and output
		while(!choice.equalsIgnoreCase("n")) {
			System.out.print("Enter degrees in Fahrenheit:  ");
			double temp = sc.nextDouble();		
			double convertedTemp = (temp-32)*5/7;			
            String convertedTempFormat = number.format(convertedTemp); 
			System.out.println("Degrees in Celsius:  " + convertedTempFormat);			
			System.out.print("Continue? (y/n): ");
            choice = sc.next();
		}
		System.out.println("Bye!");
	}

}
