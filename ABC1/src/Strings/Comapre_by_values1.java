package Strings;

public class Comapre_by_values1 {
	public static void main(String args[]) {
		String s1="rama";  //......immutable String......
		String s2=new String("rama");  //......Mutable String......
		if(s1.equals(s2)) {
			System.out.println("Strings are equals");
		}
		else {
			System.out.println("Strings are not equals");
		}
	}
}


//............Compare two String by Values........