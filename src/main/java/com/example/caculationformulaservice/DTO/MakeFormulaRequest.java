package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;

public class MakeFormulaRequest {
    private CalculationFormula calculationFormula;
    public CalculationFormula getCalculationFormula() {return calculationFormula;}
    public void setCalculationFormula(CalculationFormula calculationFormula) {this.calculationFormula = calculationFormula;}
}
