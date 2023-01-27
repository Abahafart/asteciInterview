package com.administrator.issues.infra.repository;

import com.administrator.issues.domain.model.Operator;
import com.administrator.issues.domain.repository.OperatorRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class OperatorRepositoryImpl implements OperatorRepository {
    @Override
    public Operator getById(long idOperator) {
        return new Operator();
    }

    @Override
    public List<Operator> findByDeparment(String deparment) {
        return Collections.emptyList();
    }
}
