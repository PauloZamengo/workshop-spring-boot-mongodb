package com.paulozamengo.workshopmongo.dto;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Music;

import java.io.Serializable;
import java.util.List;

public class AlbumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private String capa;
    private String produtor;
    private String data_album;
    private List<Music> music;

    public AlbumDTO(){}

    public AlbumDTO(Album obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.capa = obj.getCapa();
        this.produtor = obj.getProdutor();
        this.data_album = obj.getData_album();
        this.music = obj.getMusic();
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

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getData_album() {
        return data_album;
    }

    public void setData_album(String data_album) {
        this.data_album = data_album;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }
}
