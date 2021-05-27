package com.paulozamengo.workshopmongo.dto;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Artist;
import com.paulozamengo.workshopmongo.domain.Music;

import java.io.Serializable;
import java.util.List;

public class ArtistDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private String genero;
    private List<Album> album;

    public ArtistDTO(){}

    public ArtistDTO(Artist obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.genero = obj.getGenero();
        this.album = obj.getAlbum();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }
}
