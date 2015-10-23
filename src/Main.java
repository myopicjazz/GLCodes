import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		TwoPhaseComplex complexOne = new TwoPhaseComplex("Complex One", 504, 96, "001", "002");
		
		complexOne.setTotalUnits(complexOne.getPhaseOneUnits(), complexOne.getPhaseTwoUnits());
		BigDecimal currentInvoice = new BigDecimal(550.99);
		complexOne.setCostPerUnit(currentInvoice);
		complexOne.setPhaseOneCost(complexOne.getCostPerUnit(), complexOne.getPhaseOneUnits());
		complexOne.setPhaseTwoCost(complexOne.getCostPerUnit(), complexOne.getPhaseTwoUnits());
		System.out.println(complexOne.getNameOfAptComplex());
		System.out.println("Phase one - " + complexOne.getPhaseOneGL() + ": $" + complexOne.getPhaseOneCost());
		System.out.println("Phase two - " + complexOne.getPhaseTwoGL() + ": $" + complexOne.getPhaseTwoCost());
		System.out.println("");
		
		ThreePhaseComplex complexTwo = new ThreePhaseComplex("Complex Two", 480, 312, 72,
				"003", "004", "005");
		
		complexTwo.setTotalUnits(complexTwo.getPhaseOneUnits(), 
				complexTwo.getPhaseTwoUnits(), complexTwo.getPhaseThreeUnits());
		complexTwo.setCostPerUnit(currentInvoice);
		complexTwo.setPhaseOneCost(complexTwo.getCostPerUnit(), complexTwo.getPhaseOneUnits());
		complexTwo.setPhaseTwoCost(complexTwo.getCostPerUnit(), complexTwo.getPhaseTwoUnits());
		complexTwo.setPhaseThreeCost(complexTwo.getCostPerUnit(), complexTwo.getPhaseThreeUnits());
		System.out.println(complexTwo.getNameOfAptComplex());
		System.out.println("Phase one - " + complexTwo.getPhaseOneGL() + ": $" + 
				complexTwo.getPhaseOneCost());
		System.out.println("Phase two - " + complexTwo.getPhaseTwoGL() + ": $" + 
				complexTwo.getPhaseTwoCost());
		System.out.println("Phase three - " + complexTwo.getPhaseThreeGL() + 
				": $" + complexTwo.getPhaseThreeCost());
		
		FivePhaseComplex complexThree = new FivePhaseComplex("Complex Three", 240,
				108, 36, 120, 96, "003", "004", "005", "006", "007");
		
		complexThree.setTotalUnits(complexThree.getPhaseOneUnits(), 
				complexThree.getPhaseTwoUnits(), complexThree.getPhaseThreeUnits(),
				complexThree.getPhaseFourUnits(), complexThree.getPhaseFiveUnits());
		complexThree.setCostPerUnit(currentInvoice);
		complexThree.setPhaseOneCost(complexThree.getCostPerUnit(), complexThree.getPhaseOneUnits());
		complexThree.setPhaseTwoCost(complexThree.getCostPerUnit(), complexThree.getPhaseTwoUnits());
		complexThree.setPhaseThreeCost(complexThree.getCostPerUnit(), complexThree.getPhaseThreeUnits());
		complexThree.setPhaseFourCost(complexThree.getCostPerUnit(), complexThree.getPhaseFourUnits());
		complexThree.setPhaseFiveCost(complexThree.getCostPerUnit(), complexThree.getPhaseFiveUnits());
		System.out.println(complexTwo.getNameOfAptComplex());
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
	}
}
