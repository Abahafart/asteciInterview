package com.administrator.issues.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "issues")
@Entity
public class Issue {

    public Issue() {

    }

    public Issue(long id, String description, Operator operator, String status, LocalDateTime createdDate, int version) {
        this.id = id;
        this.description = description;
        this.operator = operator;
        this.status = status;
        this.createdDate = createdDate;
        this.version = version;
    }

    @Id
    private long id;

    @Column(name = "description")
    private String description;

    @ManyToOne
//    @JoinColumn(table = "operators", referencedColumnName = "id")
    private Operator operator;

    @Column(name = "status")
    private String status;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "version")
    private int version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
