package com.paulozamengo.workshopmongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document
public class Music implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String duracao;

    public Music(){}

    public Music(String id, String nome, String duracao) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
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

    public void setId(String id) { this.id = id; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return id.equals(music.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
