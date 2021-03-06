package com.paulozamengo.workshopmongo.repository;

import com.paulozamengo.workshopmongo.domain.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

}
