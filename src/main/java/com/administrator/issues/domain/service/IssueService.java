package com.administrator.issues.domain.service;

import com.administrator.issues.domain.exception.NotFoundException;
import com.administrator.issues.domain.model.Issue;
import com.administrator.issues.domain.repository.IssueRepository;

import java.time.LocalDateTime;
import java.util.List;

public class IssueService {

    private IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public Issue getById(long id) throws NotFoundException {
        Issue issueFound = issueRepository.getIssueById(id);
        if(id != 1) {
            throw new NotFoundException("Issue not found with id "+id);
        }
        return issueFound;
    }

    public List<Issue> findByDate(LocalDateTime started, LocalDateTime end) {
        return issueRepository.findByDate(started, end);
    }

    public List<Issue> findByOperator(long operatorId) {
        return issueRepository.findByOperator(operatorId);
    }

    public Issue createIssue(Issue issue) {
        return issueRepository.createIssue(issue);
    }

}
