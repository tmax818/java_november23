package co.tylermaxwell.songs.controllers;

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

import co.tylermaxwell.songs.models.Artist;
import co.tylermaxwell.songs.models.Song;
import co.tylermaxwell.songs.services.ArtistService;
import co.tylermaxwell.songs.services.SongService;
import jakarta.validation.Valid;



@Controller
public class SongController {

    @Autowired
    SongService songService;

    @Autowired
    ArtistService artistService;

    //! CREATE and READ ALL
    
    @GetMapping("/songs")
    public String index(@ModelAttribute Song song, Model model){
        List<Song> songs = songService.getAllSongs();
        model.addAttribute("songs", songs);
        List<Artist> artists = artistService.getAllArtists();
        model.addAttribute("artists", artists);
        System.out.println(songs);
        return "songs/index.jsp";
    }
    
    @PostMapping(value="/songs")
    public String addSong(@Valid Song song, BindingResult result, Model model){
        System.out.println(result.hasErrors());
        if(result.hasErrors()){
            List<Song> songs = songService.getAllSongs();
            model.addAttribute("songs", songs);
            model.addAttribute("result", result);
            return "songs/index.jsp";
        }
        songService.addSong(song);
        return "redirect:/songs";
    }
    
    //! READ ONE
    
    @GetMapping("/songs/{id}")
    public String show(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        System.out.println(song);
        model.addAttribute("song", song);
        return "songs/show.jsp";
    }
    
    
    //! UPDATE
    
    @GetMapping("/songs/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Song song = songService.getOneSong(id);
        List<Artist> artists = artistService.getAllArtists();
        model.addAttribute("artists", artists);
        System.out.println(song);
        model.addAttribute("song", song);
        return "songs/edit.jsp";
    }
    
    @PutMapping("/songs/{id}")
    public String update(@Valid @ModelAttribute Song song, BindingResult result, Model model, @PathVariable Long id){
        if(result.hasErrors()){
            Song esong = songService.getOneSong(id);
            List<Artist> artists = artistService.getAllArtists();
            model.addAttribute("esong", esong);
            model.addAttribute("artists", artists);
            // return String.format("redirect:/songs/edit/%d", id);
            return "/songs/edit.jsp";
        }
        songService.updateSong(song);
        return "redirect:/songs";
    }
    

    //! DELETE

    @DeleteMapping("/songs/{id}")
    public String destroy(@PathVariable Long id){
        songService.destroySong(id);
        return "redirect:/songs";
    }
    
    
}
