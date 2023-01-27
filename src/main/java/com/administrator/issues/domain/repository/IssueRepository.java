package com.administrator.issues.domain.repository;

import com.administrator.issues.domain.model.Issue;

import java.time.LocalDateTime;
import java.util.List;

public interface IssueRepository {

    public Issue getIssueById(long id);
    public List<Issue> findByDate(LocalDateTime day, LocalDateTime end);
    public List<Issue> findByOperator(long operatorId);
    public Issue createIssue(Issue issue);

}
