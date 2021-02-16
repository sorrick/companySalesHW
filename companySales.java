/*
 AUTHOR: Richard Soria
 DESCR:  companySales.java works as a test for all classes
 		 that prints out info for Supplies and Services 
 		 and prints out total sales for both classes.
 */

package projectHW5;

public class companySales {

	public static void main(String[] args) {
		Account[] s = new Account[3];
		int n;
		
		for(int i = 0; i < s.length; i++) {
			n = (int) (Math.random() * 2);
			
			
			switch(n) {
			case 0:
				//New supply object
				s[i] = new Supplies();
				break;
			
			case 1:
				//New servies object
				s[i] = new Services();
				break;
			
			}
			
			s[i].setAccountID();
			s[i].CalculateSales();
		}
		//Prints out every object in array object
		for (int i = 0; i < s.length; i ++) {
			System.out.println(s[i].toString());
		}

	}

}
