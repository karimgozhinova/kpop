package com.kaa.kpop.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "songs")
public class Song {
    /**
     * Уникальный идентификатор песни
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Название песни
     */
    @Column(name = "name")
    private String name;
    /**
     * Из какого альбома
     */
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    /**
     * Жанры
     */
    @ManyToMany
    @JoinTable(name = "song_genres", joinColumns = @JoinColumn(name = "song_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
    /**
     * Какой группы
     */
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    /**
     * Какого певца
     */
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    /**
     * Есть ли клип
     */
    @Column(name = "is_mv")
    private boolean isMv;

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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public boolean isMv() {
        return isMv;
    }

    public void setMv(boolean isMv) {
        this.isMv = isMv;
    }
}
