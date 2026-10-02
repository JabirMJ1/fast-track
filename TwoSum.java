
import java.util.Scanner;
import java.util.HashMap;

public class TwoSum {
static Scanner scanner = new Scanner(System.in);
static HashMap<Integer, Integer> seen = new HashMap<>();

public static void twoSum(int[] numbers, int target) {
for (int i=0; i< numbers.length; i++){
int diff = target - numbers[i];
if(seen.containsKey(diff) && i != seen.get(diff)) {
System.out.println("number 1 " + numbers[seen.get(diff)] + ", number 2 " + numbers[i]);
}
else{
	seen.put(numbers[i], i);
}
		
		}
	}

		public static void main(String[] args) {
		System.out.println("how many numbers: ");
		int n = scanner.nextInt();
		System.out.println("Input the numbers: ");
		int[] numbers = new int[n];
		for (int i =0; i<n; i++){
		numbers[i]=scanner.nextInt();
		}
		System.out.println("Input the target: ");
		int target = scanner.nextInt();
		twoSum(numbers, target);}
}
