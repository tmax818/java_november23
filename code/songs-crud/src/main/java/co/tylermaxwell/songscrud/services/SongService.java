package co.tylermaxwell.songscrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.songscrud.models.Song;
import co.tylermaxwell.songscrud.repositories.SongRepository;

@Service
public class SongService {

    // private final SongRepository songRepository;

    // public SongService(SongRepository songRepository) {
    //     this.songRepository = songRepository;
    // }


    @Autowired
    SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public void addSong(Song song) {
        songRepository.save(song);
    }

    public Song getOneSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        return optionalSong.orElse(null);
    }

    public void updateSong(Song song) {
        songRepository.save(song);
    }

}
