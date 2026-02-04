public class Question2 {
    public static void main(String[] args) {
        
    }
    
    public static double calculateClassAverageVersion1(double score1, double score2) {
        double sum = (score1 + score2);
        double average = sum / 2.0;
        return average;
    }

    public static double calculateClassAverageVersion2(double sc1, double sc2, double sc3) {
        double sumScore = (sc1 + sc2 + sc3);
        double averageScore = sumScore / 3.0;
        return averageScore;
    }

    public static double calculateClassAverageVersion3(double[] scores) {
        double sumScores = 0;

        for (double score : scores) {
            sumScores += score;
        }
        return sumScores / scores.length;
    }


}
