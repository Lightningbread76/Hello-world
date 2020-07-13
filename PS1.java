
public class PS1 {
	//Problem 7
	public static void printVertical(String s){
		for(int i = 0; i<s.length();i++) {
			System.out.println(s.substring(i,i+1));
		}
	}
	public static void printWithSpaces(String s) {
		for(int i = 0;i < s.length();i++) {
			System.out.print(s.substring(i,i+1));
			System.out.print(" ");
		}
	}
	public static char middleChar(String s) {
		int m = (s.length()-1) / 2;
		return s.charAt(m);
	}
	public static String moveToEnd(String s, int i) {
		if (i > s.length()) {
			return s;
		}
		else {
		String newS = s.substring(i, s.length()) + s.substring(0,i);
		return newS;
		}
	}
	//Problem 8
	public static void printDecreasing(String s) {
		for(int i = 0;i<s.length();i++) {
			System.out.println(s.substring(i));
		}
	}
	public static String firstAndLast(String s) {
		return s.substring(0,1)+s.substring(s.length()-1);
	}
	public static int lastIndexOf(String s, char c) {
		int x = 0;
		int count = 0;
		for(int i = s.length()-1;i > 0;i--) {
			if(s.charAt(i) == c) {
				x = i;
			}
			else {
				count++;
			}
		}
		if (count == s.length()-1) {
			return -1;
		}
		else {
		return x;
		}
	}
	public static String repeat(String s, int n) {
		String newS = "";
		for(int i = 0;i<n;i++) {
			newS = newS+s;
		}
		return newS;
	}
	
	public static void main(String[] args) {
		printVertical("Hello");
		printWithSpaces("Method");
		System.out.println("");
		System.out.println(middleChar("Computers"));
		System.out.println(moveToEnd("Kevin",3));
		System.out.println(moveToEnd("Kevin",6));
		printDecreasing("Kevin");
		System.out.println(firstAndLast("Kevin"));
		System.out.println(lastIndexOf("abcde",'e'));
		System.out.println(lastIndexOf("abcde",'f'));
		System.out.println(repeat("daddy!",3));
		
	}
}
