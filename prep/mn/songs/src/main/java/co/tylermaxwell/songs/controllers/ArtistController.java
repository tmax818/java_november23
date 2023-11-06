package co.tylermaxwell.songs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.songs.models.Artist;
import co.tylermaxwell.songs.services.ArtistService;

@Controller
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("/artists")
    public String addArtist(@ModelAttribute Artist artist, Model model){
        List<Artist> artists = artistService.getAllArtists();
        model.addAttribute("artists", artists);
        return "artists/index.jsp";
    }

    @PostMapping("/artists")
    public String createArtist(@ModelAttribute Artist artist){
        artistService.addArtist(artist);
        return "redirect:/artists";
    }




    
    
}
