package com.administrator.issues.domain.repository;

import com.administrator.issues.domain.model.Operator;

import java.util.List;

public interface OperatorRepository {

    public Operator getById(long idOperator);

    public List<Operator> findByDeparment(String deparment);

}
