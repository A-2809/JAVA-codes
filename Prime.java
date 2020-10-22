import java.util.Scanner;

class Prime{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=2;i<=(n/2)+1;i++) {
			if(n%i==0) {
				sum=1;
				break;
			}
			else;
			
			continue;
			
		}
		if(sum==0) {
			System.out.println(n+ " is a prime number.");
		}
		else{
			System.out.println(n+" is not a prime number.");
		}
	}

}
