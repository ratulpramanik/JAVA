package Patterns;

public class face {
		public static void main(String args[]) {
			int i,j;
			for(i=1;i<=6;i++) {
				for(j=1;j<=9;j++) {
					if(j==1) {
						System.out.print(" ");
					}
					else if(i==1||i==6) {
						System.out.print("-");
					}
					else if(i==2 &&(j==4 ||j==7)) {
						System.out.print("^");
					}
					else if(i==3 &&(j==4 ||j==7)) {
						System.out.print("0");
					}
					else if(i==4 &&(j==5||j==6)) {
						System.out.print("!");
					}
					else if(i==5 &&(j==7||j==4||j==5||j==6)) {
						System.out.print("~");
					}
					else
						System.out.print(" ");
				
				if(j==1||j==9) {
					System.out.print("|");
				}
				else
				{
					System.out.print(" ");
				}
				}
				System.out.println();
			}
			for(i=1;i<=3;i++) {
				for(j=1;j<=7;j++) {
					System.out.print(" ");
				}
				System.out.print("|||||");
				System.out.println();
			}
		}
}
