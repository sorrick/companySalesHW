/*
 AUTHOR: Richard Soria
 DESCR:  Services.java works as a subclass of Account superclass
 		 that hold information for services and total sales of 
 		 services.
 */

package projectHW5;

public class Services extends Account {
		public int accountID;
		public double numberOfHours;
		public double ratePerHour;
		public int NumberOfItems;
		public double PricePerItem;
	
		public double Sale;
	

		@Override
		public void setAccountID() {
			accountID = 231;
		
		}
	
		public int getAccountID() {
			return accountID;
		}
		@Override
		public double getNumberOfHours() {
		
			return 34;
		}

		@Override
		public double getRatePerHour() {
		
			return 35.9;
		}

		@Override
		public int getNumberOfItems() {
			
			return 70;
		}

		@Override
		public double getPricePerItem() {
		
			return 330;
		}
	
		
		//Calculates total sales for services
		@Override
		public double CalculateSales() {
			Sale = numberOfHours * ratePerHour;
			return (getNumberOfHours() * getRatePerHour());
		}
		//Prints out info for services class and total sales of services
		public String toString() {
			return("\nAccountID: " + getAccountID() +"\nRate per hour: $" + getRatePerHour()
					+ "\nNumber of Hours: " + getNumberOfHours() 
					+ "\nTotal Services Sales: $ " + CalculateSales());
		}
	
	
	

}
