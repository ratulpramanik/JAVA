package Patterns;

public class Hosue {
		public static void main(String args[]) {
			int i,j,k;
			for(i=1;i<=5;i++) {
				for(k=1;k<=(5-i+1);k++) {
					System.out.print(" ");
				}
				for(j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=1;i<=5;i++) {
				for(j=1;j<=11;j++) {
					if(i==3 && (j==7||j==4||j==5||j==6||j==8))
					{
						System.out.print(" ");
					}
					else if(i==4 && (j==7||j==4||j==5||j==6||j==8))
					{
						System.out.print(" ");
					}
					else if(i==5 && (j==7||j==4||j==5||j==6||j==8))
					{
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
}
