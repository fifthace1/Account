/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author m.ashoori
 */
public class Account {
    
    private  String accountName;
    private double balance;


    
    // provide custom constractor
    public Account(String name, double balance)
    {
        this.accountName = name;
        
        // check the balance is positive
        if (balance > 0.0)
            this.balance = balance;
    }
    
    // method that deposits (adds) only a valid amount to the balance
    public void Deposit (double depositAmount)
    {
        if (depositAmount > 0.0)
        {
            balance = balance + depositAmount;
        }
    }
    
    // method returns the account balance
    public double GetBalance()
    {
        return balance;
    }

    // method to set the name in the object
    public void SetName (String name)
    {
        this.accountName = name; // Store the name
    }
    
    // method to retrieve the name from the object
    public String GetName ()
    {
        return  accountName; // Get the name
    }  
    
    public void printAccount()
    {
        System.out.printf("%s balance: $%.2f%n",
         this.GetName(), this.GetBalance()); 
    }
    
}
