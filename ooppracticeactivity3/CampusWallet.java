/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppracticeactivity3;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class CampusWallet {
    private String owner;
    private int balance;
    
    public CampusWallet(String owner, int balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    
    public CampusWallet(String owner) {
        this(owner , 0);
    }
    
    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }
    
    public boolean transferTo(CampusWallet recipient, int amount) {
        if (recipient == null ||recipient == this || amount <= 0 || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public String getOwner() {
        return this.owner;
    }
}

