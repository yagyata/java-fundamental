import java.util.Scanner;
class KilometerToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in Kilometers: ");
		double kilometer = sc.nextDouble();
		double miles = kilometer*0.621371;
		System.out.println("Total distance in miles is: "+miles);
	}
}
