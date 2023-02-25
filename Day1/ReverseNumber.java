package Day1;

import java.util.ArrayList;

public class ReverseNumber {
	
	static int rev(int n) {
		int digs = 0, sum = 0, dig = 0, point=0;
		int num = n;
		ArrayList<Integer> numArr = new ArrayList<>();
		while(num>0) {
			numArr.add(digs,num%10);
			num = num/10;
			digs++;
		}
		while(point<digs) {
			dig = numArr.get(point);
			//System.out.println(dig);
			sum = sum + dig*(int)Math.pow(10, digs-point-1);
			point++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 12481;
		System.out.println(rev(n));
		if(n==rev(n)) {
			System.out.println("It is a palindrome");
		}
		else
			System.out.println("It is not a palindrome");

	}

}
