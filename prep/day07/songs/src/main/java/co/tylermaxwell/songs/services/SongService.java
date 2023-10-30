package co.tylermaxwell.songs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.songs.models.Song;
import co.tylermaxwell.songs.repositories.SongRepository;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    public void addSong(Song song) {
        songRepository.save(song);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
        
    }

    public Song getOneSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        return optionalSong.orElse(null);
    }

    public void updateSong(Song song) {
        songRepository.save(song);
    }
    
}
