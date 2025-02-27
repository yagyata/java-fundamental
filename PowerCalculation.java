import java.util.*;
class PowerCalculator{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		double base = sc.nextInt();
		System.out.print("Enter the exponent: ");
		double exponent = sc.nextInt();
		double power = Math.pow(base, exponent);
		System.out.println("The result is: "+power);
	}
}
