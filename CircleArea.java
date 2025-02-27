import java.util.Scanner;
class CircleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double pi = Math.PI;
		double area = pi*radius*radius;
		System.out.println("The area of Circle is "+area);
	}
}
