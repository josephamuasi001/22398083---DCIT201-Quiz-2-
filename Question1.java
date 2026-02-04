public class Question1 {
    //This is my main method
    public static void main(String[] args) {
        executeGradeReport(1000);
        
    }

    /*  1. I initiated the executeGradeReport method here
        2. It does not perform any calculations but instead it calls the following methods;
            a. validateScore(score) - Validates score
            b. calculateLetterGrade - It assigns a letter a grade to the score
            c. displayPerformanceMessage - It displays a message of students performance based on their grade.
    */ 
    public static void executeGradeReport(double score) {
        if(!validateScore(score)) {
            System.out.println("Invalid score");
            return;
        }

        char studentGrade = calculateLetterGrade(score);
        displayPerformanceMessage(studentGrade);
        

    }

    /*
        validateScore.java - Checks if score ranges from 0 to 100
        if it is valid, returns true else, it returns false
    */
    public static boolean validateScore(double score) {
        boolean valid = true;
        if (score >= 0 && score <= 100) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;

    }
    /*
        if validate score returns true, it assigns a letter grade, A,B,C,D and F.
    */

    public static char calculateLetterGrade(double score) {
        char assignGrade;
        if (score >= 80) {
            assignGrade = 'A';
        } else if (score >= 70) {
            assignGrade = 'B';
        } else if (score >= 60) {
            assignGrade = 'C';
        } else if (score >= 50) {
            assignGrade = 'D';
        } else {
            assignGrade = 'F';
        }

        return assignGrade;
    }


    /*
        Checks the letter grade and displays a performance message based on letter grade.
    */
    public static void displayPerformanceMessage(char studentGrade) {
        if (studentGrade == 'A') {
            System.out.println("You perform exceptionally well.!!");
        } else if (studentGrade == 'B') {
            System.out.println("Your performance was very good");
        } else if (studentGrade == 'C') {
            System.out.println("Your performance is was above average!");
        } else if (studentGrade == 'D') {
            System.out.println("You can do better..there is more room for improvement !");
        } else if (studentGrade == 'F') {
            System.out.println("You failed badly! ");
        }
    }
    
}
