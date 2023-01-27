package com.administrator.issues.infra.repository;

import com.administrator.issues.domain.model.Issue;
import com.administrator.issues.domain.model.Operator;
import com.administrator.issues.domain.repository.IssueRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Repository
public class IssueRepositoryImpl implements IssueRepository {

    private final Issue created = new Issue(1, "not found topic in specific area", new Operator(), "created", LocalDateTime.now(), 0);
    @Override
    @Cacheable
    public Issue getIssueById(long id) {
        return created;
    }

    @Override
    public List<Issue> findByDate(LocalDateTime start, LocalDateTime end) {
        return Collections.emptyList();
    }

    @Override
    public List<Issue> findByOperator(long operatorId) {
        return List.of(created);
    }

    @Override
    @Transactional
    public Issue createIssue(Issue issue) {
        return created;
    }
}
