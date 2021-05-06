package com.paulozamengo.workshopmongo.dto;

import com.paulozamengo.workshopmongo.domain.Music;

import java.io.Serializable;

public class MusicDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private String duracao;

    public MusicDTO(){}

    public MusicDTO(Music obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.duracao = obj.getDuracao();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
