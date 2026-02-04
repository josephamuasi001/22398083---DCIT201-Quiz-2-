public class Question2 {
    public static void main(String[] args) {
        
    }
    /* Version 1 takes two double scores and calculates the average score.
        I divided it by a double value (2.0).
        I also created  double variables sum and average to prevent complex calculations.
    */
    public static double calculateClassAverageVersion1(double score1, double score2) {
        double sum = (score1 + score2);
        double average = sum / 2.0;
        return average;
    }

    /*
        Version 2 takes three double scores and calculates the average score
        I divided it by a double value 3.0 since version 3 takes three scores
        I also created double variables sumScore and averageScore to store sum and average 
    */
    public static double calculateClassAverageVersion2(double sc1, double sc2, double sc3) {
        double sumScore = (sc1 + sc2 + sc3);
        double averageScore = sumScore / 3.0;
        return averageScore;
    }
    // Version 3 (Takes an array of double scores)
    public static double calculateClassAverageVersion3(double[] scores) {
        double sumScores = 0;

        for (double score : scores) {
            sumScores += score;
        }
        return sumScores / scores.length;
    }


}
