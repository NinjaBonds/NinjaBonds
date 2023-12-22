package day_01;
import java.util.Scanner;

public class leapyear {

	static int year;
	
	static void checkyear(int year) {
		for(year=2000;year<=2100;year++) {
		int yearss=year%4;
		if(yearss == 0)
				{
			System.out.println("This is Leap year"+year);
				}
		else 
		{	
			System.out.println("this is not leap year"+year);
			}
		}
				}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner myobj = new Scanner(System.in);
	//	System.out.println("Enter year:");
	//	int year = myobj.nextInt();
		
		checkyear(year);
		
		
	}

}
