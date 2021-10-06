import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
	

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the age");
	    int age = myObj.nextInt();
	    System.out.println(age);
	    
	    if (age >= 18)
	    {
	    	System.out.println("Major");
	    }
	    
	    else
	    {
	    	System.out.println("Minor");
	    }
	    //WRITE A PROGRAM TO CHECK IF THE ENETERED AGE IS MAJOR OR NINOR

	}

}

