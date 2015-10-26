import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String propNumber = "";
		int selection = 0;
		BigDecimal currentInvoice = new BigDecimal(0);
		System.out.println("1. Cedar Oaks Apartments");
		System.out.println("2. Evergreen Trails Apartments");
		System.out.println("3. Juniper Hollow Apartments");
		System.out.println("4. Other Apartment Complex");
		System.out.println("");
		System.out.print("Type in a number corresponding to one of the options above: ");
		try {
			propNumber = sc.next();
			selection = Integer.valueOf(propNumber.trim());
		}
		catch (java.util.InputMismatchException e) {
			System.err.println("You need to re-effort that one.");
		}
		while (selection < 1 || selection > 4) {
			System.out.println("You need to try again using a legit selection");
			System.out.print("Choose one of the number options listed above: ");
			try {
				propNumber = sc.next();
				selection = Integer.valueOf(propNumber.trim());
			}
			catch (java.util.InputMismatchException e) {
				System.err.println("You need to re-effort that one.");
			}
		}
		System.out.print("Enter amount of invoice: ");
		try {
			currentInvoice = sc.nextBigDecimal();
		}
		catch (java.util.InputMismatchException e) {
			System.err.println("You needs must try again.");
		}
		System.out.println("");
		switch (selection) {
		case 1:
			TwoPhaseComplex cedarOaks = new TwoPhaseComplex("Cedar Oaks", 504, 96, 
					"047", "050");
			cedarOaks.setTotalUnits();
			cedarOaks.setCostPerUnit(currentInvoice);
			cedarOaks.setPhaseOneCost();
			cedarOaks.setPhaseTwoCost();
			System.out.println(cedarOaks.getNameOfAptComplex());
			System.out.println("Phase one - " + cedarOaks.getPhaseOneGL() + ": $" + cedarOaks.getPhaseOneCost());
			System.out.println("Phase two - " + cedarOaks.getPhaseTwoGL() + ": $" + cedarOaks.getPhaseTwoCost());
			System.out.println("");
			break;
		case 2:
			ThreePhaseComplex everGreenTrails = new ThreePhaseComplex("Evergreen Trails", 480,
					312, 72, "052", "056", "060");
			everGreenTrails.setTotalUnits();
			everGreenTrails.setCostPerUnit(currentInvoice);
			everGreenTrails.setPhaseOneCost();
			everGreenTrails.setPhaseTwoCost();
			everGreenTrails.setPhaseThreeCost();
			System.out.println(everGreenTrails.getNameOfAptComplex());
			System.out.println("Phase one - " + everGreenTrails.getPhaseOneGL() + ": $" + 
					everGreenTrails.getPhaseOneCost());
			System.out.println("Phase two - " + everGreenTrails.getPhaseTwoGL() + ": $" + 
					everGreenTrails.getPhaseTwoCost());
			System.out.println("Phase three - " + everGreenTrails.getPhaseThreeGL() + 
					": $" + everGreenTrails.getPhaseThreeCost());
			System.out.println("");
			break;
		case 3:
			FivePhaseComplex juniperHollow = new FivePhaseComplex("Juniper Hollow", 240,
					108, 36, 120, 96, "074", "078", "082", "084", "088");
			
			juniperHollow.setTotalUnits();
			juniperHollow.setCostPerUnit(currentInvoice);
			juniperHollow.setPhaseOneCost();
			juniperHollow.setPhaseTwoCost();
			juniperHollow.setPhaseThreeCost();
			juniperHollow.setPhaseFourCost();
			juniperHollow.setPhaseFiveCost();
			System.out.println(juniperHollow.getNameOfAptComplex());
			System.out.println("Phase one - " + juniperHollow.getPhaseOneGL() + ": $" + 
					juniperHollow.getPhaseOneCost());
			System.out.println("Phase two - " + juniperHollow.getPhaseTwoGL() + ": $" + 
					juniperHollow.getPhaseTwoCost());
			System.out.println("Phase three - " + juniperHollow.getPhaseThreeGL() + 
					": $" + juniperHollow.getPhaseThreeCost());
			System.out.println("Phase four - " + juniperHollow.getPhaseFourGL() + 
					": $" + juniperHollow.getPhaseFourCost());
			System.out.println("Phase five - " + juniperHollow.getPhaseFiveGL() + 
					": $" + juniperHollow.getPhaseFiveCost());
			System.out.println("");
			break;
		case 4:
			System.out.print("What is the name of this apartment complex? " );
			sc.nextLine();
			String newComplex = sc.nextLine();
			MultiPhaseComplex otherComplex = new MultiPhaseComplex(newComplex);
			
			System.out.print("How many phases in this apartment complex: ");
			int noPhases = sc.nextInt();
			otherComplex.setNumberOfPhases(noPhases);
			otherComplex.FixArrayLengths();
			
			String[] glCodes = new String[otherComplex.getNumberOfPhases()];
			double[] unitsEachPhase = new double[otherComplex.getNumberOfPhases()];
			
			int c = 1;
			for (int i = 0; i < otherComplex.getNumberOfPhases(); i++) {
				System.out.print("What is the GL for phase " + c + ": ");
				String glNumber = sc.next();
				glCodes[i] = glNumber;
				c++;
			}
			otherComplex.setPhaseGLs(glCodes);
			
			c = 1;
			for (int i = 0; i < otherComplex.getNumberOfPhases(); i++) {
				System.out.print("How many units in phase " + c + ": ");
				double unitQty = sc.nextDouble();
				unitsEachPhase[i] = unitQty;
				c++;
			}
			otherComplex.setUnitsPerPhase(unitsEachPhase);
			otherComplex.setTotalUnits();
			otherComplex.setCostPerUnit(currentInvoice);
			otherComplex.setCostPerPhase();
			System.out.println("");
			System.out.println(otherComplex.getNameOfAptComplex());
			otherComplex.getCostPerPhase();
			break;
		default: 
			System.out.println("");
			break;
		}
	}
}
