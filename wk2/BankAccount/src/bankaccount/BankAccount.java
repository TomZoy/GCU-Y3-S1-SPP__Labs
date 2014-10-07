/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
// this is a dummy version of BankAccount class
// aimed at enabling Test Driven Development.
// All associated JUnit developed tests should initially fail
// when executed on this version.
public class BankAccount {

	private double balance;
	//in a "real life" application this class would have 
	//more properties for customer info etc. as well as more
	//methods

	public BankAccount(double openingBalance)
	{
	   //set initial account balance to an erroneous value	    
	  balance=openingBalance;
	}

	public void withdrawMoney(double amount)
	{
	   //do nothing to ensure method fails;
            balance=balance-amount;
	}

	public void depositMoney(double amount)
	{
	    //do nothing to ensure method fails;
            balance=balance+amount;
	}

	public double getBalance()
	{
	    return balance;
	}
}
