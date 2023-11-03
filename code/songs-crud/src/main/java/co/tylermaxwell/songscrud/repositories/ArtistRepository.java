package co.tylermaxwell.songscrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.songscrud.models.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    List<Artist> findAll();
    
}
