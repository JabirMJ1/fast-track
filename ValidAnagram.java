import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ValidAnagram {
	
	
	static Scanner scanner = new Scanner(System.in);
	
	static String s;
	static String t;
	static Boolean fail = false;
	
	public static void validAnagram() {
	    	ArrayList<Character> matched = new ArrayList<>();
		System.out.println("Enter first string: ");
		s = scanner.nextLine().trim();
		
		System.out.println("Enter second string: ");
		t = scanner.nextLine().trim();
		
		if(s.trim().length() != t.trim().length()){
			System.out.println("false");
			return;
		}
		
		for (int i =0; i<s.length(); i++) {
			if(matched.contains(s.charAt(i))){
				continue;
			}
			
			matched.add(s.charAt(i));
			int count = 0;
			int count2 = 0;
			
			for (int j=0; j<s.length(); j++) {
				if(s.charAt(j) == s.charAt(i)){
					++count;
				}
				
				if(t.charAt(j) == s.charAt(i)){
					++count2;
				}
			}
			
			if(count != count2){
				fail = true;
				break;
			}
			
		} 
		
		if(fail == true){ 
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}

	}

 	public static void main(String[] args) {
 		validAnagram();

 	}   
}
