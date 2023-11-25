package com.omnm.caculationformula.Entity.calculationFormula;


import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class WorkplaceFormula extends CalculationFormula {
	@Lob
	@Column(name = "riskLevelAccordingToUsage", nullable = false)
	private byte[] riskLevelAccordingToUsage;

	@Lob
	@Column(name = "riskLevelAccordingToFloor", nullable = false)
	private byte[] riskLevelAccordingToFloor;

	@Lob
	@Column(name = "riskLevelAccordingToSquareFeet", nullable = false)
	private byte[] riskLevelAccordingToSquareFeet;

	@Lob
	@Column(name = "riskLevelAccordingToCompensation", nullable = false)
	private byte[] riskLevelAccordingToCompensation;
	
	public WorkplaceFormula(CalculationFormulaForService calculationFormulaForService) {
		super(calculationFormulaForService);
	}

	public WorkplaceFormula() {

	}

	public byte[] getRiskLevelAccordingToUsage() {
		return riskLevelAccordingToUsage;
	}

	public void setRiskLevelAccordingToUsage(byte[] riskLevelAccordingToUsage) {
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
	}

	public byte[] getRiskLevelAccordingToFloor() {
		return riskLevelAccordingToFloor;
	}

	public void setRiskLevelAccordingToFloor(byte[] riskLevelAccordingToFloor) {
		this.riskLevelAccordingToFloor = riskLevelAccordingToFloor;
	}

	public byte[] getRiskLevelAccordingToSquareFeet() {
		return riskLevelAccordingToSquareFeet;
	}

	public void setRiskLevelAccordingToSquareFeet(byte[] riskLevelAccordingToSquareFeet) {
		this.riskLevelAccordingToSquareFeet = riskLevelAccordingToSquareFeet;
	}

	public byte[] getRiskLevelAccordingToCompensation() {
		return riskLevelAccordingToCompensation;
	}

	public void setRiskLevelAccordingToCompensation(byte[] riskLevelAccordingToCompensation) {
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}
}