package co.tylermaxwell.songscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.tylermaxwell.songscrud.models.Song;
import co.tylermaxwell.songscrud.services.SongService;


@Controller
public class SongController {

    @Autowired
    SongService songService;

    //! CREATE
    //! READ ALL
    
    @GetMapping("/")
    public String index(Model model){
        List<Song> songs = songService.getAllSongs();
        System.out.println(songs);
        model.addAttribute("songs", songs);
        return "index.jsp";
    }
    
    
    //! READ ONE
    //! UPDATE
    //! DELETE

}
