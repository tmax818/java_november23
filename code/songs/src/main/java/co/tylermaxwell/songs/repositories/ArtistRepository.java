package co.tylermaxwell.songs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.songs.models.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    List<Artist> findAll();
    
}
