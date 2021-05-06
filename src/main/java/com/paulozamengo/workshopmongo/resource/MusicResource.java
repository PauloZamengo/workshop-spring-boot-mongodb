package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.Music;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/music")
public class MusicResource {

    @GetMapping
    public ResponseEntity<List<Music>> findAll(){
        Music pyro = new Music("1", "Pyro", "3:24");
        Music theAfternoonsHat = new Music("2", "The Afternoons Hat", "3:32");

        List<Music> list = new ArrayList<>();
        list.addAll(Arrays.asList(pyro, theAfternoonsHat));
        return ResponseEntity.ok().body(list);
    }
}
