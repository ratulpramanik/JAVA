package Strings;

public class Compare_by_references1 {
	public static void main(String args[]) {
		String s1="rama";  //......immutable String......
		String s2=new String("rama");  //......Mutable String......
		if(s1==s2) {
			System.out.println("References are equals");
		}
		else {
			System.out.println("References are  not equals");
		}
	}

}

//............Compare two String by References........
