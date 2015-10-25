import java.math.BigDecimal;

public class ThreePhaseComplex extends AptComplex {
	private double phaseOneUnits;
	private double phaseTwoUnits;
	private double phaseThreeUnits;
	private String phaseOneGL;
	private String phaseTwoGL;
	private String phaseThreeGL;
	private BigDecimal phaseOneCost;
	private BigDecimal phaseTwoCost;
	private BigDecimal phaseThreeCost;
	
	public ThreePhaseComplex(String nameOfAptComplex, double phaseOneUnits,
			double phaseTwoUnits, double phaseThreeUnits, String phaseOneGL, 
			String phaseTwoGL, String phaseThreeGL) {
		super(nameOfAptComplex);
		this.phaseOneUnits = phaseOneUnits;
		this.phaseTwoUnits = phaseTwoUnits;
		this.phaseThreeUnits = phaseThreeUnits;
		this.phaseOneGL = phaseOneGL;
		this.phaseTwoGL = phaseTwoGL;
		this.phaseThreeGL = phaseThreeGL;
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
	
	public String getPhaseOneGL() {
		return phaseOneGL;
	}

	public String getPhaseTwoGL() {
		return phaseTwoGL;
	}

	public String getPhaseThreeGL() {
		return phaseThreeGL;
	}
	
	public void setTotalUnits (){
		totalUnits = AddPhases(phaseOneUnits, phaseTwoUnits, phaseThreeUnits);
	}

	public BigDecimal getPhaseOneCost() {
		return phaseOneCost;
	}
	
	public void setPhaseOneCost(){
		phaseOneCost = CalculatePhaseCost(phaseOneUnits);
	}
	
	public BigDecimal getPhaseTwoCost() {
		return phaseTwoCost;
	}
	
	public void setPhaseTwoCost(){
		phaseTwoCost = CalculatePhaseCost(phaseTwoUnits);
	}
	
	public BigDecimal getPhaseThreeCost() {
		return phaseThreeCost;
	}
	
	public void setPhaseThreeCost(){
		phaseThreeCost = CalculatePhaseCost(phaseThreeUnits);
	}
	
	private double AddPhases (double p1Units, double p2Units, double p3Units){
		double allUnits = p1Units + p2Units + p3Units;
		return allUnits;
	}
}
