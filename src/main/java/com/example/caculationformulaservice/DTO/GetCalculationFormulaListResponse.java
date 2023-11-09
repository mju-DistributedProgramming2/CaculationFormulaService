package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;

import java.util.ArrayList;

public class GetCalculationFormulaListResponse {
    ArrayList<CalculationFormula> calculationFormulas;
    public GetCalculationFormulaListResponse(ArrayList<CalculationFormula> calculationFormulas) {this.calculationFormulas = calculationFormulas;}
}
