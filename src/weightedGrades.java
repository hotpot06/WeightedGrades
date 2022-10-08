
public class weightedGrades {
	private int[] pointTotal;
	private int[] earnedPoints;
	private double[] assignmentPercentage;
	private double totalWeightedGrade;
	
	public weightedGrades(int[] total, int[] earned, double[] percentage) {
		pointTotal = new int[8];
		earnedPoints = new int[8];
		assignmentPercentage = new double[8];
		pointTotal = total;
		earnedPoints = earned;
		assignmentPercentage = percentage;
	}
	
	public void gettotalWeightedGrades() {
		totalWeightedGrade = 0.0;
		for(int i = 0; i < 8; i = i + 1) {
			totalWeightedGrade = totalWeightedGrade + assignmentPercentage[i] * earnedPoints[i] / pointTotal[i];
		}
		
		String gradeLetter;
		if(totalWeightedGrade < 60) {
			gradeLetter = "F";
		}else if(totalWeightedGrade >= 60 && totalWeightedGrade < 70) {
			gradeLetter = "D";
		}else if(totalWeightedGrade >= 70 && totalWeightedGrade < 80) {
			gradeLetter = "C";
		}else if(totalWeightedGrade >= 80 && totalWeightedGrade < 90) {
			gradeLetter = "B";
		}else {
			gradeLetter = "A";
		}
		String num1  = String.format("%.3f",totalWeightedGrade);
		System.out.println('\n'+"Total weighted grades: "+num1+", the garde letter: "+gradeLetter);
	}
}
