package com.kaa.kpop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "albums")
public class Album {
    /**
     * Уникальный идентификатор альбома
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Название альбома
     */
    @Column(name = "name")
    private String name;
    /**
     * Группа, выпустившая альбом
     */
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group groupId;
    /**
     * Артист, выпустивший альбом
     */
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    /**
     * Дата релиза
     */
    @Column(name = "release_date")
    private Date releaseDate;
    /**
     * Компания, под которой был выпущен данный альбом
     */
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

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

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
