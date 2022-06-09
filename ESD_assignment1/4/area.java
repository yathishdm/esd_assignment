import java.util.Scanner;
class Shapes{
	public double area()
	{
		System.out.println("Function to print the area of the desired shape");
		return 0;
	}

	public String toString()
	{
		return "Parent class of various shapes";
	}
}

class Circle extends Shapes{
		double r;
		Scanner sc = new Scanner(System.in);
		@Override
			public String toString(){
				return "The area of the circle is";
			}
		@Override
		public double area(){
			System.out.println("Enter the radius of the circle");
			r = sc.nextDouble();
			System.out.println(toString());
			return 3.14*r*r;
		}
	}

class Rectangle extends Shapes{
		double a,b;
		Scanner sc = new Scanner(System.in);
		@Override
			public String toString(){
				return "The area of the rectangle is";
			}
		@Override
		public double area(){
			System.out.println("Enter the length of the rectangle");
			a = sc.nextDouble();
			System.out.println("Enter the breadth of the rectangle");
			b = sc.nextDouble();
			System.out.println(toString());
			return a*b;
		}
	}

class Square extends Shapes{
		double a;
		Scanner sc = new Scanner(System.in);
		@Override
			public String toString(){
				return "The area of the square is";
			}

		@Override
		public double area(){
			System.out.println("Enter the side dimension of the square");
			a=sc.nextDouble();
			System.out.println(toString());
			return a*a;

		}
	}