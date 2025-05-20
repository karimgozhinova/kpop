package com.kaa.kpop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

/**
 * Класс-сущность, представляющий K-pop группу.
 */
@Entity
@Table(name = "groups")
public class Group {

    /**
     * Уникальный идентификатор группы.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Название группы.
     */
    @Column(nullable = false)
    private String name;

    /**
     * Альтернативные названия группы.
     */
    @Column(name = "short_names")
    private String shortNames;

    /**
     * Ссылка на основное изображение (логотип) группы.
     */
    private String logo;

    /**
     * Дата дебюта группы.
     */
    @Column(name = "debut_date")
    private Date debutDate;

    /**
     * Дата последнего релиза. Обновляется при добавлении альбома или песни.
     */
    @Column(name = "last_release_date")
    private Date lastReleaseDate;

    /**
     * Дата распада группы.
     */
    @Column(name = "disbandment_date")
    private Date disbandmentDate;

    /**
     * Статус группы (активная, неактивная, в хиатусе, распавшаяся).
     */
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * Ссылка на компанию (внешний ключ).
     */
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    /**
     * Поколение группы (ссылка на справочник поколений).
     */
    @ManyToOne
    @JoinColumn(name = "generation_id")
    private Generation generation;

    /**
     * Ссылка на основную группу для подгруппы, либо на старую группу для
     * ребрендингов.
     */
    @ManyToOne
    @JoinColumn(name = "main_group_id")
    private Group mainGroup;
    /**
     * Название фанклуба
     */
    @Column(name = "fanclub")
    private String fanclub;

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

    public String getShortNames() {
        return shortNames;
    }

    public void setShortNames(String shortNames) {
        this.shortNames = shortNames;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(Date debutDate) {
        this.debutDate = debutDate;
    }

    public Date getLastReleaseDate() {
        return lastReleaseDate;
    }

    public void setLastReleaseDate(Date lastReleaseDate) {
        this.lastReleaseDate = lastReleaseDate;
    }

    public Date getDisbandmentDate() {
        return disbandmentDate;
    }

    public void setDisbandmentDate(Date disbandmentDate) {
        this.disbandmentDate = disbandmentDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public Group getMainGroup() {
        return mainGroup;
    }

    public void setMainGroup(Group mainGroup) {
        this.mainGroup = mainGroup;
    }

    public String getFanclub() {
        return fanclub;
    }

    public void setFanclub(String fanclub) {
        this.fanclub = fanclub;
    }

    /**
     * Перечисление для статуса группы.
     */
    public enum Status {
        ACTIVE, INACTIVE, HIATUS, DISBANDED
    }
}
