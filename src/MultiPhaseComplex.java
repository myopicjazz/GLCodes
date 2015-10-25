import java.math.BigDecimal;

public class MultiPhaseComplex extends AptComplex {
	private int numberOfPhases;
	private String[] phaseGLs;
	private double[] unitsPerPhase;
	private BigDecimal[] costPerPhase;
	
	public MultiPhaseComplex(String nameOfAptComplex) {
		super(nameOfAptComplex);
	}

	public int getNumberOfPhases() {
		return numberOfPhases;
	}

	public void setNumberOfPhases(int numberOfPhases) {
		this.numberOfPhases = numberOfPhases;
	}
	
	public void FixArrayLengths() {
		phaseGLs = new String[numberOfPhases];
		unitsPerPhase = new double[numberOfPhases];
		costPerPhase = new BigDecimal[numberOfPhases];
	}
	
	public void setPhaseGLs(String[] glArray) {
		for (int i = 0; i < numberOfPhases; i++) {
			phaseGLs[i] = glArray[i];
		}
	}
	
	public void setUnitsPerPhase(double[] phaseQty) {
		for (int i = 0; i < numberOfPhases; i++) {
			unitsPerPhase[i] = phaseQty[i];
		}
	}
	
	public void setTotalUnits() {
		double onePhase = 0;
		double sumUnits = 0;
		for (int i = 0; i < numberOfPhases; i++) {
			onePhase = unitsPerPhase[i];
			sumUnits += onePhase;
		}
		totalUnits = sumUnits;
	}
	
	public void setCostPerPhase() {
		BigDecimal phaseCost;
		for(int i = 0; i < numberOfPhases; i++) {
			phaseCost = CalculatePhaseCost(unitsPerPhase[i]);
			costPerPhase[i] = phaseCost;
		}
	}
	
	public void getCostPerPhase() {
		int i = 0;
		for ( BigDecimal phaseCost : costPerPhase) {
			System.out.println("Cost for " + phaseGLs[i] + ": $" + phaseCost);
			i++;
		}
	}
}
