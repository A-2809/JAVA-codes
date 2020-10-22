import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,l;
		System.out.print("Enter the value upto which you want fibinicco series: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int k=0;k<n;k++) {
			l=i+j;
			i=j;
			j=l;
			System.out.println(l);
		}
	}

}
