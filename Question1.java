import java.util.Scanner;


public class WeightConverter {

	/**
	 * @param args
	 */
	public static double objectGravityOfEarthGravity;
	public WeightConverter(double d) {
		objectGravityOfEarthGravity = d;
	}

	public static void main(String[] args) {
		WeightConverter moonWeight;
		double newWeight;
		
		moonWeight = new WeightConverter(0.167);
		newWeight = moonWeight.convert(160);
		System.out.println(newWeight);
	}
	
	public double convert(double weight_on_earth){
		return (weight_on_earth * objectGravityOfEarthGravity);
	}

}
