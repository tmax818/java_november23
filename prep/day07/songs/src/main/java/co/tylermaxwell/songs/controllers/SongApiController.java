package co.tylermaxwell.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.songs.models.Song;
import co.tylermaxwell.songs.services.SongService;

@RestController
@RequestMapping("/api")
public class SongApiController {
    
    @Autowired
    SongService songService;


    //! READ ALL 
    @GetMapping("/songs")
    public List<Song> allsongs(){
        return songService.getAllSongs();
    }

    //! READ ONE
    @GetMapping("/songs/{id}")
    public Song getOne(@PathVariable Long id){
        return songService.getOneSong(id);
    }
}
