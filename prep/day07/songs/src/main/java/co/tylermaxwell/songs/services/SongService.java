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

    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    public void updateSongById(Song song, Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()){
            System.out.println(optionalSong);
            Song uSong = optionalSong.get();
            System.out.println(uSong);
            uSong.setArtist(song.getArtist());
            uSong.setTitle(song.getTitle());
            songRepository.save(uSong);
        } else {
            this.createSong(song);
        }
            
    }

    public void destroySong(Long id) {
        songRepository.deleteById(id);
    }
    
}
