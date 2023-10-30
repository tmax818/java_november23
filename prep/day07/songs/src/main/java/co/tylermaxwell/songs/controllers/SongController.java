package co.tylermaxwell.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.songs.models.Song;
import co.tylermaxwell.songs.services.SongService;



@Controller
public class SongController {

    @Autowired
    SongService songService;

    //! CREATE and READ ALL
    
    @GetMapping("/")
    public String index(Song song, Model model){
        List<Song> songs = songService.getAllSongs();
        System.out.println(songs);
        model.addAttribute("songs", songs);
        return "index";
    }

    @PostMapping(value="/songs")
    public String addSong(Song song){
        songService.addSong(song);
        return "redirect:/";
    }

    //! READ ONE

    @GetMapping("/songs/{id}")
    public String show(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        System.out.println(song);
        model.addAttribute("song", song);
        return "show";
    }
    
    
    //! UPDATE
    
    @GetMapping("/songs/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        System.out.println(song);
        model.addAttribute("song", song);
        return "edit";
    }

    @PutMapping("/songs/{id}")
    public String update(Song song){
        songService.updateSong(song);
        return "redirect:/";
    }
    

    //! DELETE
    
    
}
