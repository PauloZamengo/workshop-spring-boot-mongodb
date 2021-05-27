package com.paulozamengo.workshopmongo.repository;

import com.paulozamengo.workshopmongo.domain.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends MongoRepository<Artist, String> {

}
