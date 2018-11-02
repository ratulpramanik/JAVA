package Patterns;

public class JoinRNHeart {
	public static void main(String args[]) {
		int i,j;
		for(i=1;i<=7;i++) {
			for(j=1;j<=9;j++) {
				if((i==1) && (j==2||j==8)) {
					System.out.print("*");
				}
				else if((i==2) && (j==1||j==3||j==7||j==9)){
					System.out.print("*");
				}
				else if((i==3) && (j==1||j==5||j==9)){
					System.out.print("*");
				}
				else if((i==4) && (j==2||j==8)){
					System.out.print("*");
				}
				else if((i==5) && (j==3||j==7)){
					System.out.print("*");
				}
				else if((i==6) && (j==4||j==6)){
					System.out.print("*");
				}
				else if((i==7) && (j==5)){
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
	
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
		
		
		System.out.println();
		
		
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
		
		System.out.println();
		
		
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
	}
}