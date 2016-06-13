/*Joshua Tucker
 * This is a RainFall calculator
 */
import java.util.Scanner;
public class RainFallCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Takes user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length of your roof in feet");
		int length = keyboard.nextInt();
		
		System.out.print("Enter the width of your roof in feet");
		int width = keyboard.nextInt();
		
		System.out.println("Enter the amount of rainfall in inches");
		int rainfall=keyboard.nextInt();
		//calls method to calculate rainfall
		int rain = CalcRainfall(length, width, rainfall);
		System.out.println(rain + " Galloons of rain runs off your roof");
	}
	//method that  calculates rainfall
	public static int CalcRainfall ( int l,int w,int r){	
	//converts feet to inches and gives area
	int area= (l*12)*(w*12);
	//calculates cubic inches of rain
	int cubicRain= area*r;
	//calculates gallons of rain
	int rainAmount= cubicRain/231;		
		
		return rainAmount;
	}

}
