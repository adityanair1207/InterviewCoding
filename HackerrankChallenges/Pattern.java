package HackerrankChallenges;

public class Pattern {

	public static void main(String[] args) {
		int n = 9;
        
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n/2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==0){
                System.out.println();
                continue;
            }
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0; i<n; i++) {
        	System.out.print("*");
        }
        System.out.println();
        
        for(int i=0; i<n/2; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int k=i; k<n/2-2; k++){
                System.out.print(" ");
            }
            if(i!=n/2-1)
            	System.out.print("*");
            
            for(int k=1; k<n/2-i-1; k++){
                System.out.print(" ");
            }
            if(i!=n/2-1)
            	System.out.println("*");
        }
	}
}
