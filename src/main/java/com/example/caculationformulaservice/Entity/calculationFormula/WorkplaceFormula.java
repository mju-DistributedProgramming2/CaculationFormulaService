package com.example.caculationformulaservice.Entity.calculationFormula;




import com.example.caculationformulaservice.enumeration.calculationFormula.OutwallType;
import com.example.caculationformulaservice.enumeration.calculationFormula.PillarType;
import com.example.caculationformulaservice.enumeration.calculationFormula.RiskLevel;
import com.example.caculationformulaservice.enumeration.calculationFormula.RoofType;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.Floor;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceCompensation;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceSquareMeter;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceUsage;

import java.util.HashMap;


public class WorkplaceFormula extends CalculationFormula {

	private HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage;
	private HashMap<Floor, RiskLevel> riskLevelAccordingToFloor;
	private HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet;
	private HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation;
	
	public WorkplaceFormula(String calculationFormulaName, HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType,
							HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType,
							HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType, int numToMultiplyForMinCompensation,
							int numToMultiplyForMaxCompensation, int numToMultiplyForPayment,
							HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage,
							HashMap<Floor, RiskLevel> riskLevelAccordingToFloor,
							HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet,
							HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		super(calculationFormulaName, riskLevelAccordingToPillarType, riskLevelAccordingToRoofType,
				riskLevelAccordingToOutwallType, numToMultiplyForMinCompensation, numToMultiplyForMaxCompensation,
				numToMultiplyForPayment);
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
		this.riskLevelAccordingToFloor = riskLevelAccordingToFloor;
		this.riskLevelAccordingToSquareFeet = riskLevelAccordingToSquareFeet;
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}

	public HashMap<WorkplaceUsage, RiskLevel> getRiskLevelAccordingToUsage() {
		return riskLevelAccordingToUsage;
	}

	public void setRiskLevelAccordingToUsage(HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage) {
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
	}

	public HashMap<Floor, RiskLevel> getRiskLevelAccordingToFloor() {
		return riskLevelAccordingToFloor;
	}

	public void setRiskLevelAccordingToFloor(HashMap<Floor, RiskLevel> riskLevelAccordingToFloor) {
		this.riskLevelAccordingToFloor = riskLevelAccordingToFloor;
	}

	public HashMap<WorkplaceSquareMeter, RiskLevel> getRiskLevelAccordingToSquareMeter() {
		return riskLevelAccordingToSquareFeet;
	}

	public void setRiskLevelAccordingToSquareMeter(HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet) {
		this.riskLevelAccordingToSquareFeet = riskLevelAccordingToSquareFeet;
	}

	public HashMap<WorkplaceCompensation, RiskLevel> getRiskLevelAccordingToCompensation() {
		return riskLevelAccordingToCompensation;
	}

	public void setRiskLevelAccordingToCompensation(
			HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}

}