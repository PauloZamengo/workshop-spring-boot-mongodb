package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.dto.AlbumDTO;
import com.paulozamengo.workshopmongo.dto.MusicDTO;
import com.paulozamengo.workshopmongo.service.AlbumService;
import com.paulozamengo.workshopmongo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/album")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping
    public ResponseEntity<List<AlbumDTO>> findAll(){
        List<Album> list = albumService.findAll();
        List<AlbumDTO> listDTO = list.stream().map(x -> new AlbumDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
