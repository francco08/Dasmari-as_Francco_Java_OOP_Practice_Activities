/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opppracticeactivity2;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class OPPPracticeActivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);
        
        
        System.out.println(ana.getFinalGrade() + "; " + ana.isPassingString());
        System.out.println(ben.getFinalGrade() + "; " + ben.isPassingString());
        System.out.println(ana.updateScores(95, 101) + "; " + ana.getFinalGrade());
        System.out.println(ana.updateScores(74, 75) + ", " + ana.getFinalGrade() + "; " + ana.isPassingString());
        System.out.println(ana.updateScores(75, 75) + ", " + ana.getFinalGrade() + "; " + ana.isPassingString());
        System.out.println(ben.getFinalGrade() + "; " + ben.isPassingString());
    }
    
    /**
     * Why must you validate both new scores before assigning either one?
     * Answer: If we do not validate the new scores, the code might
     * accept a score that is not within the range of the scores, thus
     * the final grade might be calculated with invalid test scores.
     */
}
