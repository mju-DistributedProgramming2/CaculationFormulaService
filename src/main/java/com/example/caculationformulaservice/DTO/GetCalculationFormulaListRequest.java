package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
import com.example.caculationformulaservice.enumeration.insurance.InsuranceType;

import java.util.ArrayList;

public class GetCalculationFormulaListRequest {
    private InsuranceType insuranceType;
    public InsuranceType getInsuranceType() {
        return insuranceType;
    }
    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }
}
