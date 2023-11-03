package co.tylermaxwell.songscrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.songscrud.models.Artist;
import co.tylermaxwell.songscrud.repositories.ArtistRepository;

@Service
public class ArtistService {

    

    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
    
}
