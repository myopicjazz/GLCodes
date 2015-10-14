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
	
	public void setTotalUnits (double phaseOneUnits, double phaseTwoUnits, 
			double phaseThreeUnits){
		totalUnits = phaseOneUnits + phaseTwoUnits + phaseThreeUnits;
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
}
