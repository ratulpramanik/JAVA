package Patterns;

public class tree {
		public static void main(String args[]) {
			int i,j,k;
			for(i=1;i<=3;i++) {
				for(k=1;k<=8;k++) {
					if(i==1 && (k==3||k==5)) {
						System.out.print("*");
					}
					else if (i==2 && (k==1||k==7)) {
						System.out.print("*");
					}
					else if (i==3 && (k==3||k==5)) {
						System.out.print("*");
					}
					else
					System.out.print(" ");
				}
				System.out.println();
			}
			for(i=1;i<=3;i++) {
				for(k=2;k>=1;k--) {
					System.out.print(" ");
				}
				for(j=1;j<=3;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
