import java.math.BigDecimal;

public class TwoPhaseComplex extends AptComplex {
	private double phaseOneUnits;
	private double phaseTwoUnits;
	private String phaseOneGL;
	private String phaseTwoGL;
	private BigDecimal phaseOneCost;
	private BigDecimal phaseTwoCost;
	
	public TwoPhaseComplex(String nameOfAptComplex, double phaseOneUnits, 
			double phaseTwoUnits, String phaseOneGL, String phaseTwoGL) {
		super(nameOfAptComplex);
		this.phaseOneUnits = phaseOneUnits;
		this.phaseTwoUnits = phaseTwoUnits;
		this.phaseOneGL = phaseOneGL;
		this.phaseTwoGL = phaseTwoGL;
	};

	public double getPhaseOneUnits() {
		return phaseOneUnits;
	}

	public double getPhaseTwoUnits() {
		return phaseTwoUnits;
	}

	public String getPhaseOneGL() {
		return phaseOneGL;
	}

	public String getPhaseTwoGL() {
		return phaseTwoGL;
	}
	
	public void setTotalUnits (){
		totalUnits = AddPhases(phaseOneUnits, phaseTwoUnits);
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
	
	private double AddPhases (double p1Units, double p2Units){
		double allUnits = p1Units + p2Units;
		return allUnits;
	}
}