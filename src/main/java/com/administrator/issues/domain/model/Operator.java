package com.administrator.issues.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "operators")
public class Operator {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "deparment")
    private long deparment;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "version")
    private int version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDeparment() {
        return deparment;
    }

    public void setDeparment(long deparment) {
        this.deparment = deparment;
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
