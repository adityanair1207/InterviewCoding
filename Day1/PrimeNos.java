package Day1;

public class PrimeNos {
	
	static void primeFact(int n) {
		if(n==2)
			System.out.print(n);
		int flag = 0;
		for(int i=2; i<=n; i++) {
			flag = 0;
			if(n%i==0) {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						flag = 1;
					}
				}
				if(flag==0)
					System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		primeFact(23);

	}

}
