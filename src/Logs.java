/* Created by: Nicholas Brean
 * Created On: 2018-09-06
 * This program calculates amount of logs
 */

import java.util.Scanner;

public class Logs {
	public static void main(String args[]){
		//Getting User input
		Scanner UserInput = new Scanner(System.in);
		//Declare Variables
		double WoodLength;
		double amount;
		double weightcapcity;
		double weight;
		//Define Weight Capacity
		weightcapcity = 1100;
		//Telling User What to do
		System.out.println("Enter the size of wood you want between '0.25m' '0.50m' and '1m'");
		WoodLength = UserInput.nextDouble();
		//Calculating Weight of wood size
		weight = WoodLength * 20;
		amount = weightcapcity / weight;
		//Print amount
		System.out.println(amount);
		
				
	}
	
	

}
