/*
 AUTHOR: Richard Soria
 DESCR:  Supplies.java returns the account ID along with 
  		 total supply sales.
 */

package projectHW5;

public class Supplies extends Account{
		public int accountID;
		public double numberOfHours;
		public double ratePerHour;
		public int NumberOfItems;
		public double PricePerItem;
		public double suppliesSale;
		
		@Override
		void setAccountID() {
			accountID = 133;
			
		}
		
		int getAccountID() {
			return accountID;
		}
		@Override
		double getNumberOfHours() {
			
			return 25.5;
		}

		@Override
		double getRatePerHour() {
			
			return 15.75;
		}

		@Override
		int getNumberOfItems() {
			
			return 570;
		}

		@Override
		double getPricePerItem() {
			
			return 234;
		}
		
		//Calculates the total sales for the supplies subclass
		@Override
		double CalculateSales() {
			return (getNumberOfItems() * getPricePerItem());
		}
		
		//Prints out account ID, price per item, and total sales of supplies
		public String toString() {
			return("\nAccountID: " + getAccountID() + "\nPrice Per Item: $ "
					+ getPricePerItem() + "\nNumber of Items: " + getNumberOfItems() 
					+ "\nTotal Supplies Sales: $ " + CalculateSales());
		}
}
