package Patterns;

public class Pallogram2 {
		public static void main(String args[]){
			int i,j,k;
			for(i=5;i>=1;i--) {
				for(k=1;k<=i;k++){
					System.out.print(" ");
				}
				for(j=1;j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}
