package co.tylermaxwell.songs.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.songs.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
    List<Song> findAll();
    
}
