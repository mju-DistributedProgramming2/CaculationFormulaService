package com.example.caculationformulaservice.controller;


import com.example.caculationformulaservice.DTO.calculationFormula.CalculationFormula;
import com.example.caculationformulaservice.DTO.customerInfo.CustomerInfo;
import com.example.caculationformulaservice.enumeration.insurance.InsuranceType;
import com.example.caculationformulaservice.exception.DataDuplicationException;
import com.example.caculationformulaservice.exception.EmptyListException;
import com.example.caculationformulaservice.exception.NoDataException;
import com.example.caculationformulaservice.exception.TimeDelayException;
import com.example.caculationformulaservice.service.CalculationFormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.RemoteException;
import java.util.ArrayList;

@RestController
public class Controller {
    @Autowired
    CalculationFormulaService calculationFormulaService;
    @GetMapping("/calculationFormulas")
    public ArrayList<CalculationFormula> getCalculationFormulaList(InsuranceType insuranceType) throws RemoteException, EmptyListException, TimeDelayException {
        return this.calculationFormulaService.getCalculationFormulaList(insuranceType);
    }
    @GetMapping("/calculationFormula")
    public CalculationFormula getCalculationFormula(Integer id) throws RemoteException, NoDataException {
        return calculationFormulaService.getCalculationFormula(id);
    }
    @PostMapping("/calculationFormula")
    public int makeFormula(@RequestBody CalculationFormula calculationFormula) throws RemoteException, DataDuplicationException {
        return calculationFormulaService.makeFormula(calculationFormula);
    }
    @GetMapping("/maxCompensation")
    public int calculateMaxCompensation(Integer squareMeter, Integer calculationFormulaId) throws RemoteException, NoDataException {
        return calculationFormulaService.calculateMaxCompensation(squareMeter,calculationFormulaId);
    }
    @GetMapping("/minCompensation")
    public int calculateMinCompensation(Integer squareMeter, Integer calculationFormulaId) throws RemoteException, NoDataException {
        return calculationFormulaService.calculateMinCompensation(squareMeter,calculationFormulaId);
    }
    @GetMapping("/payment")
    public int calculatePayment(CustomerInfo customerInfo, Integer compensation, Integer calculationFormulaId) throws RemoteException, NoDataException {
        return calculationFormulaService.calculatePayment(customerInfo,compensation,calculationFormulaId);
    }
    @GetMapping("/duplication")
    public boolean checkNameDuplication(String name) throws RemoteException, DataDuplicationException {
        return calculationFormulaService.checkNameDuplication(name);
    }
    }
