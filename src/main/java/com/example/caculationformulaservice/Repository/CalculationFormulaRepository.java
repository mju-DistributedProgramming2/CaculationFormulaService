package com.example.caculationformulaservice.Repository;

import com.example.caculationformulaservice.Entity.calculationFormula.CalculationFormula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationFormulaRepository extends JpaRepository<CalculationFormula,Integer> {
}
