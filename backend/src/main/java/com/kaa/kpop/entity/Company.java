package com.kaa.kpop.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Класс-сущность, представляющий компаний
 */
@Entity
@Table(name = "companies")
public class Company {
    /**
     * Уникальный идентификатор компании
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Название компании
     */
    @Column(name = "name")
    private String name;
    /**
     * Короткое имя компании
     */
    @Column(name = "short_name")
    private String shortName;
    /**
     * Дата основания
     */
    @Column(name = "establishment_date")
    private Date establishmentDate;
    /**
     * Дата закрытия
     */
    @Column(name = "close_date")
    private Date closeDate;
    /**
     * Основатель
     */
    @ManyToOne
    @JoinColumn(name = "founder_id")
    private Artist founder;
    /**
     * Нынешняя глава
     */
    @ManyToOne
    @JoinColumn(name = "chairman_id")
    private Artist chairman;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Artist getFounder() {
        return founder;
    }

    public void setFounder(Artist founder) {
        this.founder = founder;
    }

    public Artist getChairman() {
        return chairman;
    }

    public void setChairman(Artist chairman) {
        this.chairman = chairman;
    }

}
