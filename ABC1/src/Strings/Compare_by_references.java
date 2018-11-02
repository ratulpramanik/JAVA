package Strings;

public class Compare_by_references {
	public static void main(String args[]) {
		String s1="rama";  //......immutable String......
		String s2="rama";  //......immutable String......
		if(s1==s2) {
			System.out.println("References are equals");
		}
		else {
			System.out.println("Referencs are not equals");
		}
	}

}

//............Compare two String by References........