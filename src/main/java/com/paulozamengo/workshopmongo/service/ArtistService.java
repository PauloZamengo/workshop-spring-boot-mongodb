package com.paulozamengo.workshopmongo.service;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Artist;
import com.paulozamengo.workshopmongo.repository.AlbumRepository;
import com.paulozamengo.workshopmongo.repository.ArtistRepository;
import com.paulozamengo.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public Artist findOne(String id) {
        Artist artist = artistRepository.findById(id).orElse(null);
        if (artist == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return artist;
    }

    public Artist insert(Artist obj) {
        return artistRepository.insert(obj);
    }

}
