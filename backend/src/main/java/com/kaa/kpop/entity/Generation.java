package com.kaa.kpop.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Справочник поколений
 */
@Entity
@Table(name = "generations")
public class Generation {
    /**
     * Уникальный идентификатор поколения
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Номер поколения
     */
    @Column(name = "number")
    private String number;
    /**
     * Год начала
     */
    @Column(name = "start_year")
    private Date startYear;
    /**
     * Год конца
     */
    @Column(name = "end_year")
    private Date endYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public Date getEndYear() {
        return endYear;
    }

    public void setEndYear(Date endYear) {
        this.endYear = endYear;
    }
}
