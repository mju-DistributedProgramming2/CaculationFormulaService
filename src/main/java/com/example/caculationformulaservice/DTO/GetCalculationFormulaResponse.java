package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;

public class GetCalculationFormulaResponse {
    private CalculationFormula calculationFormula;
    public GetCalculationFormulaResponse(CalculationFormula calculationFormula) {this.calculationFormula = calculationFormula;}
    public CalculationFormula getCalculationFormula() {return calculationFormula;}
    public void setCalculationFormula(CalculationFormula calculationFormula) {this.calculationFormula = calculationFormula;}
}
