import java.util.Scanner;
 public class Employees 
{						int year;
						String name;
 						//float salary;
 						String address;
 
 						public void getInput() 
						 
						 {			  Scanner in = new Scanner(System.in);
						 			  System.out.print("Enter the name :: ");
						 			  name = in.next();			  
						 			  System.out.print("Enter the year :: ");
	  								  year = in.nextInt();
									 // System.out.print("Enter the salary :: ");
	  								  //salary = in.nextFloat();
	  								  System.out.print("Enter the address :: ");
	 								  address = in.next();
    					 }
 
						 public void display() 

						 {			  System.out.print(name);
						 			  System.out.print("      ");
    								  System.out.print(year);
    								  System.out.print("       ");
  									  System.out.print(address);
  									  System.out.print("         ");
						 }
 
						 public static void main(String[] args) 
						 
						 {				 Employees e[] = new Employees[3];
  
 										 for(int i=0; i<3; i++) 

 										 {		e[i] = new Employees();
  											    e[i].getInput();
  										 }
  
  									  System.out.println("** OUTPUT **");
  
  									System.out.println("NAME    Year of joining    Address"); 
  									  for(int i=0; i<3; i++) 

  										 {		e[i].display();
  										 		System.out.print(" ");
  										 		System.out.println( );
 										 }
  										 
	  					  }

}