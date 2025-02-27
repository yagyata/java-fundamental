import java.util.Scanner;
class CylinderVolume{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder: ");
		double radius = sc.nextDouble();
		System.out.print("Enter the height of cylinder: ");
		double height = sc.nextDouble();
		double volume = Math.PI*radius*radius*height;
		System.out.println("The volume of cylinder is "+volume);
	}
}
