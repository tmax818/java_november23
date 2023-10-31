package co.tylermaxwell.songscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.songscrud.models.Song;
import co.tylermaxwell.songscrud.services.SongService;


@Controller
public class SongController {

    @Autowired
    SongService songService;

    //! CREATE

    @PostMapping("/songs")
    public String createSong(Song song){
        System.out.println(song);
        songService.addSong(song);
        return "redirect:/";
    }

    //! READ ALL
    
    @GetMapping("/")
    public String index(Model model, Song song){
        List<Song> songs = songService.getAllSongs();
        System.out.println(songs);
        model.addAttribute("songs", songs);
        return "index";
    }
    
    
    //! READ ONE

    @GetMapping("/songs/{id}")
    public String show(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        model.addAttribute("song", song);
        return "show";
    }
    
    
    //! UPDATE
    
    @GetMapping("/songs/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        model.addAttribute("song", song);
        return "edit";
    }

    @PutMapping("/songs/{id}")
    public String update(Song song){
        System.out.println(song);
        songService.updateSong(song);
        return "redirect:/";
    }


    //! DELETE

}
