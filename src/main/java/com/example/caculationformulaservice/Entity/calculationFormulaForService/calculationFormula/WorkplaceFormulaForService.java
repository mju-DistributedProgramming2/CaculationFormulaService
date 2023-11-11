package com.example.caculationformulaservice.Entity.calculationFormulaForService.calculationFormula;




import com.example.caculationformulaservice.enumeration.calculationFormula.OutwallType;
import com.example.caculationformulaservice.enumeration.calculationFormula.PillarType;
import com.example.caculationformulaservice.enumeration.calculationFormula.RiskLevel;
import com.example.caculationformulaservice.enumeration.calculationFormula.RoofType;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.Floor;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceCompensation;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceSquareMeter;
import com.example.caculationformulaservice.enumeration.calculationFormula.workplaceFormula.WorkplaceUsage;

import java.util.HashMap;


public class WorkplaceFormulaForService extends CalculationFormulaForService {

	private HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage;
	private HashMap<Floor, RiskLevel> riskLevelAccordingToFloor;
	private HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareMeter;
	private HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation;
	
	public WorkplaceFormulaForService(String calculationFormulaName, HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType,
							HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType,
							HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType, int numToMultiplyForMinCompensation,
							int numToMultiplyForMaxCompensation, int numToMultiplyForPayment,
							HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage,
							HashMap<Floor, RiskLevel> riskLevelAccordingToFloor,
							HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareMeter,
							HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		super(calculationFormulaName, riskLevelAccordingToPillarType, riskLevelAccordingToRoofType,
				riskLevelAccordingToOutwallType, numToMultiplyForMinCompensation, numToMultiplyForMaxCompensation,
				numToMultiplyForPayment);
		this.riskLevelAccordingToUsage = riskLevelAccordingToUsage;
		this.riskLevelAccordingToFloor = riskLevelAccordingToFloor;
		this.riskLevelAccordingToSquareMeter = riskLevelAccordingToSquareMeter;
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
		return riskLevelAccordingToSquareMeter;
	}

	public void setRiskLevelAccordingToSquareMeter(HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareMeter) {
		this.riskLevelAccordingToSquareMeter = riskLevelAccordingToSquareMeter;
	}

	public HashMap<WorkplaceCompensation, RiskLevel> getRiskLevelAccordingToCompensation() {
		return riskLevelAccordingToCompensation;
	}

	public void setRiskLevelAccordingToCompensation(HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation) {
		this.riskLevelAccordingToCompensation = riskLevelAccordingToCompensation;
	}
}