package day_01;

import java.util.Scanner;

public class salary {
	
static double basic;
static double boa;
static double bonus;
static double pf;
static double monthlygr;
static double yearlygr;
static double yearlytax;
static double monthlytax;
static double monthlytkhm;

double calcpf() {
	
	    pf = (basic*0.12);
		
		return pf;
}
	

double monthlygrs(double basic,double boa,double bonus,double pf) {
	 
	 monthlygr=(basic+boa+bonus)-pf;
	
	return monthlygr;
		}

double yearlygr() {
	
	yearlygr=(monthlygr*12);
	
	return yearlygr;
		}

double yearlytx() {
	if ( basic == 7000){
	
	 yearlytax=(yearlygr*0.015); 
	
	return yearlytax;
		}
	else if (basic == 10000) {
		
		yearlytax=(yearlygr*0.05);
		
		return yearlytax;
	}
	else if(basic == 12000) {
			
			yearlytax=(yearlygr*0.10);
			
			return yearlytax;
		}
	else
	{
		yearlytax=(yearlygr*0.20);
		
		return yearlytax;
	}
	}
	


double monthlytx() {
	
	
	 monthlytax=(yearlytax/12);
	
	return monthlytax;
		}

double monthlytk() {
	
	
	monthlytkhm=(monthlygr-monthlytax);
	
	return monthlytkhm;
		}

public static void main(String[] args) {
	
	Scanner myobj = new Scanner(System.in);
	
	System.out.println("Enter basic salary:");
    double basic = myobj.nextInt();
	
	System.out.println("Enter Boa:");
	double Boa = myobj.nextInt();
	
	System.out.println("Enter Bonus:");
	double bonus = myobj.nextInt();
	
	salary obj1=new salary();
    obj1.calcpf();
	obj1.monthlygrs(basic,Boa,bonus,pf);
	obj1.yearlygr();
	obj1.yearlytx();
	obj1.monthlytx();
	obj1.monthlytk();
	
	System.out.println("Monthly gross" + monthlygr);
	System.out.println("yearly gross" + yearlygr);
	System.out.println("yearly tax" + yearlytax);
	System.out.println("Monthly tax" + monthlytax);
	System.out.println("Monthly take home" + monthlytkhm);
 }
 
 
		
		
		
}

