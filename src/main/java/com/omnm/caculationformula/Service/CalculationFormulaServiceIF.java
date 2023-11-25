package com.omnm.caculationformula.Service;




import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;
import com.omnm.caculationformula.Entity.customerInfo.CustomerInfo;
import com.omnm.caculationformula.enumeration.insurance.InsuranceType;
import com.omnm.caculationformula.exception.DataDuplicationException;
import com.omnm.caculationformula.exception.EmptyListException;
import com.omnm.caculationformula.exception.NoDataException;
import com.omnm.caculationformula.exception.TimeDelayException;

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
