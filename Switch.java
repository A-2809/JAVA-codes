import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello everyone!!!");
		System.out.println("Choose a number between 1-5:");
		Scanner s = new Scanner(System.in);
		int choose = s.nextInt();
		switch(choose)
		{
		case 1: System.out.println("you are great.");
				break;
		case 2: System.out.println("you are awesome.");
				break;
		case 3: System.out.println("you are so positive.");
				break;
		case 4: System.out.println("you are intelligent.");
				break;
		case 5: System.out.println("thanks for choosing this number.");
		  		break;
		default: System.out.println("INVALID INPUT");
				break;
		
		}
		System.out.println("Thanks.The end.");
	}

}
