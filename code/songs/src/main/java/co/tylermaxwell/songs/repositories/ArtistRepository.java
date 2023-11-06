package co.tylermaxwell.songs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.songs.models.Artist;
import co.tylermaxwell.songs.models.Song;


public interface ArtistRepository extends CrudRepository<Artist, Long> {
    List<Artist> findAll();
    List<Artist> findBySongsNotContains(Song song);
    
}
