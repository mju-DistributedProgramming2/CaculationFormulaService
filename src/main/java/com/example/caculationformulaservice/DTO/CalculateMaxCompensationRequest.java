package com.example.caculationformulaservice.DTO;

public class CalculateMaxCompensationRequest {
    private int squareMeter;
    private int calculationFormulaId;
    public int getSquareMeter() {return squareMeter;}
    public void setSquareMeter(int squareMeter) {this.squareMeter = squareMeter;}
    public int getCalculationFormulaId() {return calculationFormulaId;}
    public void setCalculationFormulaId(int calculationFormulaId) {this.calculationFormulaId = calculationFormulaId;}
}
