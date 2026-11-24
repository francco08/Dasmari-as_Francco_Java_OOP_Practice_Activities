/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooppracticeactivity3;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class OOPPracticeActivity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");
        
        System.out.println(aly.getOwner() + ": " + aly.getBalance() + ", " + ben.getOwner() + ": " + ben.getBalance());
        System.out.println(aly.transferTo(ben, 35) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(aly.transferTo(ben, 70) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(aly.transferTo(aly, 10) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(ben.deposit(15) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(aly.transferTo(ben, 65) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(aly.transferTo(ben, 0) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
        System.out.println(aly.transferTo(null, 35) + "; " + aly.getOwner() + "; " + aly.getBalance() + ", " + ben.getOwner() + "; " + ben.getBalance());
    }

    /**
     * Activity 3, Q1: Try a zero-credit transfer and a transfer to null.
     * For each, write the expected result before running the program.
     * Answer: 
     * false; Aly; 0, Ben; 115
     * false; Aly; 0, Ben; 115
     */
}
