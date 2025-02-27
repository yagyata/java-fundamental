import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter Rate of Interest: ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time (in years): ");
		int time = sc.nextInt();
		double SI = principal*rate*time/100;
		System.out.println("The Simple Interest is: "+SI);
	}
}
