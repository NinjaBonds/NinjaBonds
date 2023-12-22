package day_01;
import java.util.Scanner;
public class dayofweek {
	
    static int numbers;
    	
	static void dayofw(int numbers) {
		switch(numbers) {
		
		case 1:
			
		{
			System.out.println("sunday");
	        break;
		}	
		
		case 2:
		{	
							
		System.out.println("Monday");
	    break;
			
		}
		case 3:
		{	
			
			System.out.println("Tuesday");
		    break;
		}	
		
		case 4:
		{	
			
			System.out.println("Wednesday");
			break;
		}	
		
		case 5:
		{
			
			System.out.println("Thrusday");
			break;
			
		}
		case 6:
			
		{	
			System.out.println("Friday");
			break;
			
		}
		case 7:
		{	
			//day = "sunday" ;
			System.out.println("saturday");
			break; 
		}	
		default:
		{
			System.out.println( "invalid option");
			break;
		}
		}
		
		}
	
	
		
		public static void main(String[] args) {
			
			
			
			
			
			Scanner myobj = new Scanner(System.in);
			System.out.println("Enter number:");
			int numbers = myobj.nextInt();
			System.out.println(+numbers);
			dayofw(numbers);
			
			
			
			
		
	
			
	}

}
