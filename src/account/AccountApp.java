package account;

import java.util.Scanner;

public class AccountApp
{
    
   public static void main(String[] args) 
   {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      // display initial balance of each object
      account1.printAccount();
      account2.printAccount();

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);
      account1.Deposit(depositAmount); // add to account1's balance

      // display balances
      account1.printAccount();
      account2.printAccount();

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);
      account2.Deposit(depositAmount); // add to account2 balance
      
      // witdraw test
      System.out.print("Enter withdraw amount for account1: "); // prompt
      double withdrawAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nreducing %.2f from account1 balance%n", 
         withdrawAmount);
      account1.Withdraw(withdrawAmount);
      
      System.out.print("Enter withdraw amount for account2: "); // prompt
      withdrawAmount = input.nextDouble(); // obtain user input
      System.out.printf("%nreducing %.2f from account2 balance%n", 
         withdrawAmount);
      account2.Withdraw(withdrawAmount);
      
      
       // display balances
      account1.printAccount();
      account2.printAccount();
      
      
   } // end main

} // end class AccountTest

