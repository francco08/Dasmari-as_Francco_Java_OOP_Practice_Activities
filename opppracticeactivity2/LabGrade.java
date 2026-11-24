/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opppracticeactivity2;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class LabGrade {
    private String studentName;
    private int quizScore;
    private int labScore;
    
    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;
        if (quizScore < 0 || quizScore > 100) {
            this.quizScore = 0;
        } else {
            this.quizScore = quizScore;
        }
        if (labScore < 0 || labScore > 100) {
            this.labScore = 0;
        } else {
            this.labScore = labScore;
        }
    }
    
    public boolean updateScores(int quizScore, int labScore) {
        if (quizScore < 0 || quizScore > 100) {
            return false;
        }
        if (labScore < 0 || labScore > 100) {
            return false;
        }
        this.quizScore = quizScore;
        this.labScore = labScore;
        return true;
    }
    
    public double getFinalGrade() {
        return (this.quizScore * 0.4) + (this.labScore * 0.6);
    }
    
    public boolean isPassing() {
        if (getFinalGrade() < 75) {
            return false;
        }
        return true;
    }
    
    public String isPassingString() {
        if (isPassing()) {
            return "passing";
        } else {
            return "not passing";
        }
    }
}