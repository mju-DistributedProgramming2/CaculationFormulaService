package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
import com.example.caculationformulaservice.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;

import java.util.ArrayList;

public class GetCalculationFormulaListResponse {
    ArrayList<CalculationFormulaForService> calculationFormulas;

    public GetCalculationFormulaListResponse(ArrayList<CalculationFormulaForService> calculationFormulas) {
        this.calculationFormulas = calculationFormulas;
    }

    public ArrayList<CalculationFormulaForService> getCalculationFormulas() {
        return calculationFormulas;
    }

    public void setCalculationFormulas(ArrayList<CalculationFormulaForService> calculationFormulas) {
        this.calculationFormulas = calculationFormulas;
    }
}
