package com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula;


import com.omnm.caculationformula.enumeration.calculationFormula.OutwallType;
import com.omnm.caculationformula.enumeration.calculationFormula.PillarType;
import com.omnm.caculationformula.enumeration.calculationFormula.RiskLevel;
import com.omnm.caculationformula.enumeration.calculationFormula.RoofType;

import java.io.Serializable;
import java.util.HashMap;


public abstract class CalculationFormulaForService implements Serializable {

	private int id;
	private String name;
	private HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType;
	private HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType;
	private HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType;


	private int multiplierForMinCompensation;

	private int multiplierForMaxCompensation;
	private int multiplierForPayment;
	
	public CalculationFormulaForService(String calculationFormulaName, HashMap<PillarType, RiskLevel> riskAccordingToPillarType,
							  HashMap<RoofType, RiskLevel> riskAccordingToRoofType,
							  HashMap<OutwallType, RiskLevel> riskAccordingToOutwallType, int multiplierForMinCompensation,
							  int multiplierForMaxCompensation, int multiplierForPayment) {
		this.name = calculationFormulaName;
		this.riskLevelAccordingToPillarType = riskAccordingToPillarType;
		this.riskLevelAccordingToRoofType = riskAccordingToRoofType;
		this.riskLevelAccordingToOutwallType = riskAccordingToOutwallType;
		this.multiplierForMinCompensation = multiplierForMinCompensation;
		this.multiplierForMaxCompensation = multiplierForMaxCompensation;
		this.multiplierForPayment = multiplierForPayment;
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

	public HashMap<PillarType, RiskLevel> getRiskLevelAccordingToPillarType() {
		return riskLevelAccordingToPillarType;
	}

	public void setRiskLevelAccordingToPillarType(HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType) {
		this.riskLevelAccordingToPillarType = riskLevelAccordingToPillarType;
	}

	public HashMap<RoofType, RiskLevel> getRiskLevelAccordingToRoofType() {
		return riskLevelAccordingToRoofType;
	}

	public void setRiskLevelAccordingToRoofType(HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType) {
		this.riskLevelAccordingToRoofType = riskLevelAccordingToRoofType;
	}

	public HashMap<OutwallType, RiskLevel> getRiskLevelAccordingToOutwallType() {
		return riskLevelAccordingToOutwallType;
	}

	public void setRiskLevelAccordingToOutwallType(HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType) {
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