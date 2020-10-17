import java.util.Scanner;

public class no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the minutes: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int year = n/525600;
		int min = n % 525600;
		int day = min/1440;
		System.out.println(n+ " minutes has " +year+ " years and " +day +" days.");
	}

}
