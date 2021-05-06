package com.paulozamengo.workshopmongo.repository;

import com.paulozamengo.workshopmongo.domain.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends MongoRepository<Music, String> {


}
