import java.util.Scanner;

interface LogicGates{
	public void ANDlogic();
	public void ORlogic();
	public void XORlogic();
	public void NOTlogic();
	public void NANDlogic();
}

class Gates implements LogicGates{

	unsigned int a , b , c;
	Scanner sc = new Scanner(System.in);
	public void ANDlogic(){
		System.out.println("Enter the two numbers you want to perform a Bitwise AND operation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a & b;
		System.out.println(c);
	}

	public void ORlogic(){
		System.out.println("Enter the two numbers you want to perform a Bitwise AND operation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a | b;
		System.out.println(c);
	}

	public void NANDlogic(){
		System.out.println("Enter the two numbers you want to perform a Bitwise AND operation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = ~(a&b);
		System.out.println(c);
	}

	public void XORlogic(){
		System.out.println("Enter the two numbers you want to perform a Bitwise AND operation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a^b);
		System.out.println(c);
	}

	public void NOTlogic(){
		System.out.println("Enter the number you want to perform a Bitwise NOT operation");
		a = sc.nextInt();
		c = ~a;
		System.out.println(c);
	}

}

