package com.paulozamengo.workshopmongo.service;

import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.dto.MusicDTO;
import com.paulozamengo.workshopmongo.repository.MusicRepository;
import com.paulozamengo.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicService {

    @Autowired
    private MusicRepository music;

    public List<Music> findAll() {
        return music.findAll();
    }

    public Music findOne(String id) {
        Music musica = music.findById(id).orElse(null);
        if (musica == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return musica;
    }

    public Music insert(Music obj) {
        return music.insert(obj);
    }

    public Music fromDTO(MusicDTO objDTO) {
        return new Music(objDTO.getId(), objDTO.getDuracao(), objDTO.getNome());
    }

    public void delete(String id) {
        findOne(id);
        music.deleteById(id);
    }

    public Music update(Music obj) {
        Music newMusica = findOne(obj.getId());
        updateData(newMusica, obj);
        return music.save(newMusica);
    }

    public void updateData(Music newObj, Music obj) {
        newObj.setNome(obj.getNome());
        newObj.setDuracao(obj.getDuracao());
    }
}
