package day_01;

import java.util.Scanner;
public class student {
	
	int maths;
	int science;
	int english;
	int socials;
	int total;
	
	int totals(int maths,int science,int english,int socials)
	{
		total = (maths + science + english + socials);
		
		System.out.println(total);
		
		return total;
		}
	
	int average()
	{
		int avergemk = (total/4);
		
		System.out.println(avergemk);
		
		return avergemk;
	}
	
	public static void main(String[] args) {
		
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter maths Marks:");
		int maths = myobj.nextInt();
		
		System.out.println("Enter english Marks:");
		int english = myobj.nextInt();
		
		System.out.println("Enter science Marks:");
		int science = myobj.nextInt();
		
		System.out.println("Enter socials Marks:");
		int socials = myobj.nextInt();
		
			
		student obj1 = new student(); 
				
		System.out.println("total :");		
		
		obj1.totals(maths,english,science,socials);
		
		System.out.println("Average :");
	    obj1.average();
	    
	}
	
}
