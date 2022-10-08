import java.util.Scanner;

public class mainForWeightedGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total points, earned points and assignment percentage: ");		
		
		int[] total = new int[8];
		int[] earned = new int[8];
		double[] percentage = new double[8];
		for(int j = 0; j < 8; j = j+1) {
			total[j] = sc.nextInt();
			System.out.print(total[j] + " ");
		}
		
		for(int k = 0; k < 8; k = k+1) {
			earned[k] = sc.nextInt();
			System.out.print(earned[k] + " ");
		}
		
		for(int l = 0; l < 8; l = l+1) {
			percentage[l] = sc.nextDouble();
			System.out.print(percentage[l] + " ");
		}
		
		sc.close();
		
		// calculate
		weightedGrades weightedgrades;
		weightedgrades = new weightedGrades(total, earned, percentage);
		weightedgrades.gettotalWeightedGrades();

	}

}
