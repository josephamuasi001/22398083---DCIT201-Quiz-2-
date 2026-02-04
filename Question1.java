public class Question1 {
    public static void main(String[] args) {
        executeGradeReport(20);
        
    }
    public static void executeGradeReport(double score) {
        if(!validateScore(score)) {
            System.out.println("Invalid score");
            return;
        }

        char studentGrade = calculateLetterGrade(score);
        displayPerformanceMessage(studentGrade);
        

    }
    public static boolean validateScore(double score) {
        boolean valid = true;
        if (score >= 0 && score <= 100) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;

    }
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
