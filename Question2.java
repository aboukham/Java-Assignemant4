import java.text.DecimalFormat;
import java.util.Scanner;


public class CoffeeBag {

	/**
	 * @param args
	 */
	final static double PRICE_PER_POUND = 5.99;
	final static double SALES_TAX = 7.25;
	
	public static void main(String[] args) {
		int				weightBag;
		int				numberOfBags;
		double			totalPrice;
		Scanner			input;
		DecimalFormat	df;

		System.out.println("Enter the unit weight of a bag in pounds:");
		input = new Scanner(System.in);
		weightBag = input.nextInt();
		System.out.println("Enter the number of bags sold:");
		input = new Scanner(System.in);;
		numberOfBags = input.nextInt();
		df = new DecimalFormat("0.00");
		totalPrice = CoffeeBag.totalPrice(weightBag, numberOfBags);
		System.out.println("Number of bags sold: " + numberOfBags);
		System.out.println("     Weight per bag: " + weightBag + " lb");
		System.out.println("    Price per pound: $" + PRICE_PER_POUND );
		System.out.println("          Sales tax: " + SALES_TAX + "%");
		System.out.println("\n        Total price: $ " + df.format(totalPrice));
	}
	
	public static double totalPrice(int weightBag, int numberOfBags){
		double totalPrice;
		double taxOfPrice;
		
		totalPrice = weightBag * numberOfBags * PRICE_PER_POUND;
		taxOfPrice = totalPrice * SALES_TAX / 100;
		return (totalPrice + taxOfPrice);
	}
}
