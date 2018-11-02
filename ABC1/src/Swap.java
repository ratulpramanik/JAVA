import java.util.Scanner;
class Swap{
	public  static void main(String args[]) {
		int a,b;
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter 1st no");
		 a=scan.nextInt();
		 System.out.println("Enter 2nd no");
		 b=scan.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("1st value is "+a);
		 System.out.println("2nd value is "+b);
		 
	}
}


            /* <------Swap two number using two variables.----->*/