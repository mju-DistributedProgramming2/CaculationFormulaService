package com.omnm.caculationformula.DTO;

import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

public class MakeFormulaRequest {
    private CalculationFormulaForService calculationFormula;

    public CalculationFormulaForService getCalculationFormula() {
        return calculationFormula;
    }

    public void setCalculationFormula(CalculationFormulaForService calculationFormula) {
        this.calculationFormula = calculationFormula;
    }
}
