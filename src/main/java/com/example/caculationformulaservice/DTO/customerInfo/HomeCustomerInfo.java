package com.example.caculationformulaservice.DTO.customerInfo;


import com.example.caculationformulaservice.enumeration.calculationFormula.OutwallType;
import com.example.caculationformulaservice.enumeration.calculationFormula.PillarType;
import com.example.caculationformulaservice.enumeration.calculationFormula.RoofType;
import com.example.caculationformulaservice.enumeration.calculationFormula.homeFormula.HouseType;
import com.example.caculationformulaservice.enumeration.calculationFormula.homeFormula.ResidenceType;

public class HomeCustomerInfo extends CustomerInfo {
    private HouseType houseType;
    private ResidenceType residenceType;

    public HomeCustomerInfo(String customerId, int squareMeter, PillarType pillarType, RoofType roofType, OutwallType outwallType, HouseType houseType, ResidenceType residenceType) {
        super(customerId, squareMeter, pillarType, roofType, outwallType);
        this.houseType = houseType;
        this.residenceType = residenceType;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public ResidenceType getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(ResidenceType residenceType) {
        this.residenceType = residenceType;
    }
}
