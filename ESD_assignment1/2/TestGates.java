import java.util.Scanner;

public class TestGates
{
	
	public static void main(String[] args)
	{
		int option;
		Gates g = new Gates();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Choose your Option\n1)AND Operation\n2)OR Operation\n3)NOT Operation\n4)NAND Operation\n5)XOR Operation\n6)Exit");
			option = sc.nextInt();
			switch(option)
			{
				case 1:
					g.ANDlogic();
					break;
				case 2:
					g.ORlogic();
					break;
				case 3:
					g.NOTlogic();
					break;
				case 4:
					g.NANDlogic();
					break;
				case 5:
					g.XORlogic();
					break;
				case 6:
					System.out.println("You have successfully exited the Application");
					break;
				default:
					System.out.println("Please Choose a correct Option");
					break;
			
			}
		}while(option!=6);
	}
}
