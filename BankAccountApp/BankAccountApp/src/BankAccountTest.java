
package bankaccountapp;

public class BankAccountTest{

	//This program will act as a test harness for BankAccount.java 
	//It will set up a class instance and execute the methods with 
	//known values and output the results to the "screen" to allow 
	//the tester to see the results and determine whether the 
	//BankAccount class has been properly implemented
	
	//To make the test results clear, the code will "test" the 
	//returned results and put explicit output messages to clearly 
	//show whether the test PASSED or FAILED. In the case of a FAIL
	//message the value of the appropriate returned variable will 
	//be displayed to enable the developer to have useful debug 
	//information to help in identifying the possible problem

	public static void main(String[] args)
	{

	   //Declare a new BankAccount class instance to use in the
	   //test and set it with an initial balance, say Ł500
	   BankAccount testAccount = new BankAccount(500);
	   double currentBalance;

	   //Test the constructor for setting the balance correctly
	   currentBalance = testAccount.getBalance();
	   if (currentBalance == 500)
	      System.out.println("Testing Constructor - PASSED");
	   else {
	      System.out.println("Testing Constructor - FAILED");
	      System.out.println("Actual Balance was:"+currentBalance);
	   }

	   //Test the withdrawMoney method by withdrawing an amount 
	   // from the account and then checking to see if the balance
   	   // has been correctly updated
	   testAccount.withdrawMoney(200);
	   currentBalance = testAccount.getBalance();
	   if (currentBalance == 300)
	      System.out.println("Testing withdrawMoney - PASSED");
	   else {
	      System.out.println("Testing withdrawMoney - FAILED");
	      System.out.println("Actual Balance was:"+currentBalance);
	   }


	   //Test the depositMoney method by depositing an amount from 
	   //the account and then checking to see if the balance has
   	   //correctly been updated
	   testAccount.depositMoney(100);
	   currentBalance = testAccount.getBalance();
	   if (currentBalance == 400)
	      System.out.println("Testing depositMoney - PASSED");
	   else {
	      System.out.println("Testing depositMoney - FAILED");
	      System.out.println("Actual Balance was:"+currentBalance);
	   }

	}
}


