package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.dto.MusicDTO;
import com.paulozamengo.workshopmongo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/music")
public class MusicResource {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<List<MusicDTO>> findAll(){
        List<Music> list = musicService.findAll();
        List<MusicDTO> listDTO = list.stream().map(x -> new MusicDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<MusicDTO> findById(@PathVariable String id) {
        Music musica = musicService.findOne(id);
        return ResponseEntity.ok().body(new MusicDTO(musica));
    }

}
