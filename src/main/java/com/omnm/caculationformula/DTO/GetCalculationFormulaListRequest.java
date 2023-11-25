package com.omnm.caculationformula.DTO;

import com.omnm.caculationformula.enumeration.insurance.InsuranceType;

public class GetCalculationFormulaListRequest {
    private InsuranceType insuranceType;
    public InsuranceType getInsuranceType() {
        return insuranceType;
    }
    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }
}
