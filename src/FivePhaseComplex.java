import java.math.BigDecimal;

public class FivePhaseComplex extends AptComplex{
	private double phaseOneUnits;
	private double phaseTwoUnits;
	private double phaseThreeUnits;
	private double phaseFourUnits;
	private double phaseFiveUnits;
	private String phaseOneGL;
	private String phaseTwoGL;
	private String phaseThreeGL;
	private String phaseFourGL;
	private String phaseFiveGL;
	private BigDecimal phaseOneCost;
	private BigDecimal phaseTwoCost;
	private BigDecimal phaseThreeCost;
	private BigDecimal phaseFourCost;
	private BigDecimal phaseFiveCost;
	
	public FivePhaseComplex(String nameOfAptComplex, double phaseOneUnits,
			double phaseTwoUnits, double phaseThreeUnits, double phaseFourUnits,
			double phaseFiveUnits, String phaseOneGL, String phaseTwoGL, 
			String phaseThreeGL, String phaseFourGL, String phaseFiveGL) {
		super(nameOfAptComplex);
		this.phaseOneUnits = phaseOneUnits;
		this.phaseTwoUnits = phaseTwoUnits;
		this.phaseThreeUnits = phaseThreeUnits;
		this.phaseFourUnits = phaseFourUnits;
		this.phaseFiveUnits = phaseFiveUnits;
		this.phaseOneGL = phaseOneGL;
		this.phaseTwoGL = phaseTwoGL;
		this.phaseThreeGL = phaseThreeGL;
		this.phaseFourGL = phaseFourGL;
		this.phaseFiveGL = phaseFiveGL;
	}

	public double getPhaseOneUnits() {
		return phaseOneUnits;
	}

	public double getPhaseTwoUnits() {
		return phaseTwoUnits;
	}

	public double getPhaseThreeUnits() {
		return phaseThreeUnits;
	}
	
	public double getPhaseFourUnits() {
		return phaseFourUnits;
	}
	
	public double getPhaseFiveUnits() {
		return phaseFiveUnits;
	}
	
	public String getPhaseOneGL() {
		return phaseOneGL;
	}

	public String getPhaseTwoGL() {
		return phaseTwoGL;
	}

	public String getPhaseThreeGL() {
		return phaseThreeGL;
	}
	
	public String getPhaseFourGL() {
		return phaseFourGL;
	}
	
	public String getPhaseFiveGL() {
		return phaseFiveGL;
	}
	
	public void setTotalUnits (double phaseOneUnits, double phaseTwoUnits, 
			double phaseThreeUnits, double phaseFourUnits, double phaseFiveUnits){
		totalUnits = AddPhases(phaseOneUnits, phaseTwoUnits, phaseThreeUnits,
				phaseFourUnits, phaseFiveUnits);
	}

	public BigDecimal getPhaseOneCost() {
		return phaseOneCost;
	}
	
	public void setPhaseOneCost(BigDecimal costPerUnit, double p1){
		phaseOneCost = CalculatePhaseCost(costPerUnit, p1);
	}
	
	public BigDecimal getPhaseTwoCost() {
		return phaseTwoCost;
	}
	
	public void setPhaseTwoCost(BigDecimal costPerUnit, double p2){
		phaseTwoCost = CalculatePhaseCost(costPerUnit, p2);
	}
	
	public BigDecimal getPhaseThreeCost() {
		return phaseThreeCost;
	}
	
	public void setPhaseThreeCost(BigDecimal costPerUnit, double p3){
		phaseThreeCost = CalculatePhaseCost(costPerUnit, p3);
	}
	
	public BigDecimal getPhaseFourCost() {
		return phaseFourCost;
	}
	
	public void setPhaseFourCost(BigDecimal costPerUnit, double p4){
		phaseFourCost = CalculatePhaseCost(costPerUnit, p4);
	}
	
	public BigDecimal getPhaseFiveCost() {
		return phaseFiveCost;
	}
	
	public void setPhaseFiveCost(BigDecimal costPerUnit, double p5){
		phaseFiveCost = CalculatePhaseCost(costPerUnit, p5);
	}
	
	private double AddPhases (double p1Units, double p2Units, double p3Units,
			double p4Units, double p5Units){
		double allUnits = p1Units + p2Units + p3Units + p4Units + p5Units;
		return allUnits;
	}
}
