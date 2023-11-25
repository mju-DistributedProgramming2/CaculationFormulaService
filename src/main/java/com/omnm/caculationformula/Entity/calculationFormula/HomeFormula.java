package com.omnm.caculationformula.Entity.calculationFormula;




import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class HomeFormula extends CalculationFormula {

	@Lob
	@Column(name = "riskLevelAccordingToResidenceType", nullable = false)
	private byte[] riskLevelAccordingToResidenceType;

	@Lob
	@Column(name = "riskLevelAccordingToHouseType", nullable = false)
	private byte[] riskLevelAccordingToHouseType;

	@Lob
	@Column(name = "riskLevelAccordingToSquareMeter", nullable = false)
	private byte[] riskLevelAccordingToSquareMeter;

	@Lob
	@Column(name = "riskLevelAccordingToCompensation", nullable = false)
	private byte[] riskLevelAccordingToCompensation;
	
	public HomeFormula(CalculationFormulaForService calculationFormulaForService) {
		super(calculationFormulaForService);
	}

	public HomeFormula() {

	}

	public byte[] getRiskLevelAccordingToResidenceType() {
		return riskLevelAccordingToResidenceType;
	}

	public void setRiskLevelAccordingToResidenceType(byte[] riskLevelAccordingToResidenceType) {
		this.riskLevelAccordingToResidenceType = riskLevelAccordingToResidenceType;
	}

	public byte[] getRiskLevelAccordingToHouseType() {
		return riskLevelAccordingToHouseType;
	}

	public void setRiskLevelAccordingToHouseType(byte[] riskLevelAccordingToHouseType) {
		this.riskLevelAccordingToHouseType = riskLevelAccordingToHouseType;
	}

	public byte[] getRiskLevelAccordingToSquareMeter() {
		return riskLevelAccordingToSquareMeter;
	}

	public void setRiskLevelAccordingToSquareMeter(byte[] riskLevelAccordingToSquareMeter) {
		this.riskLevelAccordingToSquareMeter = riskLevelAccordingToSquareMeter;
	}

	public byte[] getRiskLevelAccordingToCompensation() {
		return riskLevelAccordingToCompensation;
	}

	public void setRiskLevelAccordingToCompensation(byte[] riskLevelAccordingToCompensation) {
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}
}