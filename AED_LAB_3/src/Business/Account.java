/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.Date;

/**
 *
 * @author rohan
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    public Account() {
        this.createdOn = new Date();
     }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String rountingNumber) {
        this.routingNumber = rountingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
    @Override
    public  String toString(){
        return bankName;
    }
    
    
    
    
}
