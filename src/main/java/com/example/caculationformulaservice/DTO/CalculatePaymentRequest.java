package com.example.caculationformulaservice.DTO;

import com.example.caculationformulaservice.Entity.customerInfo.CustomerInfo;

public class CalculatePaymentRequest {
    private CustomerInfo customerInfo;
    private int compensation;
    private int calculationFormulaId;
    public CustomerInfo getCustomerInfo() {return customerInfo;}
    public void setCustomerInfo(CustomerInfo customerInfo) {this.customerInfo = customerInfo;}
    public int getCompensation() {return compensation;}
    public void setCompensation(int compensation) {this.compensation = compensation;}
    public int getCalculationFormulaId() {return calculationFormulaId;}
    public void setCalculationFormulaId(int calculationFormulaId) {this.calculationFormulaId = calculationFormulaId;}
}
