/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import junit.framework.TestCase;

/**
 *
 * @author TomZoy
 */
public class BankAccountTest extends TestCase {
    
    public BankAccountTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   public void testBankAccount() {
BankAccount testAccount = new BankAccount(500);
assertEquals("Testing Constructor",500.0, testAccount.getBalance());
}
public void testWithdrawMoney() {
BankAccount testAccount = new BankAccount(500);
testAccount.withdrawMoney(100);
assertEquals("Testing withdrawMoney", 400.0, testAccount.getBalance());
}
public void testDepositMoney() {
BankAccount testAccount = new BankAccount(500);
testAccount.depositMoney(100);
assertEquals("Testing depositMoney", 600.0, testAccount.getBalance());
}
    
}
