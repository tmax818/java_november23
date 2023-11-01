package co.tylermaxwell.songscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.songscrud.models.Song;
import co.tylermaxwell.songscrud.services.SongService;

@RestController
@RequestMapping("/api")
public class SongApiController {

    @Autowired
    SongService songService;


    //! READ ALL
    @GetMapping("/songs")
    public List<Song> allSongs(){
        return songService.getAllSongs();
    }

    @GetMapping("/songs/{id}")
    public Song oneSong(@PathVariable long id){
        return songService.getOneSong(id);
    }
    
}