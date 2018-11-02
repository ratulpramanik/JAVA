import java.util.Scanner;
public class Swap1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no ");
		a=scan.nextInt();
		System.out.println("Enter 2nd no ");
		b=scan.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("1st no is "+a);
		System.out.println("2nd no is "+b);
	}

}
