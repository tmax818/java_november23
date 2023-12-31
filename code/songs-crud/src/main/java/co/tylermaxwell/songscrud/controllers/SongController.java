package co.tylermaxwell.songscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.songscrud.models.Artist;
import co.tylermaxwell.songscrud.models.Song;
import co.tylermaxwell.songscrud.services.ArtistService;
import co.tylermaxwell.songscrud.services.SongService;
import jakarta.validation.Valid;


@Controller
public class SongController {

    @Autowired
    SongService songService;

    @Autowired
    ArtistService artistService;

    //! CREATE

    @GetMapping("/songs/new")
    public String newSong(@ModelAttribute Song song, Model model){
        List<Artist> artists = artistService.getAllArtists();
        System.out.println(artists);
        model.addAttribute("artists", artists);
        return "songs/new";
    }

    @PostMapping("/songs")
    public String createSong(@Valid Song song, BindingResult result, Model model){
        if(result.hasErrors()){
            List<Song> songs = songService.getAllSongs();
            model.addAttribute("songs", songs);
            return "songs/new";
        } else {
            songService.addSong(song);
        }

        return "redirect:/";
    }

    //! READ ALL
    
    @GetMapping("/")
    public String index(Model model, Song song){
        List<Song> songs = songService.getAllSongs();
        model.addAttribute("songs", songs);
        return "songs/index";
    }
    
    
    //! READ ONE

    @GetMapping("/songs/{id}")
    public String show(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        model.addAttribute("song", song);
        return "songs/show";
    }
    
    
    //! UPDATE
    
    @GetMapping("/songs/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        model.addAttribute("song", song);
        return "songs/edit";
    }

    @PutMapping("/songs/{id}")
    public String update(Song song){
        System.out.println(song);
        songService.updateSong(song);
        return "redirect:/";
    }


    //! DELETE

    @DeleteMapping("/songs/{id}")
    public String deleteSong(@PathVariable Long id){
        songService.destroySong(id);
        return "redirect:/";
    }

}
