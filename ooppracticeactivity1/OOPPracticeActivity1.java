/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooppracticeactivity1;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class OOPPracticeActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);
        
        System.out.println(mia.getStudentName() + ": " + mia.getCredits() + ", " + luis.getStudentName() + ": " + luis.getCredits());
        System.out.println(mia.printPages(4) + "; " + mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(mia.printPages(7) + "; " + mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(mia.addCredits(-3) + "; " + mia.getStudentName() + ": " + mia.getCredits());
        System.out.println(mia.addCredits(4) + "; " + mia.getStudentName() + ": " + mia.getCredits() + ", " + luis.getStudentName() + ": " + luis.getCredits());
    }
    
    /**
     * Prompt used: 
     * Assume they are two different files, one class and one main. 
     * Do not code anything, just give me hints on what is wrong.
     * 
     * Response to the reply:
     * Checked the operators of the if-statements and checked the placement
     * of the "this.___ +=/-= amount/pay;" on the code.
     * 
     * How the code was checked:
     * Running the five test cases to see if they line up with the expected 
     * result.
     */
}
