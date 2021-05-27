package com.paulozamengo.workshopmongo.configuration;

import com.paulozamengo.workshopmongo.domain.Album;
import com.paulozamengo.workshopmongo.domain.Music;
import com.paulozamengo.workshopmongo.repository.AlbumRepository;
import com.paulozamengo.workshopmongo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instatiation implements CommandLineRunner {

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public void run(String... args) throws Exception {

        musicRepository.deleteAll();
        albumRepository.deleteAll();

        Music pyro = new Music(null, "Pyro", "3:52");
        Music theAfternoonsHat = new Music(null, "The Afternoons Hat", "3:25");
        Music fireside = new Music(null, "Fireside", "2:50");

        Album humbug = new Album(null, "Humbug", "capa doida", "rick rubin", "2009-08-01", Arrays.asList(pyro, theAfternoonsHat, fireside));

        musicRepository.saveAll(Arrays.asList(pyro, theAfternoonsHat, fireside));
        albumRepository.saveAll(Arrays.asList(humbug));

    }
}
