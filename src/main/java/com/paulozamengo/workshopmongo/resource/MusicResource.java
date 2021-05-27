package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.dto.MusicDTO;
import com.paulozamengo.workshopmongo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
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

    @PostMapping()
    public ResponseEntity<Void> insert(@RequestBody MusicDTO objDTO) {
        Music musica = musicService.fromDTO(objDTO);
        musica = musicService.insert(musica);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objDTO.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        musicService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable String id,
                                       @RequestBody MusicDTO objDTO) {
        Music musica = musicService.fromDTO(objDTO);
        musica.setId(id);
        musica = musicService.update(musica);

        return ResponseEntity.noContent().build();
    }

}
