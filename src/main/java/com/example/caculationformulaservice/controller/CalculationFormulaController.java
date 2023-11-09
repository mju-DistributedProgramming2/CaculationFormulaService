package com.example.caculationformulaservice.controller;


import com.example.caculationformulaservice.DTO.*;
import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
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
public class CalculationFormulaController {
    @Autowired
    CalculationFormulaService calculationFormulaService;
    @GetMapping("/calculationFormulas")
    public GetCalculationFormulaListResponse getCalculationFormulaList(GetCalculationFormulaListRequest GetCalculationFormulaListrequest) throws RemoteException, EmptyListException, TimeDelayException {
        ArrayList<CalculationFormula> calculationFormulas = this.calculationFormulaService.getCalculationFormulaList(GetCalculationFormulaListrequest.getInsuranceType());
        GetCalculationFormulaListResponse getCalculationFormulaListResponse = new GetCalculationFormulaListResponse(calculationFormulas);
        return getCalculationFormulaListResponse;
    }
    @GetMapping("/calculationFormula")
    public GetCalculationFormulaResponse getCalculationFormula(GetCalculationFormulaRequest getCalculationFormulaRequest) throws RemoteException, NoDataException {
        CalculationFormula CalculationFormula =calculationFormulaService.getCalculationFormula(getCalculationFormulaRequest.getId());
        GetCalculationFormulaResponse getCalculationFormulaResponse = new GetCalculationFormulaResponse(CalculationFormula);
        return getCalculationFormulaResponse;
    }
    @PostMapping("/calculationFormula")
    public MakeFormulaResponse makeFormula(@RequestBody MakeFormulaRequest makeFormulaRequest) throws RemoteException, DataDuplicationException {
        int id = calculationFormulaService.makeFormula(makeFormulaRequest.getCalculationFormula());
        MakeFormulaResponse makeFormulaResponse = new MakeFormulaResponse(id);
        return makeFormulaResponse;
    }
    @GetMapping("/maxCompensation")
    public CalculateMaxCompensationResponse calculateMaxCompensation(CalculateMaxCompensationRequest calculateMaxCompensationRequest) throws RemoteException, NoDataException {
        int maxCompensation = calculationFormulaService.calculateMaxCompensation(calculateMaxCompensationRequest.getSquareMeter(),calculateMaxCompensationRequest.getCalculationFormulaId());
        CalculateMaxCompensationResponse calculateMaxCompensationResponse = new CalculateMaxCompensationResponse(maxCompensation);
        return calculateMaxCompensationResponse;
    }
    @GetMapping("/minCompensation")
    public CalculateMinCompensationResponse calculateMinCompensation(CalculateMinCompensationRequest calculateMinCompensationRequest) throws RemoteException, NoDataException {
        int minCompensation = calculationFormulaService.calculateMaxCompensation(calculateMinCompensationRequest.getSquareMeter(),calculateMinCompensationRequest.getCalculationFormulaId());
        CalculateMinCompensationResponse calculateMinCompensationResponse = new CalculateMinCompensationResponse(minCompensation);
        return calculateMinCompensationResponse;
    }
    @GetMapping("/payment")
    public CalculatePaymentResponse calculatePayment(CalculatePaymentRequest calculatePaymentRequest) throws RemoteException, NoDataException {
        int payment = calculationFormulaService.calculatePayment(calculatePaymentRequest.getCustomerInfo(),calculatePaymentRequest.getCompensation(),calculatePaymentRequest.getCalculationFormulaId());
        CalculatePaymentResponse calculatePaymentResponse = new CalculatePaymentResponse(payment);
        return calculatePaymentResponse;
    }
    @GetMapping("/duplication")
    public CheckNameDuplicationResponse checkNameDuplication(CheckNameDuplicationRequest checkNameDuplicationRequest) throws RemoteException, DataDuplicationException {
        boolean nameDuplication = calculationFormulaService.checkNameDuplication(checkNameDuplicationRequest.getName());
        CheckNameDuplicationResponse checkNameDuplicationResponse = new CheckNameDuplicationResponse(nameDuplication);
        return checkNameDuplicationResponse;
    }
    }
