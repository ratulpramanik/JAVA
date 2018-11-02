package Patterns;

public class ABCPrattern {
		public static void main(String args[]) {
			char c=65;
			int i,j;
			for(i=1;i<=5;i++) {
				for(j=1;j<=5;j++) {
					
					System.out.print((char)(c+i-1));//System.out.print(c)
				}
				//c++
				System.out.println(); 
			}
		}
}
//active the command line 10 and 12 and deactive the active line of 10.  