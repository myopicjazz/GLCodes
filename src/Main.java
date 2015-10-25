import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TwoPhaseComplex complexOne = new TwoPhaseComplex("Complex One", 504, 96, "001", "002");
		
		complexOne.setTotalUnits();
		BigDecimal currentInvoice = new BigDecimal(550.99);
		complexOne.setCostPerUnit(currentInvoice);
		complexOne.setPhaseOneCost();
		complexOne.setPhaseTwoCost();
		System.out.println(complexOne.getNameOfAptComplex());
		System.out.println("Phase one - " + complexOne.getPhaseOneGL() + ": $" + complexOne.getPhaseOneCost());
		System.out.println("Phase two - " + complexOne.getPhaseTwoGL() + ": $" + complexOne.getPhaseTwoCost());
		System.out.println("");
		
		ThreePhaseComplex complexTwo = new ThreePhaseComplex("Complex Two", 480, 312, 72,
				"003", "004", "005");
		
		complexTwo.setTotalUnits();
		complexTwo.setCostPerUnit(currentInvoice);
		complexTwo.setPhaseOneCost();
		complexTwo.setPhaseTwoCost();
		complexTwo.setPhaseThreeCost();
		System.out.println(complexTwo.getNameOfAptComplex());
		System.out.println("Phase one - " + complexTwo.getPhaseOneGL() + ": $" + 
				complexTwo.getPhaseOneCost());
		System.out.println("Phase two - " + complexTwo.getPhaseTwoGL() + ": $" + 
				complexTwo.getPhaseTwoCost());
		System.out.println("Phase three - " + complexTwo.getPhaseThreeGL() + 
				": $" + complexTwo.getPhaseThreeCost());
		System.out.println("");
		
		FivePhaseComplex complexThree = new FivePhaseComplex("Complex Three", 240,
				108, 36, 120, 96, "006", "007", "008", "009", "010");
		
		complexThree.setTotalUnits();
		complexThree.setCostPerUnit(currentInvoice);
		complexThree.setPhaseOneCost();
		complexThree.setPhaseTwoCost();
		complexThree.setPhaseThreeCost();
		complexThree.setPhaseFourCost();
		complexThree.setPhaseFiveCost();
		System.out.println(complexThree.getNameOfAptComplex());
		System.out.println("Phase one - " + complexThree.getPhaseOneGL() + ": $" + 
				complexThree.getPhaseOneCost());
		System.out.println("Phase two - " + complexThree.getPhaseTwoGL() + ": $" + 
				complexThree.getPhaseTwoCost());
		System.out.println("Phase three - " + complexThree.getPhaseThreeGL() + 
				": $" + complexThree.getPhaseThreeCost());
		System.out.println("Phase four - " + complexThree.getPhaseFourGL() + 
				": $" + complexThree.getPhaseFourCost());
		System.out.println("Phase five - " + complexThree.getPhaseFiveGL() + 
				": $" + complexThree.getPhaseFiveCost());
		System.out.println("");
		
		MultiPhaseComplex complexFour = new MultiPhaseComplex("Complex Four");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many phases in this apartment complex: ");
		int noPhases = sc.nextInt();
		complexFour.setNumberOfPhases(noPhases);
		complexFour.FixArrayLengths();
		
		String[] glCodes = new String[complexFour.getNumberOfPhases()];
		double[] unitsEachPhase = new double[complexFour.getNumberOfPhases()];
		
		int c = 1;
		for (int i = 0; i < complexFour.getNumberOfPhases(); i++) {
			System.out.println("What is the GL for phase " + c + ": ");
			String glNumber = sc.next();
			glCodes[i] = glNumber;
			c++;
		}
		complexFour.setPhaseGLs(glCodes);
		
		c = 1;
		for (int i = 0; i < complexFour.getNumberOfPhases(); i++) {
			System.out.println("How many units in phase " + c + ": ");
			double unitQty = sc.nextDouble();
			unitsEachPhase[i] = unitQty;
			c++;
		}
		complexFour.setUnitsPerPhase(unitsEachPhase);
		complexFour.setTotalUnits();
		complexFour.setCostPerUnit(currentInvoice);
		complexFour.setCostPerPhase();
		complexFour.getCostPerPhase();
	}
}
