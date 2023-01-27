package com.administrator.issues.infra.configuration;

import com.administrator.issues.domain.service.IssueService;
import com.administrator.issues.infra.repository.IssueRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigService {

    @Bean
    public IssueService createIssueService() {
        return new IssueService(new IssueRepositoryImpl());
    }

}
