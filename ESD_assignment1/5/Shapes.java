import java.util.Scanner;

interface Shapes{
	public double area();
	public double add();
}

class Square implements Shapes{
	Scanner sc = new Scanner(System.in);
	double side;
	public double area(){
		System.out.println("Enter the length of the square");
		side = sc.nextDouble();
		return side*side;
	}
	public double add(){
		return 0;
		}
}

class Rectangle implements Shapes{
	public double area(){
		System.out.println("Enter the length of the rectangle");

		System.out.println("Enter the length of the rectangle");
		return 0;
	}
}