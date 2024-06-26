package com.example.caculationformulaservice.enumeration.calculationFormula;

public enum RiskLevel {
	
	One(1),
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10);
	
	private final int level;

	RiskLevel(int level){
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
}
