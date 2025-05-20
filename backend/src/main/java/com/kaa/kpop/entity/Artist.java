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
 * Класс-сущность, представляющий K-pop артиста.
 */
@Entity
@Table(name = "artists")
public class Artist {
    /**
     * Уникальный идентификатор артиста
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Ссылка на фотографию артиста
     */
    @Column(name = "photo")
    private String photo;
    /**
     * Имя артиста на корейском
     */
    @Column(name = "korean_name")
    private String koreanName;
    /**
     * Имя артиста на английском
     */
    @Column(name = "english_name")
    private String englishName;
    /**
     * Имя артиста на русском
     */
    @Column(name = "russian_name")
    private String russianName;
    /**
     * Признак соло
     */
    @Column(name = "is_solo")
    private boolean isSolo;
    /**
     * День рождения
     */
    @Column(name = "birtday")
    private Date birthday;
    /**
     * День рождения
     */
    @Column(name = "debut_date")
    private Date debutDate;
    /**
     * День смерти
     */
    @Column(name = "death_date")
    private Date deathDate;
    /**
     * День зачисления в армию
     */
    @Column(name = "enlistment_date")
    private Date enlistmentDate;
    /**
     * День увольнения из армии
     */
    @Column(name = "discharge_date")
    private Date dischargeDate;
    /**
     * Группа, в которой состоит артист
     */
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group groupId;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getKoreanName() {
        return koreanName;
    }

    public void setKoreanName(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getRussianName() {
        return russianName;
    }

    public void setRussianName(String russianName) {
        this.russianName = russianName;
    }

    public boolean isSolo() {
        return isSolo;
    }

    public void setSolo(boolean isSolo) {
        this.isSolo = isSolo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(Date debutDate) {
        this.debutDate = debutDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Date getEnlistmentDate() {
        return enlistmentDate;
    }

    public void setEnlistmentDate(Date enlistmentDate) {
        this.enlistmentDate = enlistmentDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
