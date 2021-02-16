/*
 AUTHOR: Richard Soria
 DESCR:  Superclass for Supplies and Services that has abstract methods to 
 		 complete calculations for total sales along with other information 
 		 displays.
 */

package projectHW5;

public abstract class Account{
	//All these are abstract methods that work
	//to set up information for subclasses
	abstract void setAccountID();
	abstract int getAccountID();
	abstract double getNumberOfHours();
	abstract double getRatePerHour();
	abstract int getNumberOfItems();
	abstract double getPricePerItem();
	abstract double CalculateSales();
}