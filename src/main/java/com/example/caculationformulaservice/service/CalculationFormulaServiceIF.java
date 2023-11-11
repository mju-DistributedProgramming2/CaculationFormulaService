package com.example.caculationformulaservice.service;




import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
import com.example.caculationformulaservice.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;
import com.example.caculationformulaservice.Entity.customerInfo.CustomerInfo;
import com.example.caculationformulaservice.enumeration.insurance.InsuranceType;
import com.example.caculationformulaservice.exception.DataDuplicationException;
import com.example.caculationformulaservice.exception.EmptyListException;
import com.example.caculationformulaservice.exception.NoDataException;
import com.example.caculationformulaservice.exception.TimeDelayException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CalculationFormulaServiceIF  extends Remote {

    ArrayList<CalculationFormulaForService> getCalculationFormulaList(InsuranceType insuranceType) throws RemoteException, EmptyListException, TimeDelayException;

    CalculationFormulaForService getCalculationFormula(int id) throws RemoteException, NoDataException;

    int makeFormula(CalculationFormulaForService calculationFormula) throws RemoteException, DataDuplicationException;

    int calculateMaxCompensation(int squareMeter, int calculationFormulaId) throws RemoteException, NoDataException;

    int calculateMinCompensation(int squareMeter, int calculationFormulaId) throws RemoteException, NoDataException;

    int calculatePayment(CustomerInfo customerInfo, int compensation, int calculationFormulaId) throws RemoteException, NoDataException;
    boolean checkNameDuplication(String name) throws DataDuplicationException, RemoteException;

}
