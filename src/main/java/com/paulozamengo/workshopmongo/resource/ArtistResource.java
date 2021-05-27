package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.Artist;
import com.paulozamengo.workshopmongo.dto.ArtistDTO;
import com.paulozamengo.workshopmongo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/artist")
public class ArtistResource {

    @Autowired
    ArtistService artistService;

    @GetMapping
    public ResponseEntity<List<ArtistDTO>> findAll (){
        List<Artist> listArtist = artistService.findAll();
        List<ArtistDTO> artistDto = listArtist.stream().map(x -> new ArtistDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(artistDto);
    }
}
