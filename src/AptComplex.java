import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class AptComplex {
	private String nameOfAptComplex;
	private BigDecimal costPerUnit;
	protected double totalUnits;
	
	public AptComplex (String nameOfAptComplex) {
		this.nameOfAptComplex = nameOfAptComplex;
	}
	
	public String getNameOfAptComplex() {
		return nameOfAptComplex;
	}

	public void setNameOfAptComplex(String nameOfAptComplex) {
		this.nameOfAptComplex = nameOfAptComplex;
	}
	
	public BigDecimal getCostPerUnit() {
		return costPerUnit;
	}
	
	/*setPhaseCost divides the amount of the invoice by the number of apartments in the
	*complex to come up with a cost for each unit in the apartment complex
	*/
	public void setCostPerUnit (BigDecimal invoice) {
		BigDecimal tu = new BigDecimal(this.totalUnits);
		costPerUnit = invoice.divide(tu, 20, RoundingMode.HALF_EVEN);
		
	}
	
	public double getTotalUnits() {
		return totalUnits;
	}
	
	public void setTotalUnits() {};		// This will always be overridden
	
	// And this will always be overridden as well
	public double AddPhases(double d) {
		double sum = 0;
		return sum;
	}
	
	/*CalculatePhaseCost method comes up with the amount of the invoice that will be
	 * paid out of each phase of the apartment complex based on the number of units
	 * in that phase
	 */
	public BigDecimal CalculatePhaseCost (BigDecimal costPerUnit, double phase){
		BigDecimal phaseCost;
		BigDecimal unitsInPhase = new BigDecimal(phase);
		phaseCost = costPerUnit.multiply(unitsInPhase);
		phaseCost = phaseCost.setScale(2, RoundingMode.HALF_EVEN);
		return phaseCost;
	}
}
