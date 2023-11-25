package com.omnm.caculationformula.DAO;


import com.omnm.caculationformula.Entity.calculationFormula.CalculationFormula;
import com.omnm.caculationformula.Entity.calculationFormula.HomeFormula;
import com.omnm.caculationformula.Entity.calculationFormula.WorkplaceFormula;
import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.CalculationFormulaForService;
import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.HomeFormulaForService;
import com.omnm.caculationformula.Entity.calculationFormulaForService.calculationFormula.WorkplaceFormulaForService;
import com.omnm.caculationformula.Repository.CalculationFormulaRepository;
import com.omnm.caculationformula.Repository.HomeFormulaRepository;
import com.omnm.caculationformula.Repository.WorkplaceFormulaRepository;
import com.omnm.caculationformula.enumeration.insurance.InsuranceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CalculationFormulaDao extends Dao {
	@Autowired
	private final CalculationFormulaRepository calculationFormulaRepository;
	@Autowired
	private final HomeFormulaRepository homeFormulaRepository;
	@Autowired
	private final WorkplaceFormulaRepository workplaceFormulaRepository;
	public CalculationFormulaDao(CalculationFormulaRepository calculationFormulaRepository, HomeFormulaRepository homeFormulaRepository, WorkplaceFormulaRepository workplaceFormulaRepository) {
		super();
		this.calculationFormulaRepository = calculationFormulaRepository;
		this.homeFormulaRepository = homeFormulaRepository;
		this.workplaceFormulaRepository = workplaceFormulaRepository;
	}
	public boolean create(CalculationFormulaForService calculationFormulaForService) {
		//			PreparedStatement ps = null;
//			ps = connection.prepareStatement("insert into calculationformula values (?, ?, ?, ?, ?, ?, ?, ?) ");
//			ps.setInt(1, calculationFormula.getId());
//			ps.setString(2, calculationFormula.getName());
//			ps.setBytes(3, serialize(calculationFormula.getRiskAccordingToPillarType()));
//			ps.setBytes(4, serialize(calculationFormula.getRiskAccordingToRoofType()));
//			ps.setBytes(5, serialize(calculationFormula.getRiskAccordingToOutwallType()));
//			ps.setInt(6, calculationFormula.getMultiplierForMinCompensation());
//			ps.setInt(7, calculationFormula.getMultiplierForMaxCompensation());
//			ps.setInt(8,calculationFormula.getMultiplierForPayment());
//			ps.executeUpdate();
//			ps.close();
//			if(calculationFormula instanceof HomeFormula){
//				HomeFormula homeFormula = (HomeFormula) calculationFormula;
//				ps = connection.prepareStatement("insert into homeformula values (?, ?, ?, ?, ?) ");
//				ps.setInt(1, homeFormula.getId());
//				ps.setBytes(2, serialize(homeFormula.getRiskLevelAccordingToResidenceType()));
//				ps.setBytes(3, serialize(homeFormula.getRiskLevelAccordingToHouseType()));
//				ps.setBytes(4, serialize(homeFormula.getRiskLevelAccordingToSquareMeter()));
//				ps.setBytes(5, serialize(homeFormula.getRiskLevelAccordingToCompensation()));
//				ps.executeUpdate();
//				ps.close();
//			}else{
//				WorkplaceFormula workplaceFormula = (WorkplaceFormula) calculationFormula;
//				ps = connection.prepareStatement("insert into workplaceformula values (?, ?, ?, ?, ?) ");
//				ps.setInt(1, workplaceFormula.getId());
//				ps.setBytes(2, serialize(workplaceFormula.getRiskLevelAccordingToUsage()));
//				ps.setBytes(3, serialize(workplaceFormula.getRiskLevelAccordingToFloor()));
//				ps.setBytes(4, serialize(workplaceFormula.getRiskLevelAccordingToSquareMeter()));
//				ps.setBytes(5, serialize(workplaceFormula.getRiskLevelAccordingToCompensation()));
//				ps.executeUpdate();
//				ps.close();
//			}
		CalculationFormula calculationFormula;
		if(calculationFormulaForService instanceof HomeFormulaForService){
			HomeFormula homeFormula = new HomeFormula(calculationFormulaForService);
			homeFormula.setRiskLevelAccordingToPillarType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToPillarType()));
			homeFormula.setRiskLevelAccordingToRoofType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToRoofType()));
			homeFormula.setRiskLevelAccordingToOutwallType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToOutwallType()));
			homeFormula.setRiskLevelAccordingToResidenceType(this.serialize(((HomeFormulaForService) calculationFormulaForService).getRiskLevelAccordingToResidenceType()));
			homeFormula.setRiskLevelAccordingToHouseType(this.serialize(((HomeFormulaForService) calculationFormulaForService).getRiskLevelAccordingToHouseType()));
			homeFormula.setRiskLevelAccordingToSquareMeter(this.serialize(((HomeFormulaForService) calculationFormulaForService).getRiskLevelAccordingToSquareMeter()));
			homeFormula.setRiskLevelAccordingToCompensation(this.serialize(((HomeFormulaForService) calculationFormulaForService).getRiskLevelAccordingToCompensation()));
			calculationFormula = homeFormula;
		}else{
			WorkplaceFormula workplaceFormula = new WorkplaceFormula(calculationFormulaForService);
			workplaceFormula.setRiskLevelAccordingToPillarType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToPillarType()));
			workplaceFormula.setRiskLevelAccordingToRoofType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToRoofType()));
			workplaceFormula.setRiskLevelAccordingToOutwallType(this.serialize(calculationFormulaForService.getRiskLevelAccordingToOutwallType()));
			workplaceFormula.setRiskLevelAccordingToUsage(this.serialize(((WorkplaceFormulaForService) calculationFormulaForService).getRiskLevelAccordingToUsage()));
			workplaceFormula.setRiskLevelAccordingToFloor(this.serialize(((WorkplaceFormulaForService) calculationFormulaForService).getRiskLevelAccordingToFloor()));
			workplaceFormula.setRiskLevelAccordingToSquareFeet(this.serialize(((WorkplaceFormulaForService) calculationFormulaForService).getRiskLevelAccordingToSquareMeter()));
			workplaceFormula.setRiskLevelAccordingToCompensation(this.serialize(((WorkplaceFormulaForService) calculationFormulaForService).getRiskLevelAccordingToCompensation()));
			calculationFormula = workplaceFormula;
		}
		if(calculationFormulaRepository.save(calculationFormula)==null) return false;
		return true;
	}
	public List<CalculationFormulaForService> retrieve(){
//		try {
//			ArrayList<CalculationFormula> calculationFormulaList = new ArrayList<>();
//			PreparedStatement ps = null;
//			ps = connection.prepareStatement("select * from calculationformula, homeformula where calculationformula.id=homeformula.id;");
//			resultSet = ps.executeQuery();
//			while (resultSet.next()){
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("name");
//				HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType
//						= (HashMap<PillarType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToPillarType"));
//				HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType
//						= (HashMap<RoofType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToRoofType"));
//				HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType
//						= (HashMap<OutwallType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToOutwallType"));
//				int multiplierForMinCompensation = resultSet.getInt("multiplierForMinCompensation");
//				int multiplierForMaxCompensation = resultSet.getInt("multiplierForMaxCompensation");
//				int multiplierForPayment = resultSet.getInt("multiplierForPayment");
//				HashMap<ResidenceType, RiskLevel> riskLevelAccordingToResidenceType
//						= (HashMap<ResidenceType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToResidenceType"));
//				HashMap<HouseType, RiskLevel> riskLevelAccordingToHouseType
//						= (HashMap<HouseType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToHouseType"));
//				HashMap<HomeSquareMeter, RiskLevel> riskLevelAccordingToSquareMeter
//						= (HashMap<HomeSquareMeter, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToSquareMeter"));
//				HashMap<HomeCompensation, RiskLevel> riskLevelAccordingToCompensation
//						= (HashMap<HomeCompensation, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToCompensation"));
//				HomeFormula homeFormula = new HomeFormula(
//						name,riskLevelAccordingToPillarType,riskLevelAccordingToRoofType,
//						riskLevelAccordingToOutwallType,multiplierForMinCompensation,
//						multiplierForMaxCompensation,multiplierForPayment,
//						riskLevelAccordingToResidenceType, riskLevelAccordingToHouseType,
//						riskLevelAccordingToSquareMeter, riskLevelAccordingToCompensation
//				);
//				homeFormula.setId(id);
//				calculationFormulaList.add(homeFormula);
//			}
//			ps.close();
//			resultSet.close();
//
//			ps = connection.prepareStatement("select * from calculationformula, workplaceformula where calculationformula.id=workplaceformula.id;");
//			resultSet = ps.executeQuery();
//			while (resultSet.next()){
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("name");
//				HashMap<PillarType, RiskLevel> riskLevelAccordingToPillarType
//						= (HashMap<PillarType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToPillarType"));
//				HashMap<RoofType, RiskLevel> riskLevelAccordingToRoofType
//						= (HashMap<RoofType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToRoofType"));
//				HashMap<OutwallType, RiskLevel> riskLevelAccordingToOutwallType
//						= (HashMap<OutwallType, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToOutwallType"));
//				int multiplierForMinCompensation = resultSet.getInt("multiplierForMinCompensation");
//				int multiplierForMaxCompensation = resultSet.getInt("multiplierForMaxCompensation");
//				int multiplierForPayment = resultSet.getInt("multiplierForPayment");
//				HashMap<WorkplaceUsage, RiskLevel> riskLevelAccordingToUsage
//						= (HashMap<WorkplaceUsage, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToUsage"));
//				HashMap<Floor, RiskLevel> riskLevelAccordingToFloor
//						= (HashMap<Floor, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToFloor"));
//				HashMap<WorkplaceSquareMeter, RiskLevel> riskLevelAccordingToSquareFeet
//						= (HashMap<WorkplaceSquareMeter, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToSquareFeet"));
//				HashMap<WorkplaceCompensation, RiskLevel> riskLevelAccordingToCompensation
//						= (HashMap<WorkplaceCompensation, RiskLevel>) deSerialize(resultSet.getBytes("riskLevelAccordingToCompensation"));
//				WorkplaceFormula workplaceFormula = new WorkplaceFormula(
//						name,riskLevelAccordingToPillarType,riskLevelAccordingToRoofType,
//						riskLevelAccordingToOutwallType,multiplierForMinCompensation,
//						multiplierForMaxCompensation,multiplierForPayment,
//						riskLevelAccordingToUsage, riskLevelAccordingToFloor,
//						riskLevelAccordingToSquareFeet, riskLevelAccordingToCompensation
//				);
//				workplaceFormula.setId(id);
//				calculationFormulaList.add(workplaceFormula);
//			}
//			ps.close();
//			resultSet.close();
//			return calculationFormulaList;
//		} catch (SQLException | IOException e) {
//			e.printStackTrace();
//			return new ArrayList<>();
//		}
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		for(CalculationFormula a:calculationFormulaRepository.findAll()){
			System.out.println(a.toString());
			System.out.println("---------------------------------------------------------");

			System.out.println(a.getClass());
			System.out.println("---------------------------------------------------------");

		}
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

		return null;
	}
	public int add(CalculationFormulaForService calculationFormulaForService) {
		List<CalculationFormulaForService> calculationFormulaList = retrieve();
		if(calculationFormulaList.size()==0) calculationFormulaForService.setId(1);
		else {calculationFormulaForService.setId(getLastId(calculationFormulaList)+1);}
		if(create(calculationFormulaForService)) return calculationFormulaForService.getId();
		else {return 0;}
	}
	public CalculationFormulaForService findById(int id) {
		for(CalculationFormulaForService calculationformula : retrieve()) {
			if(calculationformula.getId() == id){
			//	CalculationFormulaForService calculationFormulaForService = new CalculationFormulaForService();
				return calculationformula;
			}
		}
		return null;
	}
	public CalculationFormula findByName(String name) {
		for(CalculationFormulaForService calculationformula : retrieve()) {
			if(calculationformula.getName().equals(name)) return null;
		}
		return null;
	}
	public ArrayList<CalculationFormulaForService> findByType(InsuranceType insuranceType) {
		ArrayList<CalculationFormulaForService> formulaListByType = new ArrayList<>();
		for(CalculationFormulaForService calculationFormula : retrieve()) {
			if(insuranceType==InsuranceType.HomeFire) {
				if(calculationFormula instanceof HomeFormulaForService) {formulaListByType.add(calculationFormula);}}
			if(insuranceType==InsuranceType.WorkplaceFire) {
				if(calculationFormula instanceof WorkplaceFormulaForService) {formulaListByType.add(calculationFormula);}}
		}
		return formulaListByType;
	}
	public byte[] serialize(Object object) {
		byte[] byteArray = null;
		ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutStream;
		try {
			objectOutStream = new ObjectOutputStream(byteOutStream);
			objectOutStream.writeObject(object);
			byteArray = byteOutStream.toByteArray();
			objectOutStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return byteArray;
	}

	public Object deSerialize(byte[] byteArray) throws IOException {
		Object object = null;
		ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArray);
		ObjectInputStream objectInStream;
		try {
			objectInStream = new ObjectInputStream(byteInputStream);
			object = objectInStream.readObject();
			objectInStream.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object ;
	}

	public int getLastId(List<CalculationFormulaForService> calculationFormulaList){
		int id = 0;
		for(CalculationFormulaForService calculationFormula : calculationFormulaList){
			if(calculationFormula.getId() > id) id = calculationFormula.getId();
		}
		return id;
	}
}