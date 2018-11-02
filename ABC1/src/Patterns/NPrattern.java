package Patterns;

public class NPrattern {
	public static void main(String args[]) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=6;j++) {
				if(j==1) {
					System.out.print("*");
				}
				
				else if(i==2 && j==3) {
					System.out.print("*");
					}
				else if(i==3 && j==4) {
					System.out.print("*");
					}
				else if(i==4 && j==5) {
					System.out.print("*");
					}
				else if(i==5 && j==6) {
					System.out.print("*");
					}
				else if(j==6) {
					System.out.print("*");
					}
				else
					System.out.print(" ");
					
			}
				System.out.println();
		}
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==3) {
					System.out.print("*");
				}
				else if(j==3) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}