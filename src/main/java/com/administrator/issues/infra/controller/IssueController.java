package com.administrator.issues.infra.controller;

import com.administrator.issues.domain.exception.NotFoundException;
import com.administrator.issues.domain.model.Issue;
import com.administrator.issues.domain.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/issues/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class IssueController {

    private IssueService issueService;

    @Autowired
    public void setIssueService(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Issue getIssueById(@PathVariable long id) throws NotFoundException {
        return issueService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Issue createIssue(@RequestBody Issue issue) {
        return issueService.createIssue(issue);
    }

    @GetMapping("/started/{started}/end/{end}")
    @ResponseStatus(HttpStatus.OK)
    public List<Issue> findByDate(@PathVariable LocalDateTime started, @PathVariable LocalDateTime end) {
        return issueService.findByDate(started, end);
    }

    @GetMapping("/operator/{operatorId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Issue> findByOperator(@PathVariable long operatorId) {
        return issueService.findByOperator(operatorId);
    }

}
