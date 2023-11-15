package co.tylermaxwell.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.songs.models.Song;
import co.tylermaxwell.songs.services.SongService;

@RestController
@RequestMapping("/api")
public class SongApiController {
    
    @Autowired
    SongService songService;

    //!CREATE
    @PostMapping("/songs")
    Song newSong(@RequestBody Song song){
        System.out.println(song);
        return songService.createSong(song);
    }

    //! READ ALL 
    @GetMapping("/songs")
    public List<Song> allsongs(){
        List<Song> songs = songService.getAllSongs();
        System.out.println(songs);
        return songs;
    }

    //! READ ONE
    @GetMapping("/songs/{id}")
    public Song getOne(@PathVariable Long id){
        return songService.getOneSong(id);
    }

    //! UPDATE
    @PutMapping("/songs/edit/{id}")
    void updateSong(@RequestBody Song song, @PathVariable Long id){
        System.out.println(song);
        songService.updateSongById(song, id);

    }

    //! DELETE
    @DeleteMapping("/songs/{id}")
    void deleteSong(@PathVariable Long id){
        songService.destroySong(id);
    }
}
