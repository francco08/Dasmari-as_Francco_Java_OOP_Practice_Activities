/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooppracticeactivity1;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class PrintAccount {
    private String studentName;
    private int credits;
    
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;
        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }
    
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.credits += amount;
        return true;
    }
    
    public boolean printPages(int pages) {
        if (pages <= 0 || this.credits < pages) {
            return false;
        }
        this.credits -= pages;
        return true;
    }
    
    public int getCredits() {
        return this.credits;
    }
    
    public String getStudentName() {
        return this.studentName;
    }
}
