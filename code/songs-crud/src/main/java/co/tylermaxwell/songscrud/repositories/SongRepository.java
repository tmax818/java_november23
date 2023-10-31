package co.tylermaxwell.songscrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.songscrud.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
    List<Song> findAll();    
}
