package com.paulozamengo.workshopmongo.service;

import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository music;

    public List<Music> findAll(){
        return music.findAll();
    }
}
