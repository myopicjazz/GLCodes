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
	}
}
