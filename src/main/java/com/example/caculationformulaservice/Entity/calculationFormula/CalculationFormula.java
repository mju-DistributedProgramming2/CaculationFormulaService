package com.example.caculationformulaservice.Entity.calculationFormula;


import com.example.caculationformulaservice.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "formula_type")
public abstract class CalculationFormula implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Lob
	@Column(name = "riskLevelAccordingToPillarType", nullable = false)
	private byte[] riskLevelAccordingToPillarType;

	@Lob
	@Column(name = "riskLevelAccordingToRoofType", nullable = false)
	private byte[] riskLevelAccordingToRoofType;

	@Lob
	@Column(name = "riskLevelAccordingToOutwallType", nullable = false)
	private byte[] riskLevelAccordingToOutwallType;

	@Column(name = "multiplierForMinCompensation", nullable = false)
	private int multiplierForMinCompensation;

	@Column(name = "multiplierForMaxCompensation", nullable = false)
	private int multiplierForMaxCompensation;

	@Column(name = "multiplierForPayment", nullable = false)
	private int multiplierForPayment;
	

	public CalculationFormula(CalculationFormulaForService calculationFormulaForService) {
		this.id = calculationFormulaForService.getId();
		this.name = calculationFormulaForService.getName();
		this.multiplierForMinCompensation = calculationFormulaForService.getMultiplierForMinCompensation();
		this.multiplierForMaxCompensation = calculationFormulaForService.getMultiplierForMaxCompensation();
		this.multiplierForPayment = calculationFormulaForService.getMultiplierForPayment();
	}

	public CalculationFormula() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getRiskLevelAccordingToPillarType() {
		return riskLevelAccordingToPillarType;
	}

	public void setRiskLevelAccordingToPillarType(byte[] riskLevelAccordingToPillarType) {
		this.riskLevelAccordingToPillarType = riskLevelAccordingToPillarType;
	}

	public byte[] getRiskLevelAccordingToRoofType() {
		return riskLevelAccordingToRoofType;
	}

	public void setRiskLevelAccordingToRoofType(byte[] riskLevelAccordingToRoofType) {
		this.riskLevelAccordingToRoofType = riskLevelAccordingToRoofType;
	}

	public byte[] getRiskLevelAccordingToOutwallType() {
		return riskLevelAccordingToOutwallType;
	}

	public void setRiskLevelAccordingToOutwallType(byte[] riskLevelAccordingToOutwallType) {
		this.riskLevelAccordingToOutwallType = riskLevelAccordingToOutwallType;
	}

	public int getMultiplierForMinCompensation() {
		return multiplierForMinCompensation;
	}

	public void setMultiplierForMinCompensation(int multiplierForMinCompensation) {
		this.multiplierForMinCompensation = multiplierForMinCompensation;
	}

	public int getMultiplierForMaxCompensation() {
		return multiplierForMaxCompensation;
	}

	public void setMultiplierForMaxCompensation(int multiplierForMaxCompensation) {
		this.multiplierForMaxCompensation = multiplierForMaxCompensation;
	}

	public int getMultiplierForPayment() {
		return multiplierForPayment;
	}

	public void setMultiplierForPayment(int multiplierForPayment) {
		this.multiplierForPayment = multiplierForPayment;
	}
}