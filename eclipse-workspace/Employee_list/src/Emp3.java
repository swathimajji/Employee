
import java.util.Scanner;
public class Emp3 {

	// TODO Auto-generated method stub
		 int empid;
		 String Firstname;
		 String Lastname;
		 
		 public void getInput() {
			  Scanner in = new Scanner(System.in);  // Create a Scanner object

		  System.out.print("Enter the empid :: ");
		  empid = in.nextInt();
		  System.out.print("Enter the Firstname :: ");
		  Firstname= in.next();
		  System.out.print("Enter the Lastname :: ");
		  Lastname= in.next();
		 }
		 
		 public void display() {
		  
		  System.out.println("Employee id = " + empid);
		  System.out.println("Employee name = " + Firstname);
		  System.out.println("Employee salary = " + Lastname);
		 }
		 
		 public static void main(String[] args) {
		 
			 Emp3 e[] = new Emp3[3];
		  
		  for(int i=0; i<3; i++) {
		   e[i] = new Emp3();
		   e[i].getInput();
		  }
		  
		  System.out.println("**** Data Entered as below ****");
		  
		  for(int i=0; i<3; i++) {
		   
		   e[i].display();
		  }
		 }		

	}


