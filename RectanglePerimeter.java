import java.util.Scanner;
class RectanglePerimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter the width of rectangle: ");
		double width = sc.nextDouble();
		double Perimeter = 2*length*width;
		System.out.println("The perimeter of the rectangle is : "+Perimeter);
	}
}
