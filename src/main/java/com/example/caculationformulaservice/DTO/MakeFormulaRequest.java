package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
import com.example.caculationformulaservice.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

public class MakeFormulaRequest {
    private CalculationFormulaForService calculationFormula;

    public CalculationFormulaForService getCalculationFormula() {
        return calculationFormula;
    }

    public void setCalculationFormula(CalculationFormulaForService calculationFormula) {
        this.calculationFormula = calculationFormula;
    }
}
