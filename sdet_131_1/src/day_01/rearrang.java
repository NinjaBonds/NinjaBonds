package day_01;

public class rearrang {

	public static void main(String args[]) {
		 String s = "aab";
	      int C = 0;
	      for (int i=0;i<s.length();i++)
	      {   
	    	 
	         char b;
	         char d;
	         b = s.charAt(i);
	         d = s.charAt(i+1);
	         if (b != d) {

	          C = C + 1;
	                     }
	      }
	      System.out.println(C); 
	      }

	}


