public class StudentGrade {
    public static void main(String[] args) {
        double averageMarks = 82.5; 
        
        String grade;
        if (averageMarks >= 93.0) {
            grade = "A";
        } else if (averageMarks >= 85.0) {
            grade = "B";
        } else if (averageMarks >= 80.0) {
            grade = "C";
        } else if (averageMarks >= 75.0) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        
        System.out.println("Grade: " + grade);
        
    
        String passOrFail = (averageMarks >= 75.0) ? "Pass" : "Fail";
        
        
        System.out.println("Result: " + passOrFail);
    }
}