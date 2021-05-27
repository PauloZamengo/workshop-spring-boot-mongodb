package com.paulozamengo.workshopmongo.service;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.dto.AlbumDTO;
import com.paulozamengo.workshopmongo.dto.MusicDTO;
import com.paulozamengo.workshopmongo.repository.AlbumRepository;
import com.paulozamengo.workshopmongo.repository.MusicRepository;
import com.paulozamengo.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    public Album findOne(String id) {
        Album album = albumRepository.findById(id).orElse(null);
        if (album == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return album;
    }

    public Album insert(Album obj) {
        return albumRepository.insert(obj);
    }

}
