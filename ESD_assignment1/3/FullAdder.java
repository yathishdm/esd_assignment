import java.util.Scanner;

class FullAdder
{

	public static void main(String args[]){
		int a , b , cin , sum,cout=0,choice;
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.println("Enter the number a");
		a = sc.nextInt();
		System.out.println("Enter the number b");
		b = sc.nextInt();
		System.out.println("Enter the number cin");
		cin = sc.nextInt();

		/*----CORE LOGIC-----*/
		sum = (a+b+cin)%2;   
		cout = (a+b+cin)/2;
		/*-----LOGIC END-----*/
		
		System.out.println("The Sum is : "+sum);
		System.out.println("The Carry Out is : "+cout);
		System.out.println("Enter 1 if you want to continue with other inputs else enter 0");
		choice = sc.nextInt();
	}while(choice != 0);
	}
}

