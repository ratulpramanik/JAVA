package Patterns;

public class RPrattern {
	public static void main(String args[]) {
		int i,j;
		for(i=1;i<=3;i++) {
			for(j=1;j<=5;j++) {
				if((i==2) && (j==2||j==3||j==4)) {
					System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(i=1;i<=3;i++) {
			for(j=1;j<=5;j++) {
				if((i==1) && (j==2||j==4||j==5)) {
					System.out.print(" ");
				}
				else if((i==2) && (j==2||j==3||j==5)) {
					System.out.print(" ");
				}
				else if((i==3) && (j==2||j==3||j==4)) {
					System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			
			System.out.println();
		}
		}
	}


